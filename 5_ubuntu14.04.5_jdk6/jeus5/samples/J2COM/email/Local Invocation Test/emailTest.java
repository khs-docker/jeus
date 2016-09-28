package email;

import jeus.com.j2com.*;

public class emailTest
{
	public static void main(String[] args) 
	{

		try {	
			InewMail newMail = new InewMail("Email.newMail");
			newMail.mail("Tmax", "navis");
		} catch (COMException e) { 
			e.printStackTrace();
		}
	}
	
}