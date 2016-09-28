package address;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;


public interface AddressBook extends EJBObject
{
   public PersonInfo[] add(PersonInfo pi) throws java.rmi.RemoteException;

   public PersonInfo[] listAll() throws java.rmi.RemoteException;

   public PersonInfo[] delete(String name) throws java.rmi.RemoteException;

   public PersonInfo[] modify(PersonInfo pi) throws java.rmi.RemoteException;

   public PersonInfo view(String name) throws java.rmi.RemoteException;
}
