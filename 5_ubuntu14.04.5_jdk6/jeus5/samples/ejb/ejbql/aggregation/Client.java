package ejb.ejbql.aggregation;

import java.rmi.RemoteException;

import java.util.*;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.rmi.PortableRemoteObject;


public class Client
{
   public static void main(String[] args) throws Exception
   {
      InitialContext initial = new InitialContext();
      Object objref = initial.lookup("ejb.ejbql.aggregation");
      BookHome home = (BookHome)PortableRemoteObject.narrow(objref, BookHome.class);

      System.out.println("");
      System.out.println("<< Testing Book EJBBean Using Container Managed Persistence Entity Bean (v 2.1) >>");
      System.out.println("");

      System.out.println("< Creating data >");

      Book book1 = home.create("b0647", "Thinking in Java", "Bruce Eckel", 44.99, "Prentice Hall");
      System.out.println("[" + book1.getTitle() + "] by " + book1.getAuthor() + " - List Price : " + book1.getPrice());
      System.out.println("Resetting the price..");
      book1.setPrice(31.49);
      System.out.println("Reset price : " + book1.getPrice());

      Book book2 = home.create("b8345", "Mastering EJB", "Ed Roman, Floyd Marinescu, etc.", 45.00, "John Wiley & Sons");
      Book book3 = home.create("b2786", "Java & XML", "Brett McLaughlin", 44.95, "O'Reilly & Associates");
      Book book4 = home.create("b5057", "EJB Design Patterns", "Ed Roman, Floyd Marinescu", 35.00, "John Wiley & Sons");

      System.out.println("< EJB Home method call >");
      home.test();

      System.out.println("count : " + home.count());
      System.out.println("sum of price : " + home.sumPrice());
      System.out.println("max of price : " + home.maxPrice());
      System.out.println("avg of price : " + home.avgPrice());
      System.out.println("min of title : " + home.minTitle());

      System.out.println("< Removing data >");
      book1.remove();
      book2.remove();
      book3.remove();
      book4.remove();
      System.out.println("Done.");
   }
}
