package email;

import jeus.com.j2com.*;

public class emailTest
{
	public static void main(String[] args) 
	{
	
		String[] arg = { "Tmax", "navis" };
		try {	
			String progid = "Email.newMail";
			COMManager.invoke("COMServer1", progid, "mail", arg );
		} catch ( COMException e) { 
			e.printStackTrace();
		}

	}
}