package ejb.basic.messageDriven;

import javax.ejb.*;

import javax.jms.*;

import javax.naming.*;


public class MessageBean implements MessageDrivenBean, MessageListener
{
   private transient MessageDrivenContext messageContext = null;
   private Context context;

   public void setMessageDrivenContext(MessageDrivenContext messageContext)
   {
      this.messageContext = messageContext;
   }

   public void ejbCreate()
   {
   }

   public void onMessage(Message inMessage)
   {
      TextMessage msg = null;

      try
      {
         if (inMessage instanceof TextMessage)
         {
            msg = (TextMessage)inMessage;
            System.out.println("Message: " + msg.getText());
         }
         else
         {
            System.out.println("Message of wrong type: " + inMessage.getClass().getName());
         }
      }
      catch (JMSException ex)
      {
         System.err.println("JMSException: " + ex.toString());
         messageContext.setRollbackOnly();
      }
      catch (Throwable ex)
      {
         System.err.println("Exception: " + ex.toString());
      }
   }

   public void ejbRemove()
   {
   }
}
