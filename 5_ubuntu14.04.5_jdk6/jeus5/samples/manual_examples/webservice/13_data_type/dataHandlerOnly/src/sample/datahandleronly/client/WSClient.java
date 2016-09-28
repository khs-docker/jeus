/*
 * WSClient.java @author mssung (mssung@tmax.co.kr)
 */
package sample.datahandleronly.client;

import sample.datahandleronly.stub.SubmitBook;
import sample.datahandleronly.stub.SubmitBookService_Impl;

import java.io.File;
import java.io.FileInputStream;

import javax.activation.DataHandler;


public class WSClient
{
   public static void main(String[] args)
   {
      WSClient client = new WSClient();

      System.out.println("\n##### Running Webservice Client #####");
      client.run();
      System.out.println("\n##### Done #####");
   }

   public void run()
   {
      try
      {
         // Creates a FileInputStream from the specified path name
         FileInputStream inputStream = new FileInputStream(new File("attachment/book.xml"));
         DataHandler dataHandler = new DataHandler(inputStream, "application/xml");

         // Get a Service port
         SubmitBook port = new SubmitBookService_Impl().getSubmitBookPort();
         String result = port.submit("Sample for a option: datahandleronly", 12.34f, dataHandler);
         System.out.println("response = " + result);
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }
}
