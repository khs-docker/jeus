package jms.queue;

import java.io.*;

import java.util.*;

import javax.jms.*;
import javax.jms.Queue;

import javax.naming.*;

import javax.transaction.*;


public class QueueSend
{
   private QueueConnectionFactory qconFactory;
   private QueueConnection qcon;
   private QueueSession qsession;
   private QueueSender qsender;
   private javax.jms.Queue queue;
   private TextMessage msg;

   /*
   * Create connection.
   * Create session from connection; false means session is
   * not transacted.
   * Create sender and text message.
   * Finally, start connection.
   */
   public void init(Context ctx, String queueName) throws NamingException, JMSException
   {
      // Lookkup ConnectionFactory.	    
      qconFactory = (QueueConnectionFactory)ctx.lookup("QueueConnectionFactory");

      // Create QueueConnection.
      qcon = qconFactory.createQueueConnection();

      // Create QueueSession.
      qsession = qcon.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);

      // Lookkup Destination.
      queue = (Queue)ctx.lookup(queueName);

      // Create AUTO_ACKNOWLEDGE sender.
      qsender = qsession.createSender(queue);

      // Create TextMessage.
      msg = qsession.createTextMessage();

      // Start Connection.	
      qcon.start();
   }

   /**
   * Put to the Messsage Contents and Send Message.
   */
   public void send(String message) throws JMSException
   {
      msg.setText(message);
      qsender.send(msg);
   }

   /**
    * Close any connections opened by the tests.
    */
   public void close() throws JMSException
   {
      qsender.close();
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
      Context ic = new InitialContext();
      QueueSend qs = new QueueSend();
      qs.init(ic, "ExampleQueue");
      readAndSend(qs);
      qs.close();
   }

   /**
   * Read meessage and send.
   */
   private static void readAndSend(QueueSend qs) throws IOException, JMSException
   {
      qs.send("Hello~");
      qs.send("Congratulations!\n\tYou succeed in testing PTP messaging application. ;)");
      qs.send("quit");
   }
}
