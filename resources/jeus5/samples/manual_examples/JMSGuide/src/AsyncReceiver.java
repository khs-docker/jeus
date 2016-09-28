package sample.manual;

import java.io.*;

import java.util.*;

import javax.jms.*;


/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2002</p>
 * <p>Company: </p>
 * @author unascribed
 * @version 1.0
 */
public class AsyncReceiver implements javax.jms.MessageListener
{
   public AsyncReceiver()
   {
   }

   public void onMessage(Message msg)
   {
      try
      {
         if (msg instanceof TextMessage)
         {
            System.out.println("[1st] TextMessage: " + msg.getJMSMessageID() + ", " + ((TextMessage)msg).getText() + ", " + Thread.currentThread().getName());
         }
         else
         {
            System.out.println("NOT-TEXT Message Received...");
         }
      }
      catch (JMSException ex)
      {
         ex.printStackTrace();
      }
   }
}
