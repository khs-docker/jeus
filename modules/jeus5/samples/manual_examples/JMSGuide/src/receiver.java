package sample.manual;

import java.util.*;

import javax.jms.*;

import javax.naming.*;


public class receiver
{
   public static void main(String[] args)
   {
      int ackMode = Session.AUTO_ACKNOWLEDGE;

      QueueConnection connection = null;

      try
      {
         InitialContext ctx = new InitialContext();

         QueueConnectionFactory connectionFactory = (QueueConnectionFactory)ctx.lookup("QueueConnectionFactory");

         javax.jms.Queue queue = (javax.jms.Queue)ctx.lookup("ExamplesQueue");

         connection = connectionFactory.createQueueConnection();

         QueueSession session = connection.createQueueSession(false, ackMode);
         QueueReceiver receiver = session.createReceiver(queue);

         connection.start();

         while (true)
         {
            Message msg = receiver.receive();

            if (msg instanceof TextMessage)
            {
               System.out.println("receivng a TextMessage " + ((TextMessage)msg).getText());
            }
            else
            {
               System.out.println("receivng a Non-TextMessage, so receiving is over.");
            }
         }
      }
      catch (JMSException ex)
      {
         ex.printStackTrace();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      finally
      {
         try
         {
            connection.close();
         }
         catch (JMSException ex)
         {
            ex.printStackTrace();
         }
      }
   }
}
