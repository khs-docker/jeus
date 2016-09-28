package pkproduct;

import java.rmi.*;

import java.util.*;

import javax.naming.*;


public class ProductClient
{
   public static void main(String[] args)
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

         ProductHome home = (ProductHome)ctx.lookup("ProductBean");

         Product duke = home.create("123", "Ceramic Dog", 10.00);
         System.out.println(duke.getDescription() + ": " + duke.getPrice());
         duke.setPrice(14.00);
         System.out.println(duke.getDescription() + ": " + duke.getPrice());

         Product duke1 = home.create("456", "Wooden Duck", 13.00);
         Product duke2 = home.create("999", "Ivory Cat", 19.00);
         Product duke3 = home.create("789", "Ivory Cat", 33.00);
         Product duke4 = home.create("876", "Chrome Fish", 22.00);

         Product earl = home.findByPrimaryKey(new Pid("876"));
         System.out.println(earl.getDescription() + ": " + earl.getPrice());

         Collection c = home.findByDescription("Ivory Cat");
         Iterator i = c.iterator();

         while (i.hasNext())
         {
            Product product = (Product)i.next();
            Pid pkey = (Pid)product.getPrimaryKey();
            String description = product.getDescription();
            double price = product.getPrice();
            System.out.println(pkey.productID + " : " + description + " " + price);
         }

         c = home.findInRange(10.00, 20.00);
         i = c.iterator();

         while (i.hasNext())
         {
            Product product = (Product)i.next();
            Pid pkey = (Pid)product.getPrimaryKey();
            double price = product.getPrice();
            System.out.println(pkey.productID + " : " + price);
         }

         duke.remove();
         duke1.remove();
         duke2.remove();
         duke3.remove();
         duke4.remove();
      }
      catch (Exception ex)
      {
         ex.printStackTrace();
      }
   }
}
