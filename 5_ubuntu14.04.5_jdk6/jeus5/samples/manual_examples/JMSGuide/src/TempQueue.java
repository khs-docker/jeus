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
public class TempQueue
{
   public static void main(String[] args) throws JMSException
   {
      Context ctx = null;
      QueueConnectionFactory qConFactory = null;
      QueueConnection qcon = null;

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
         qcon = qConFactory.createQueueConnection();
      }
      catch (JMSException ex)
      {
         System.err.println("Cannot create QueueConnection :" + ex.toString());
         System.exit(1);
      }

      QueueSession session = qcon.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
      javax.jms.Queue tempQueue = session.createTemporaryQueue();
      System.out.println("check temporary queue by jms admin");
      System.out.println(" jndi:" + tempQueue.toString() + ", getQueueName: " + tempQueue.getQueueName());

      QueueSender sender = session.createSender(tempQueue);
      QueueReceiver receiver = session.createReceiver(tempQueue);
      TextMessage text = session.createTextMessage("HELLO CONTINENT... ");

      qcon.start();
      sender.send(text);

      System.out.println("[Sender] sent JMSMessageID :" + text.getJMSMessageID());

      Message msg = receiver.receive();
      System.out.println("[Receiver] receivedJMSMessageID : " + msg.getJMSMessageID() + "," + ((TextMessage)msg).getText());

      if (qcon != null)
      {
         qcon.close();
      }
   }
}
