package sample.manual;

import javax.jms.*;

import javax.naming.*;


/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2002</p>
 * <p>Company: </p>
 * @author unascribed
 * @version 1.0
 */
public class qAsyncReceiverClientAck implements MessageListener
{
   Context ctx = null;
   QueueConnectionFactory qConFactory = null;
   QueueConnection qCon = null;
   QueueSession qSes = null;
   javax.jms.Queue queue = null;
   QueueReceiver qreceiver = null;
   private boolean[] monitor = new boolean[1];

   public qAsyncReceiverClientAck()
   {
   }

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
         qSes = qCon.createQueueSession(false, Session.CLIENT_ACKNOWLEDGE);
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

      try
      {
         qreceiver.setMessageListener(this);
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot register MessageListener :" + ex.toString());
         System.exit(1);
      }
   }

   public void onMessage(javax.jms.Message msg)
   {
      try
      {
         if (msg instanceof TextMessage)
         {
            if (!msg.getJMSRedelivered())
            {
               System.out.println("[1st] TextMessage arrived :" + msg);
            }
            else
            {
               System.out.println("[2nd] TextMessage arrived :" + msg);
            }
         }
         else
         {
            if (!msg.getJMSRedelivered())
            {
               System.out.println("[1st] Non-TextMessage arrived :" + msg + ", so recover unacknowledged messages");
               qSes.recover();
            }
            else
            {
               System.out.println("[2nd] Non-TextMessage arrived :" + msg + ", so stop listening");
               msg.acknowledge();
               allDone();
            }
         }
      }
      catch (JMSException e)
      {
         System.err.println("Error in handling onMessage with " + msg.toString() + ": " + e.toString());
         allDone();
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

   private void waitTillDone()
   {
      synchronized (monitor)
      {
         while (!monitor[0])
         {
            try
            {
               monitor.wait();
            }
            catch (InterruptedException ie)
            {
            }
         }
      }
   }

   private void allDone()
   {
      synchronized (monitor)
      {
         monitor[0] = true;
         monitor.notify();
      }
   }

   public static void main(String[] args)
   {
      qAsyncReceiverClientAck receiver = new qAsyncReceiverClientAck();
      receiver.initResource();
      receiver.startConnection();
      receiver.waitTillDone();
      receiver.releaseResource();
   }
}
