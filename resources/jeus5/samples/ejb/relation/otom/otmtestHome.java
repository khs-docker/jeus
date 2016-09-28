package ejb.relation.otom;

import java.rmi.*;

import java.util.*;

import javax.ejb.*;


public interface otmtestHome extends javax.ejb.EJBHome
{
   public otmtest create() throws CreateException, RemoteException;
}
