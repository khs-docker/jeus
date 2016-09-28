package j2se;

import echo.DocLitEchoService_Impl;
import echo.Echo;


public class ProxyClient
{
   public static void main(String[] args)
   {
      ProxyClient client = new ProxyClient();
      client.run();
   }

   public void run()
   {
      try
      {
         Echo port = new DocLitEchoService_Impl().getEchoPort();
         String s = port.echoString("JEUS");
         System.out.println("response = " + s);
      }
      catch (Exception e)
      {
         e.printStackTrace();
         System.exit(1);
      }
   }
}
