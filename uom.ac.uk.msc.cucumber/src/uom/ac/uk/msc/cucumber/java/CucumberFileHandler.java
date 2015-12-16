package uom.ac.uk.msc.cucumber.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import uom.ac.uk.msc.cucumber.GherkinRuntimeModule;
import uom.ac.uk.msc.cucumber.gherkin.Feature;
import uom.ac.uk.msc.cucumber.gherkin.GherkinPackage;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class CucumberFileHandler {

	public static String featureFileLocation(Feature feature)
			throws IOException {
		String path = feature.eResource().getURI().toPlatformString(true);
		return path;
	}

	public static ArrayList<CucumberWrapper> loadFeatureFilesAndCheckForDuplicateFeatureTitles(
			Feature feature) throws FileNotFoundException, IOException,
			Exception {
		ArrayList<CucumberWrapper> listOfCucumberWrappers = new ArrayList<CucumberWrapper>();
		try {

			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			String location = featureFileLocation(feature);
			IPath iPath = new Path(location);
			IFile iFile = root.getFile(iPath);

			if (iFile != null && iFile.getLocation() != null) {

				File currentFile = iFile.getLocation().toFile();
				String parentDirectory = currentFile.getAbsolutePath()
						.substring(
								0,
								currentFile.getAbsolutePath().lastIndexOf(
										File.separator));
				File folder = new File(parentDirectory);

				String finalDuplicationMessage = "";
				String finalSimilarityMessage = "";
				boolean areThereDuplicates = false;
				boolean areThereSimilarities = false;

				for (final File fileEntry : folder.listFiles()) {

					if (fileEntry.getName().endsWith("feature")
							&& !fileEntry.getName().equals(
									currentFile.getName())) {

						Injector injector = Guice
								.createInjector(new GherkinRuntimeModule());
						XtextResourceSet resourceSet = injector
								.getInstance(XtextResourceSet.class);
						resourceSet.addLoadOption(
								XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
						Resource resource = resourceSet.getResource(
								URI.createURI("platform:/resource"
										+ location.substring(0,
												location.lastIndexOf("/"))
										+ "/" + fileEntry.getName()), true);
						Feature otherFeature = (Feature) resource.getContents()
								.get(0);
						String otherFeatureTitle = CucumberDuplicateChecker
								.removeExtraSpacing(otherFeature.getTitle());
						String featureTitle = CucumberDuplicateChecker
								.removeExtraSpacing(feature.getTitle());

						if (otherFeatureTitle.equalsIgnoreCase(featureTitle)) {
							if (!areThereDuplicates) {
								finalDuplicationMessage += CucumberMessageConstants.FEATURES_HAVE_TO_BE_UNIQUE
										.getMsg() + currentFile.getName();
							}

							finalDuplicationMessage += ", "
									+ fileEntry.getName();

							areThereDuplicates = true;
						} else if (CucumberDuplicateChecker.isSimilar(
								otherFeatureTitle, featureTitle)) {
							if (!areThereSimilarities) {
								finalSimilarityMessage += CucumberMessageConstants.SIMILAR_FEATURE_TITLES
										.getMsg() + currentFile.getName();
							}

							finalSimilarityMessage += ", "
									+ fileEntry.getName();

							areThereSimilarities = true;
						}

					}

				}

				if (areThereDuplicates) {
					CucumberWrapper wrapper = new CucumberWrapper(feature,
							feature.getTitle(),
							GherkinPackage.Literals.FEATURE__TITLE,
							CucumberCodeConstants.FEATURES_HAVE_TO_BE_UNIQUE
									.getCode(), finalDuplicationMessage);
					listOfCucumberWrappers.add(wrapper);
				} else if (areThereSimilarities) {
					CucumberWrapper wrapper = new CucumberWrapper(feature,
							GherkinPackage.Literals.FEATURE__TITLE,
							CucumberCodeConstants.SIMILAR_FEATURE_TITLES
									.getCode(), finalSimilarityMessage);
					listOfCucumberWrappers.add(wrapper);
				}

			}

		} catch (IllegalStateException ise) {
			System.out.println("workspace is closed. halting for now...");
		}
		return listOfCucumberWrappers;
	}
}
