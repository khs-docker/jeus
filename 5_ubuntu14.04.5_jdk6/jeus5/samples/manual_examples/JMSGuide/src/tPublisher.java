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
public class tPublisher
{
   Context ctx = null;
   TopicConnectionFactory tConFactory = null;
   TopicConnection tCon = null;
   TopicSession tSes = null;
   Topic topic = null;
   TopicPublisher tpublisher = null;

   public tPublisher()
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
         tpublisher = tSes.createPublisher(topic);
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot create TopicPublisher :" + ex.toString());
         System.exit(1);
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

   public void publishToTopic()
   {
      TextMessage textMsg = null;

      try
      {
         textMsg = tSes.createTextMessage("Hello World!");
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot create TextMessage :" + ex.toString());
         System.exit(1);
      }

      try
      {
         tpublisher.publish(textMsg);
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot publish TextMessage :" + ex.toString());
         System.exit(1);
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
      tPublisher publisher = new tPublisher();
      publisher.initResource();
      publisher.startConnection();
      publisher.publishToTopic();
      publisher.releaseResource();
   }
}
