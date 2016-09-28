package ejb.ejbql.basic;

import javax.ejb.EntityBean;
import javax.ejb.EntityContext;


public abstract class BookEJB implements EntityBean
{
   public BookEJB()
   {
   }

   public String ejbCreate(String code, String title, String author, double price, String publisher)
   {
      setCode(code);
      setTitle(title);
      setAuthor(author);
      setPrice(price);
      setPublisher(publisher);

      return null;
   }

   public void ejbPostCreate(String code, String title, String author, double price, String publisher)
   {
   }

   public abstract String getCode();

   public abstract void setCode(String code);

   public abstract String getTitle();

   public abstract void setTitle(String title);

   public abstract String getAuthor();

   public abstract void setAuthor(String author);

   public abstract double getPrice();

   public abstract void setPrice(double price);

   public abstract String getPublisher();

   public abstract void setPublisher(String publisher);

   public String toBookString()
   {
      return getCode() + "- [" + getTitle() + "] by " + getAuthor() + " | " + getPrice() + " | " + getPublisher();
   }

   public void setEntityContext(EntityContext ctx)
   {
   }

   public void unsetEntityContext()
   {
   }

   public void ejbLoad()
   {
   }

   public void ejbStore()
   {
   }

   public void ejbActivate()
   {
   }

   public void ejbPassivate()
   {
   }

   public void ejbRemove()
   {
   }
}
