package it.disim.mde2223.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import Web.WebApplication;
import it.disim.mde2223.idelecture.business.Business;

import org.eclipse.jface.dialogs.MessageDialog;

public class SerializeHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		Business bss = new Business("/Juri/jmodel.xmi");
		StringBuilder sb = new StringBuilder();
		sb.append(bss.getPath());
		try {
 			WebApplication model = bss.create();
			bss.serializeModel(model);
			sb.append(" has been created");
			MessageDialog.openInformation(
					window.getShell(),
					"Mde2223",
					sb.toString());
			
		} catch (Exception e) {
			sb.append(" has not been created");
			MessageDialog.openInformation(
					window.getShell(),
					"Mde2223",
					sb.toString());
		}
		return null;
	}
}
