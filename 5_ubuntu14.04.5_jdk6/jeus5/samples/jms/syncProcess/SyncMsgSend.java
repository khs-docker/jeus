/*
        ## SyncMsgSend.java
*/
package jms.queue;

import java.io.*;

import java.util.*;

import javax.jms.*;

import javax.naming.*;


public class SyncMsgSend
{
   public final static StringBuffer buffer = new StringBuffer();
   private QueueConnectionFactory qconFactory;
   private QueueConnection qcon;
   private QueueSession qsession;
   private QueueSender qsender;
   private javax.jms.Queue queue;
   private MapMessage mapmsg;

   public void init(Context ctx, String queueName) throws NamingException, JMSException
   {
      qconFactory = (QueueConnectionFactory)ctx.lookup("QueueConnectionFactory");
      qcon = qconFactory.createQueueConnection();
      qsession = qcon.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
      queue = (javax.jms.Queue)ctx.lookup(queueName);
      qsender = qsession.createSender(queue);
      mapmsg = qsession.createMapMessage();

      qcon.start();
   }

   public void close() throws JMSException
   {
      qsender.close();
      qsession.close();
      qcon.close();
   }

   public static void main(String[] args) throws Exception
   {
      InitialContext initial = new InitialContext();
      SyncMsgSend sender = new SyncMsgSend();
      sender.init(initial, "ExampleQueue");
      sender.send();
      sender.close();
   }

   public void send() throws JMSException
   {
//		mapmsg.setInt("id", 24);
      mapmsg.setString("name", "John Smith");

//		mapmsg.setDouble("salary", 600.00);
      mapmsg.setString("department", "Human Resources Development");
      qsender.send(mapmsg);
   }
}
