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
public class qSender
{
   Context ctx = null;
   QueueConnectionFactory qConFactory = null;
   QueueConnection qCon = null;
   QueueSession qSes = null;
   javax.jms.Queue queue = null;
   QueueSender qsender = null;

   public qSender()
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
         qsender = qSes.createSender(queue);
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot create QueueSender :" + ex.toString());
         System.exit(1);
      }
   }

   public void sendToQueue()
   {
      TextMessage textMsg = null;

      try
      {
         textMsg = qSes.createTextMessage("Hello World!");

         //System.out.println("before sending, JMSMessageID:" + textMsg.getJMSMessageID());
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot create TextMessage :" + ex.toString());
         System.exit(1);
      }

      try
      {
         qsender.send(textMsg);

         //System.out.println("after sending, JMSMessageID:" + textMsg.getJMSMessageID());
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot send TextMessage :" + ex.toString());
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
      qSender sender = new qSender();
      sender.initResource();
      sender.startConnection();
      sender.sendToQueue();
      sender.releaseResource();
   }
}
