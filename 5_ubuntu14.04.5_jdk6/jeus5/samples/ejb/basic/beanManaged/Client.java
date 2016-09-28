package ejb.basic.beanManaged;

import java.rmi.*;

import java.util.*;

import javax.naming.*;

import javax.rmi.*;


public class Client
{
   public static int NUMBER = 20;

   public static void main(String[] args) throws Exception
   {
      InitialContext initial = new InitialContext();

      Object objref = initial.lookup("product");

      ProductHome home = (ProductHome)PortableRemoteObject.narrow(objref, ProductHome.class);

      System.out.println("<< Bean Managed Persistence Entity Bean Test>>\n");

      Product[] products = new Product[NUMBER];

      // create products
      for (int i = 0; i < (NUMBER / 2); i++)
      {
         products[i] = home.create(i + "b", "ball pen", i * 10);
      }

      for (int i = NUMBER / 2; i < NUMBER; i++)
      {
         products[i] = home.create(i + "f", "fountain pen", (i - (NUMBER / 3)) * 50);
      }

      // print out product name and prices
      System.out.println("<All the products>");

      for (int i = 0; i < NUMBER; i++)
      {
         System.out.println("[" + products[i].getPrimaryKey() + "] " + products[i].getName() + " (" + products[i].getPrice() + ")");
      }

      System.out.println("");

      // find products of price between 80 and 200
      System.out.println("<Product data of price between 80.00 and 200.00>");

      Collection c = home.findInPriceRange(80.00, 200.00);

      if (c == null)
      {
         System.out.println("No product data of price between 80.00 and 200.00");
      }

      else
      {
         Iterator it = c.iterator();

         while (it.hasNext())
         {
            Product product = (Product)PortableRemoteObject.narrow(it.next(), Product.class);

            System.out.println("[" + product.getPrimaryKey() + "] " + product.getName() + " (" + product.getPrice() + ")");
         }
      }

      // remove data
      for (int i = 0; i < NUMBER; i++)
      {
         products[i].remove();
      }
   }
}
