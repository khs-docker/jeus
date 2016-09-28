/*
 * WSClient.java
 * @author mssung (mssung@tmax.co.kr)
 */
package sample.nodatabinding.client;

import sample.nodatabinding.stub.BookQuote;
import sample.nodatabinding.stub.BookQuoteService_Impl;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPFactory;


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
         // Create a new instance of SOAPFactory
         SOAPFactory factroy = SOAPFactory.newInstance();

         // Create a SOAPElement object 
         SOAPElement book = factroy.createElement("Book", "mh", "http://www.tmaxsoft.com/j2eews/BookQuote");

         SOAPElement title = factroy.createElement("title");
         title.addTextNode("Sample for a option: nodatabinding");
         book.addChildElement(title);

         SOAPElement isbn = factroy.createElement("isbn");
         isbn.addTextNode("123-456-789");
         book.addChildElement(isbn);

         SOAPElement author = factroy.createElement("author");
         author.addTextNode("Tmax Soft Co., Ltd.");
         book.addChildElement(author);

         // Get a Service port
         BookQuote port = new BookQuoteService_Impl().getBookQuotePort();
         SOAPElement price = port.getBookPrice(book);
         System.out.println("price = " + price.getValue());
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }
}
