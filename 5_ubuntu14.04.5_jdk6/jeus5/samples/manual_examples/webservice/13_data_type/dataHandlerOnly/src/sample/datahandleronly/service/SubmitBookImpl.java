/*
 * SubmitBookImpl.java
 * @author mssung (mssung@tmax.co.kr)
 */
package sample.datahandleronly.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.transform.stream.StreamSource;


public class SubmitBookImpl implements SubmitBook
{
   public String submit(String title, float price, javax.xml.transform.Source attachment) throws java.rmi.RemoteException
   {
      System.out.println("[SubmitBookService] Processing a request...");
      System.out.println("[SubmitBookService]   title=" + title);
      System.out.println("[SubmitBookService]   price=" + price);

      if (attachment instanceof StreamSource)
      {
         System.out.println("[SubmitBookService]   attachment=\n");

         StreamSource ss = (StreamSource)attachment;
         BufferedReader br = new BufferedReader(new InputStreamReader(ss.getInputStream()));

         try
         {
            String line;

            while ((line = br.readLine()) != null)
            {
               System.out.println(line);
            }
         }
         catch (IOException e)
         {
            e.printStackTrace();
         }
      }
      else
      {
         System.out.println("[SubmitBookService]   attachment=" + attachment);
      }

      return "OK!";
   }
}
