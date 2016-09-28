package ejb.basic.containerManaged.ejb11;

import java.rmi.*;

import java.util.*;

import javax.ejb.*;

import javax.naming.*;

import javax.rmi.*;


public class Client
{
   private final static String ID = "id";
   private final static String TITLE = "EJB";
   private final static String AUTHOR = "Tmax";
   private final static String PUBLISHER = "TmaxPress";

   public static void main(String[] arg) throws Exception
   {
      int number = 10;

      InitialContext initial = new InitialContext();

      Object objref = initial.lookup("book_bascmp");

      BookHome home = (BookHome)PortableRemoteObject.narrow(objref, BookHome.class);

      System.out.println("<< Container Managed Persistence Entity Bean Test>>\n");
      System.out.println(" < Creating Beans >\n");

      for (int i = 0; i < number; i++)
      {
         home.create(ID + i, TITLE + i, AUTHOR + i, (23.3 * i) + 5, PUBLISHER);
      }

      System.out.println("\n< FindByPrimary Test >");

      for (int i = 0; i < number; i++)
      {
         Book book;
         String tmp;

         book = home.findByPrimaryKey(ID + i);
         tmp = book.getTitle();
         System.out.println(ID + i + "'s titile is " + tmp + " " + TITLE + i);

         tmp = book.getAuthor();
         System.out.println(ID + i + "'s author is " + tmp);

         double tmpDouble = book.getPrice();
         System.out.println(ID + i + "'s price is " + tmp);

         tmp = book.getPublisher();
         System.out.println(ID + i + "'s publisher is " + tmp);

         System.out.println("");
      }

      System.out.println("\n< Total Count of Entity Bean >");

      Collection col = home.findAll();
      System.out.println("Total count is " + col.size());

      System.out.println("\n< Removing all Entity Beans >");

      col = home.findAll();

      Iterator it = col.iterator();

      while (it.hasNext())
      {
         Book book;
         book = (Book)it.next();
         System.out.println("Removing " + book.getTitle());
         book.remove();
      }
   }
}
