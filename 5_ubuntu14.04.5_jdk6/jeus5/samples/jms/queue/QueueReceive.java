package jms.queue;

import java.util.*;

import javax.jms.*;
import javax.jms.Queue;

import javax.naming.*;


public class QueueReceive implements MessageListener
{
   private QueueConnectionFactory qconFactory;
   private QueueConnection qcon;
   private QueueSession qsession;
   private QueueReceiver qreceiver;
   private javax.jms.Queue queue;
   private boolean quit = false;

   /**
   * MessageListener interface.
   */
   public void onMessage(Message msg)
   {
      try
      {
         String msgText;

         if (msg instanceof TextMessage)
         {
            msgText = ((TextMessage)msg).getText();
         }
         else
         {
            msgText = msg.toString();
         }

         System.out.println("Message Received: " + msgText);
      }
      catch (JMSException jmse)
      {
         jmse.printStackTrace();
      }
   }

   /**
   * Create connection.
   * Create session from connection; false means session is
   * not transacted.
   * Create receiver.
   * Finally, start connection.
   */
   public void init(Context ctx, String queueName) throws NamingException, JMSException
   {
      qconFactory = (QueueConnectionFactory)ctx.lookup("QueueConnectionFactory");
      qcon = qconFactory.createQueueConnection();
      qsession = qcon.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
      queue = (Queue)ctx.lookup(queueName);
      qreceiver = qsession.createReceiver(queue);
      qreceiver.setMessageListener(this);
      qcon.start();
   }

   /**
   * Close any connections opened by the tests.
   */
   public void close() throws JMSException
   {
      qreceiver.close();
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
      QueueReceive qr = new QueueReceive();
      qr.init(initial, "ExampleQueue");

      System.out.println("JMS Ready To Receive Messages.");

      // Wait for 20 seconds.
      Thread.sleep(20000);
      qr.close();
   }
}
