package pkproduct;

import java.util.*;

import javax.ejb.*;


public class ProductEJB implements EntityBean
{
   public String productID;
   public String description;
   public double price;
   private EntityContext context;

   public void setPrice(double price)
   {
      this.price = price;
   }

   public double getPrice()
   {
      return price;
   }

   public String getDescription()
   {
      return description;
   }

   public Pid ejbCreate(String productID, String description, double price) throws CreateException
   {
      if (productID == null)
      {
         throw new CreateException("The productId is required.");
      }

      this.productID = productID;
      this.description = description;
      this.price = price;

      return null;
   }

   public void setEntityContext(EntityContext context)
   {
      this.context = context;
   }

   public void ejbActivate()
   {
      Pid pkey = (Pid)context.getPrimaryKey();
      productID = pkey.productID;
   }

   public void ejbPassivate()
   {
      productID = null;
      description = null;
   }

   public void ejbRemove()
   {
   }

   public void ejbLoad()
   {
   }

   public void ejbStore()
   {
   }

   public void unsetEntityContext()
   {
   }

   public void ejbPostCreate(String productID, String description, double balance)
   {
   }
}
