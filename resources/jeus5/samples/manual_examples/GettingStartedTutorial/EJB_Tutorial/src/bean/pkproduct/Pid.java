package pkproduct;

import java.io.*;


public class Pid implements Serializable
{
   public String productID;

   public Pid()
   {
   }

   public Pid(String s)
   {
      productID = s;
   }

   public boolean equals(Object obj)
   {
      if (obj instanceof Pid)
      {
         if (((Pid)obj).productID.equals(this.productID))
         {
            return true;
         }
      }

      return false;
   }

   public int hashCode()
   {
      return productID.hashCode();
   }
}
