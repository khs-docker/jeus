package ejb.basic.messageDriven;

import javax.jms.*;

import javax.naming.*;


public class Client
{
   public static void main(String[] args)
   {
      Context jndiContext = null;
      QueueConnectionFactory connectionFactory = null;
      QueueConnection connection = null;
      QueueSession session = null;
      Queue queue = null;
      QueueSender sender = null;
      TextMessage message = null;
      final int NUM_MSGS = 3;

      try
      {
         jndiContext = new InitialContext();
      }
      catch (NamingException e)
      {
         System.out.println("Could not create JNDI API " + "context: " + e.toString());
         System.exit(1);
      }

      try
      {
         connectionFactory = (QueueConnectionFactory)jndiContext.lookup("QueueConnectionFactory");
         queue = (Queue)jndiContext.lookup("ExamplesQueue");
      }
      catch (NamingException e)
      {
         System.out.println("JNDI API lookup failed: " + e.toString());
         System.exit(1);
      }

      try
      {
         connection = connectionFactory.createQueueConnection();
         session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
         sender = session.createSender(queue);
         message = session.createTextMessage();

         for (int i = 0; i < NUM_MSGS; i++)
         {
            message.setText("This is message " + (i + 1));
            System.out.println("Sending message: " + message.getText());
            sender.send(message);
         }
      }
      catch (JMSException e)
      {
         System.out.println("Exception occurred: " + e.toString());
      }
      finally
      {
         if (connection != null)
         {
            try
            {
               connection.close();
            }
            catch (JMSException e)
            {
            }
         }
      }
   }
}
