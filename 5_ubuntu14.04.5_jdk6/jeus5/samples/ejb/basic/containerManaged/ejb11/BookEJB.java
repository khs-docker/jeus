package ejb.basic.containerManaged.ejb11;

import java.util.*;

import javax.ejb.CreateException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;


public class BookEJB implements EntityBean
{
   public String code;
   public String title;
   public String author;
   public double price;
   public String publisher;
   private EntityContext ctx;

   public BookEJB()
   {
   }

   public String ejbCreate(String code, String title, String author, double price, String publisher) throws CreateException
   {
      this.code = code;
      this.title = title;
      this.author = author;
      this.price = price;
      this.publisher = publisher;

      return null;
   }

   public void ejbPostCreate(String code, String title, String author, double price, String publisher)
   {
   }

   public String getTitle()
   {
      return title;
   }

   public void setTitle(String title)
   {
      this.title = title;
   }

   public String getAuthor()
   {
      return author;
   }

   public void setAuthor(String author)
   {
      this.author = author;
   }

   public double getPrice()
   {
      return price;
   }

   public void setPrice(double price)
   {
      this.price = price;
   }

   public String getPublisher()
   {
      return publisher;
   }

   public void setPublisher(String publisher)
   {
      this.publisher = publisher;
   }

   public String toBookString()
   {
      return code + "- [" + title + "] by " + author + " | " + price + " | " + publisher;
   }

   public void setEntityContext(EntityContext ctx)
   {
      this.ctx = ctx;
   }

   public void unsetEntityContext()
   {
      ctx = null;
   }

   public void ejbLoad()
   {
   }

   public void ejbStore()
   {
   }

   public void ejbActivate()
   {
      System.out.println("==== ejbActivate ====");

      String pk = (String)ctx.getPrimaryKey();
      this.code = pk;
   }

   public void ejbPassivate()
   {
      System.out.println("==== ejbPassivate ====");
      this.code = null;
      this.title = null;
      this.author = null;
      this.publisher = null;
   }

   public void ejbRemove()
   {
      System.out.println("==== ejbRemove ====");
   }
}
