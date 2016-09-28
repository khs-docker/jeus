package ejb.relation.mtom;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;


public interface mtmtestHome extends EJBHome
{
   public mtmtest create() throws CreateException, RemoteException;
}
