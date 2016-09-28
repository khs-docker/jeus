package hello;

import java.lang.*;

import java.rmi.RemoteException;

import javax.ejb.SessionBean;
import javax.ejb.SessionContext;


public class HelloEJB implements SessionBean
{
   public HelloEJB()
   {
   }

   public String sayHello() throws RemoteException
   {
      return "Hello World!";
   }

   public void ejbCreate()
   {
   }

   public void ejbRemove() throws RemoteException
   {
   }

   public void setSessionContext(SessionContext sc)
   {
   }

   public void ejbActivate()
   {
   }

   public void ejbPassivate()
   {
   }
} /* end class HelloEJB */
