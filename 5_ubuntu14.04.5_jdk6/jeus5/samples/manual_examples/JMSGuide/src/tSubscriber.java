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
public class tSubscriber implements MessageListener
{
   Context ctx = null;
   TopicConnectionFactory tConFactory = null;
   TopicConnection tCon = null;
   TopicSession tSes = null;
   Topic topic = null;
   TopicSubscriber subscriber = null;
   private boolean[] monitor = new boolean[1];

   public tSubscriber()
   {
      monitor[0] = false;
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
         tConFactory = (TopicConnectionFactory)ctx.lookup("TopicConnectionFactory");
      }
      catch (NamingException ex)
      {
         System.err.print("Cannot find TopicConnectionFactory in JNDI :" + ex.toString());
         System.exit(1);
      }

      try
      {
         tCon = tConFactory.createTopicConnection();
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot create TopicConnection :" + ex.toString());
         System.exit(1);
      }

      try
      {
         tSes = tCon.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot create TopicSession :" + ex.toString());
         System.exit(1);
      }

      try
      {
         topic = (Topic)ctx.lookup("ExamplesTopic");
      }
      catch (NamingException ex)
      {
         System.err.println("Cannot find ExamplesTopic in JNDI :" + ex.toString());
         System.exit(1);
      }

      try
      {
         subscriber = tSes.createSubscriber(topic);
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot create Subscriber :" + ex.toString());
         System.exit(1);
      }

      try
      {
         subscriber.setMessageListener(this);
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot register MessageListener :" + ex.toString());
         System.exit(1);
      }
   }

   public void onMessage(javax.jms.Message msg)
   {
      if (msg instanceof TextMessage)
      {
         System.out.println("TextMessage arrived :" + msg);
      }
      else
      {
         System.out.println("Non-TextMessage arrived :" + msg + ", so stop listening");
         allDone();
      }
   }

   public void startConnection()
   {
      try
      {
         tCon.start();
      }
      catch (JMSException e)
      {
         System.err.println("Cannot start TopicConnection :" + e.toString());
         System.exit(1);
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

   public void releaseResource()
   {
      try
      {
         tCon.close();
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot close TopicConnection :" + ex.toString());
      }
   }

   public static void main(String[] args)
   {
      tSubscriber subscriber = new tSubscriber();
      subscriber.initResource();
      subscriber.startConnection();
      subscriber.waitTillDone();
      subscriber.releaseResource();
   }
}
