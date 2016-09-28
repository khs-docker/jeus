/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class FileDialog extends DispatchPtr
{
	public FileDialog(String progid) throws COMException { super(progid);}
	public FileDialog(IUnknown other) throws COMException { super(other);}

	public FileDialog(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public FileDialogExtensionList getExtensions() throws COMException
	{
		return ( new FileDialogExtensionList((DispatchPtr)  get("Extensions")));
	}

	public String getDefaultDirectoryRegKey() throws COMException
	{
		return (String) get("DefaultDirectoryRegKey");
	}

	public void setDefaultDirectoryRegKey(String pString) throws COMException
	{
		put("DefaultDirectoryRegKey", pString);
	}

	public String getDialogTitle() throws COMException
	{
		return (String) get("DialogTitle");
	}

	public void setDialogTitle(String pString) throws COMException
	{
		put("DialogTitle", pString);
	}

	public String getActionButtonName() throws COMException
	{
		return (String) get("ActionButtonName");
	}

	public void setActionButtonName(String pString) throws COMException
	{
		put("ActionButtonName", pString);
	}

	public int getIsMultiSelect() throws COMException
	{
		return ((Integer) get("IsMultiSelect")).intValue();
	}

	public void setIsMultiSelect(int pint) throws COMException
	{
		put("IsMultiSelect", new Integer(pint));
	}

	public int getIsPrintEnabled() throws COMException
	{
		return ((Integer) get("IsPrintEnabled")).intValue();
	}

	public void setIsPrintEnabled(int pint) throws COMException
	{
		put("IsPrintEnabled", new Integer(pint));
	}

	public int getIsReadOnlyEnabled() throws COMException
	{
		return ((Integer) get("IsReadOnlyEnabled")).intValue();
	}

	public void setIsReadOnlyEnabled(int pint) throws COMException
	{
		put("IsReadOnlyEnabled", new Integer(pint));
	}

	public int getDirectoriesOnly() throws COMException
	{
		return ((Integer) get("DirectoriesOnly")).intValue();
	}

	public void setDirectoriesOnly(int pint) throws COMException
	{
		put("DirectoriesOnly", new Integer(pint));
	}

	public int getInitialView() throws COMException
	{
		return ((Integer) get("InitialView")).intValue();
	}

	public void setInitialView(int pint) throws COMException
	{
		put("InitialView", new Integer(pint));
	}

	public void Launch(IUnknown pUnk) throws COMException
	{
		invokeN("Launch", new Object[] {pUnk});
	}

	public String getOnAction() throws COMException
	{
		return (String) get("OnAction");
	}

	public void setOnAction(String pString) throws COMException
	{
		put("OnAction", pString);
	}

	public FileDialogFileList getFiles() throws COMException
	{
		return ( new FileDialogFileList((DispatchPtr)  get("Files")));
	}

	public int getUseODMADlgs() throws COMException
	{
		return ((Integer) get("UseODMADlgs")).intValue();
	}

	public void setUseODMADlgs(int pint) throws COMException
	{
		put("UseODMADlgs", new Integer(pint));
	}


}
