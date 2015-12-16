package uom.ac.uk.msc.cucumber.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;

public class GherkinDocumentProvider extends XtextDocumentProvider {
	private static final String XTEXT_FORMAT_ACTION_COMMAND_ID = "org.eclipse.xtext.ui.FormatAction";

	@Override
	protected void doSaveDocument(IProgressMonitor monitor, Object element,
			IDocument document, boolean overwrite) throws CoreException {
		// auto-format
		IHandlerService service = (IHandlerService) PlatformUI.getWorkbench()
				.getService(IHandlerService.class);
		try {
			service.executeCommand(XTEXT_FORMAT_ACTION_COMMAND_ID, null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// save
		super.doSaveDocument(monitor, element, document, overwrite);
	}
}
