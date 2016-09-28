package ejb.basic.statelessSession;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;


public interface CalcHome extends EJBHome
{
   public Calc create() throws CreateException, RemoteException;
}
