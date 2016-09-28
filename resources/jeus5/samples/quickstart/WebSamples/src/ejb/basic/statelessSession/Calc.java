package ejb.basic.statelessSession;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;


public interface Calc extends EJBObject
{
   public double modifiedAdd(double x, double y) throws RemoteException;

   public double add(double x, double y) throws RemoteException;

   public double subtract(double x, double y) throws RemoteException;

   public double multiply(double x, double y) throws RemoteException;

   public double divide(double x, double y) throws RemoteException;
}
