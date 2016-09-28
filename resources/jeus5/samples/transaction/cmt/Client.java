package transaction.cmt;

import java.util.*;

import javax.naming.*;

import javax.rmi.*;


public class Client
{
   public static void main(String[] args)
   {
      try
      {
         InitialContext initial = new InitialContext();
         Object objref = initial.lookup("productmanager_CMT");
         ProductManagerHome home = (ProductManagerHome)PortableRemoteObject.narrow(objref, ProductManagerHome.class);
         ProductManager productManager = home.create();

         System.out.println("");
         System.out.println("<< Testing ProductManager EJBBean Using Container Managed Transaction >>");
         System.out.println("");

         System.out.println("calling a transactional method ...");
         productManager.transactionTest();
         System.out.println("succeed in completing the transactional method!!");
      }
      catch (Exception e)
      {
         System.out.println("fail to complete the transactional method!!");
         e.printStackTrace();
      }
   }
}
