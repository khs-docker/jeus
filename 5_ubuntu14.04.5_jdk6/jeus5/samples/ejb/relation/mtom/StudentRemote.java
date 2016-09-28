package ejb.relation.mtom;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;


public interface StudentRemote extends EJBObject
{
   public String getNumber() throws RemoteException;

   public void setName(String name) throws RemoteException;

   public String getName() throws RemoteException;
}
