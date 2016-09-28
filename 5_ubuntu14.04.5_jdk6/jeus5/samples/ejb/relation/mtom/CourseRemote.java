package ejb.relation.mtom;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;


public interface CourseRemote extends EJBObject
{
   public String getCode() throws RemoteException;

   public void setSubject(String subject) throws RemoteException;

   public String getSubject() throws RemoteException;
}
