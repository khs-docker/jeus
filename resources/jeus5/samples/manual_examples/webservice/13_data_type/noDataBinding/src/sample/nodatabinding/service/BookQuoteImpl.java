/*
 * BookQuoteImpl.java
 * @author mssung (mssung@tmax.co.kr)
 */
package sample.nodatabinding.service;

public class BookQuoteImpl implements BookQuote
{
   public float getBookPrice(Book book) throws java.rmi.RemoteException
   {
      System.out.println("[BookQuoteService] Processing a request...");
      System.out.println("[BookQuoteService]   title=" + book.getTitle());
      System.out.println("[BookQuoteService]   isbn =" + book.getIsbn());
      System.out.println("[BookQuoteService]   author=" + book.getAuthor());

      return 12.34f;
   }
}
