package ejb.ejbql.basic;

import jeus.ejb.bean.objectbase.EJBInstanceFinder;

import java.rmi.RemoteException;

import java.util.*;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.rmi.PortableRemoteObject;


public class Client
{
   public static void main(String[] args)
   {
      try
      {
         InitialContext initial = new InitialContext();
         Object objref = initial.lookup("ejb.ejbql.basic");
         BookHome home = (BookHome)PortableRemoteObject.narrow(objref, BookHome.class);

         for (int i = 10; i > 0; i--)
         {
            Book book = home.create("book" + i, "title", "author", 10 * i, null);
         }

         for (int i = 11; i < 16; i++)
         {
            Book book = home.create("book" + i, "title2", "author" + i, i, "Pub.2");
         }

         for (int i = 16; i < 21; i++)
         {
            Book book = home.create("book" + i, "title", "author3", 5 * i, "Pub.3");
         }

         System.out.println();
         System.out.println("<< Finding Books with title >>");

         Collection col = home.findByTitle("title");
         Iterator it = col.iterator();

         while (it.hasNext())
         {
            Book bk = (Book)it.next();
            System.out.println(bk.toBookString());
         }

         System.out.println();
         System.out.println("<< Finding All Books >>");

         col = home.findAll();
         it = col.iterator();

         while (it.hasNext())
         {
            Book bk = (Book)it.next();
            System.out.println(bk.toBookString());
         }

//
         System.out.println();
         System.out.println("<< Finding All Books with Instance EJB QL >>");

         EJBInstanceFinder finder = (EJBInstanceFinder)home;
         Collection result = finder.findWithInstantQL("SELECT OBJECT(b) FROM Book b WHERE b.price BETWEEN 30.00 AND 100.00 ORDERBY b.price");
         Iterator itt = result.iterator();

         while (itt.hasNext())
         {
            Book bk = (Book)itt.next();
            System.out.println(bk.toBookString());
         }
      }
      catch (Exception e)
      {
         System.out.println("Error caught : " + e.getMessage());
         e.printStackTrace();
      }
   }
}
