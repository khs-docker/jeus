package ejb.relation.otom;

import java.rmi.*;

import java.util.*;

import javax.ejb.*;


public interface otmtest extends javax.ejb.EJBObject
{
   public void testCreateRelation() throws RemoteException;

   public void testCreateRelationWithCollection() throws RemoteException;

   public void testPrintSegment() throws RemoteException;

   public void testChangeRelation() throws RemoteException;

   public void testRemoveWithLocal() throws RemoteException;

   public void testRemoveWithLocalHome() throws RemoteException;
}
