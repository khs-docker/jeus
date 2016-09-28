package sample.manual;

import javax.jms.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2002</p>
 * <p>Company: </p>
 * @author unascribed
 * @version 1.0
 */
import javax.naming.*;


public class qReceiver
{
   Context ctx = null;
   QueueConnectionFactory qConFactory = null;
   QueueConnection qCon = null;
   QueueSession qSes = null;
   javax.jms.Queue queue = null;
   QueueReceiver qreceiver = null;

   public void initResource()
   {
      try
      {
         ctx = new InitialContext();
      }
      catch (NamingException ex)
      {
         System.err.print("Cannot create Context :" + ex.toString());
         System.exit(1);
      }

      try
      {
         qConFactory = (QueueConnectionFactory)ctx.lookup("QueueConnectionFactory");
      }
      catch (NamingException ex)
      {
         System.err.print("Cannot find QueueConnectionFactory in JNDI :" + ex.toString());
         System.exit(1);
      }

      try
      {
         qCon = qConFactory.createQueueConnection();
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot create QueueConnection :" + ex.toString());
         System.exit(1);
      }

      try
      {
         qSes = qCon.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot create QueueSession :" + ex.toString());
      }

      try
      {
         queue = (javax.jms.Queue)ctx.lookup("ExamplesQueue");
      }
      catch (NamingException ex)
      {
         System.err.println("Cannot find ExamplesQueue in JNDI :" + ex.toString());
      }

      try
      {
         qreceiver = qSes.createReceiver(queue);
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot create QueueReceiver :" + ex.toString());
         System.exit(1);
      }
   }

   public void startConnection()
   {
      try
      {
         qCon.start();
      }
      catch (JMSException e)
      {
         System.err.println("Cannot start QueueConnection :" + e.toString());
         System.exit(1);
      }
   }

   public void receiveFromQueue()
   {
      Message msg = null;

      try
      {
         msg = qreceiver.receive();
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot send TextMessage :" + ex.toString());
         System.exit(1);
      }

      System.out.println("Received message : " + msg);
   }

   public void releaseResource()
   {
      try
      {
         qCon.close();
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot close QueueConnection :" + ex.toString());
      }
   }

   public static void main(String[] args)
   {
      final qReceiver receiver = new qReceiver();
      receiver.initResource();
      receiver.startConnection();
      receiver.receiveFromQueue();

      //receiver.releaseResource();
      Runtime.getRuntime().addShutdownHook(new Thread()
         {
            public void run()
            {
               receiver.releaseResource();
            }
         });
   }
}
