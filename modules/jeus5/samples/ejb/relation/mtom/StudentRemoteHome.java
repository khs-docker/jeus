package ejb.relation.mtom;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.FinderException;


public interface StudentRemoteHome extends EJBHome
{
   public StudentRemote create(String number, String name) throws CreateException, RemoteException;

   public StudentRemote findByPrimaryKey(String number) throws FinderException, RemoteException;
}
