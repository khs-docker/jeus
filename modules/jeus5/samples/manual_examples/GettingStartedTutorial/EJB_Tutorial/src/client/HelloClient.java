package hello;

import java.lang.*;

import java.net.*;

import java.rmi.*;
import java.rmi.server.*;

import java.util.*;

import javax.ejb.*;

import javax.naming.*;


public class HelloClient
{
   HelloHome home = null;
   Hello obj = null;

   private void run()
   {
      try
      {
         if (System.getSecurityManager() == null)
         {
            System.setSecurityManager(new RMISecurityManager());
         }

         Hashtable env = new Hashtable();
         env.put(Context.INITIAL_CONTEXT_FACTORY, "jeus.jndi.JEUSContextFactory");

         InitialContext ctx = new InitialContext(env);

         // basic test
         home = (HelloHome)ctx.lookup("HelloApp");
         System.out.println("lookup done");
         obj = (Hello)home.create();
         System.out.println("create()" + obj);

         String s = obj.sayHello();
         System.out.println("method()" + s);
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }

   public static void main(String[] args)
   {
      HelloClient hclient = new HelloClient();
      hclient.run();
   }
}
