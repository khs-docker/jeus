package simpleBean;

import java.rmi.RemoteException;

import java.sql.*;

import javax.ejb.EJBObject;


public interface Salary extends EJBObject
{
   public String calculateSalary(int id, int first, int last) throws RemoteException, SQLException;
}
