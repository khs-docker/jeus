import ping.*;

import java.rmi.Remote;
import java.rmi.RemoteException;


public class PingClient
{
   public static void main(String[] args)
   {
      new PingClient().run();
   }

   private void run()
   {
      try
      {
         Ping port = new PingSSLSecurityService_Impl().getPingPort();
         String result = port.ping("test message");
         System.out.println("You've got message:" + result);
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }
}
