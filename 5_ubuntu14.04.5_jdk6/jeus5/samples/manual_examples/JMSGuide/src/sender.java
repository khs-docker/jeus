package sample.manual;

import java.util.*;

import javax.jms.*;

import javax.naming.*;


public class sender
{
   public static void main(String[] args)
   {
      QueueConnection connection = null;

      try
      {
         InitialContext ctx = new InitialContext();

         QueueConnectionFactory connectionFactory = (QueueConnectionFactory)ctx.lookup("QueueConnectionFactory");

         javax.jms.Queue queue = (javax.jms.Queue)ctx.lookup("ExamplesQueue");

         connection = connectionFactory.createQueueConnection();

         QueueSession session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
         QueueSender sender = session.createSender(queue);

         for (int j = 1; j <= 2; j++)
         {
            TextMessage msg = session.createTextMessage();
            msg.setText("'Hello World " + j + " '...");
            System.out.println("sending a TextMessage " + (String)(msg.getText()));
            sender.send(msg);
         }

         ObjectMessage msg = session.createObjectMessage(new String("sending a Non-TextMessage meaning sending ends..."));
         System.out.println((String)(msg.getObject()));
         sender.send(msg);
      }
      catch (JMSException ex)
      {
         ex.printStackTrace();
      }
      catch (Exception ex)
      {
         ex.printStackTrace();
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
