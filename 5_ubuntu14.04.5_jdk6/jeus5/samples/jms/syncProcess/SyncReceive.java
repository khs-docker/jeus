/*
        ## SyncReceive.java
*/
package jms.queue;

import java.util.*;

import javax.jms.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class SyncReceive
{
   private QueueConnectionFactory qconfactory = null;
   private QueueConnection qcon = null;
   private QueueSession qsession = null;
   private QueueReceiver qreceiver = null;
   private javax.jms.Queue queue = null;
   private MapMessage mapmsg;

   public void receive() throws NamingException, JMSException
   {
      Context context = new InitialContext();
      qconfactory = (QueueConnectionFactory)context.lookup("QueueConnectionFactory");
      qcon = qconfactory.createQueueConnection();
      qcon.start();
      queue = (javax.jms.Queue)context.lookup("ExampleQueue");
      qsession = (QueueSession)qcon.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);

      // Create the QueueReceiver.       
      qreceiver = qsession.createReceiver(queue);

      //MapMessage mapmsg;
      while (true)
      {
         try
         {
            mapmsg = (MapMessage)qreceiver.receive(60000); // timeout of 60 seconds
         }
         catch (Exception e)
         {
            System.out.println("Failed to receive map message: " + e.getMessage());

            return;
         }

         if (mapmsg != null)
         {
            try
            {
               Enumeration e = mapmsg.getMapNames();

               while (e.hasMoreElements())
               {
                  String name = (String)e.nextElement();
                  System.out.println(name + " : " + mapmsg.getObject(name));
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
         }
         else
         {
            System.out.println("There is no message in the queue.");

            break;
         }
      }
   }

   public static void main(String[] args) throws Exception
   {
      SyncReceive receiver = new SyncReceive();
      receiver.receive();
   }
}
