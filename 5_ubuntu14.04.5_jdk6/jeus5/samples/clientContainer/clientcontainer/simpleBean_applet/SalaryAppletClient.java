package simpleBean;

import java.awt.*;
import java.applet.*;

import java.util.*;
import java.sql.*;
import javax.sql.*;

import javax.ejb.*;
import javax.naming.*;
import javax.naming.InitialContext;

public class SalaryAppletClient extends Applet
{

	TextArea ta;

	public void start() {
		ta = new TextArea(5, 30);
		add(ta);
		execute();
	}
	public void execute() {
		try {
			InitialContext ctx = new InitialContext();

			SalaryHome home = (SalaryHome)ctx.lookup("Salary");
			Salary bean = home.create();

			try  {
				ta.append("Monthly net salary: " + bean.calculateSalary(28000, 2, 500));
			}
			catch (SQLException se) {
				System.out.println("SQLException: " + se);
			}
		}
		catch (javax.naming.NamingException ne) {
			System.out.println("Naming Exception caught: " + ne);
		}
		catch (javax.ejb.CreateException ce) {
			System.out.println("Create Exception caught: " + ce);
		}
		catch (java.rmi.RemoteException re) {
			System.out.println("Remote Exception caught: " + re);
		}
	}
}
