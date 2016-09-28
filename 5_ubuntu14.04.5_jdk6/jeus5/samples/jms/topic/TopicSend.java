package jms.topic;

import java.io.*;

import java.util.*;

import javax.jms.*;

import javax.naming.*;

import javax.transaction.*;


public class TopicSend
{
   protected TopicConnectionFactory tconFactory;
   protected TopicConnection tcon;
   protected TopicSession tsession;
   protected TopicPublisher tpublisher;
   protected Topic topic;
   protected TextMessage msg;

   public void init(Context ctx, String topicName) throws NamingException, JMSException
   {
      tconFactory = (TopicConnectionFactory)ctx.lookup("TopicConnectionFactory");
      tcon = tconFactory.createTopicConnection();
      tsession = tcon.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
      topic = (Topic)ctx.lookup(topicName);
      tpublisher = tsession.createPublisher(topic);
      msg = tsession.createTextMessage();
      tcon.start();
   }

   public void send(String message) throws JMSException
   {
      msg.setText(message);
      tpublisher.publish(msg);
   }

   public void close() throws JMSException
   {
      tpublisher.close();
      tsession.close();
      tcon.close();
   }

   public static void main(String[] args) throws Exception
   {
      Context initial = new InitialContext();
      TopicSend ts = new TopicSend();
      ts.init(initial, "ExampleTopic");
      readAndSend(ts);
      ts.close();
   }

   protected static void readAndSend(TopicSend ts) throws IOException, JMSException
   {
      ts.send("Hello~");
      ts.send("Congratulations!\n\tYou succeed in testing pub/sub messaging application. ;)");
      ts.send("quit");
   }
}
