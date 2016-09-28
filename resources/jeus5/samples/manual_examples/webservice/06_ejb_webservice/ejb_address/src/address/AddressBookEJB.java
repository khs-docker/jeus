package address;

import address.impl.*;

import java.rmi.RemoteException;

import javax.ejb.SessionBean;
import javax.ejb.SessionContext;


public class AddressBookEJB implements SessionBean
{
   private SessionContext ctx;
   private AddressBookImpl impl = new AddressBookImpl();

   public AddressBookEJB()
   {
   }

   public PersonInfo[] add(PersonInfo pi)
   {
      return impl.add(pi);
   }

   public PersonInfo[] delete(String name)
   {
      return impl.delete(name);
   }

   public PersonInfo[] modify(PersonInfo pi)
   {
      return impl.modify(pi);
   }

   public PersonInfo view(String name)
   {
      return impl.view(name);
   }

   public PersonInfo[] listAll()
   {
      return impl.listAll();
   }

   public void ejbCreate()
   {
      System.out.println("AddressBookEJB#ejbCreate() called");
   }

   public void ejbRemove()
   {
      System.out.println("AddressBookEJB#ejbRemove() called");
   }

   public void ejbActivate()
   {
      System.out.println("AddressBookEJB#ejbActivate() called");
   }

   public void ejbPassivate()
   {
      System.out.println("AddressBookEJB#ejbPassivate() called");
   }

   public void setSessionContext(SessionContext sc)
   {
      System.out.println("AddressBookEJB#setSessionContext() called");
      ctx = sc;
   }
}
