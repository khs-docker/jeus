package jms.queue;

import java.util.*;

import javax.jms.*;
import javax.jms.Queue;

import javax.naming.*;


public class QueueBrowse
{
   private QueueConnectionFactory qconFactory;
   private QueueConnection qcon;
   private QueueSession qsession;
   private QueueBrowser qbrowser;
   private javax.jms.Queue queue;

   /*
   * Create connection.
   * Create session from connection; false means session is
   * not transacted.
   * Create Browser.
   * Finally, start connection.
   */
   public void init(Context ctx, String qName) throws NamingException, JMSException
   {
      qconFactory = (QueueConnectionFactory)ctx.lookup("QueueConnectionFactory");
      qcon = qconFactory.createQueueConnection();
      qsession = qcon.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
      queue = (Queue)ctx.lookup(qName);
      qbrowser = qsession.createBrowser(queue);
      qcon.start();
   }

   /*
   * test for look at message on a Queue.
   * The browse methods return a java.util.Enumeration
   * that is used to scan the queue's messages.
   */
   public void browse() throws JMSException
   {
      Enumeration e = qbrowser.getEnumeration();
      Message msg = null;

      if (!e.hasMoreElements())
      {
         System.out.println("There are no messages in this queue..");
      }
      else
      {
         while (e.hasMoreElements())
         {
            msg = (Message)e.nextElement();
            System.out.println("Message " + msg.getJMSMessageID() + " delivered at " + msg.getJMSTimestamp() + " to " + msg.getJMSDestination());
            System.out.print("\tExpires        ");

            if (msg.getJMSExpiration() > 0)
            {
               System.out.println(new Date(msg.getJMSExpiration()));
            }
            else
            {
               System.out.println("never");
            }

            System.out.println("\tPriority       " + msg.getJMSPriority());
            System.out.println("\tMode           " + ((msg.getJMSDeliveryMode() == DeliveryMode.PERSISTENT) ? "PERSISTENT" : "NON_PERSISTENT"));
            System.out.println("\tCorrelation ID " + msg.getJMSCorrelationID());
            System.out.println("\tReply to       " + msg.getJMSReplyTo());
            System.out.println("\tMessage type   " + msg.getJMSType());

            if (msg instanceof TextMessage)
            {
               System.out.println("\tTextMessage    \"" + ((TextMessage)msg).getText() + "\"");
            }
         }
      }
   }

   /**
   * Close any connections opened by the tests.
   */
   public void close() throws JMSException
   {
      qbrowser.close();
      qsession.close();
      qcon.close();
   }

   /**
    * Main method.
    *
    * @param args
    */
   public static void main(String[] args) throws Exception
   {
      Context initial = new InitialContext();
      QueueBrowse qb = new QueueBrowse();
      qb.init(initial, "ExampleQueue");
      qb.browse();
      qb.close();
   }
}
