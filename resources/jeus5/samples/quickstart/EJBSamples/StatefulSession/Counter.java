package ejb.basic.statefulSession;

import java.rmi.RemoteException;

import java.util.Vector;

import javax.ejb.*;


public interface Counter extends EJBObject
{
   public void increase() throws RemoteException;

   public void decrease() throws RemoteException;

   public int getCount() throws RemoteException;
}
