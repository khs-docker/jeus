package simpleBean;

import java.rmi.RemoteException;

import java.util.Collection;

import javax.ejb.*;


public interface SalaryHome extends EJBHome
{
   public Salary create() throws RemoteException, CreateException;
}
