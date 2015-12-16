package uom.ac.uk.msc.cucumber.ui;

import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.ui.editor.model.edit.DefaultTextEditComposer;

public class GherkinTextEditComposer extends DefaultTextEditComposer {
	@Override
	protected SaveOptions getSaveOptions() {
		System.out.println("### getSaveOptions");
		return SaveOptions.newBuilder().format().getOptions();
	}
}
