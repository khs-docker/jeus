package j2se;

import echo.*;

import javax.xml.rpc.Stub;


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
         Echo port = new BA_DocLitEchoService_Impl().getEchoPort();

         ((Stub)port)._setProperty("javax.xml.rpc.security.auth.username", "jeus");
         ((Stub)port)._setProperty("javax.xml.rpc.security.auth.password", "jeus");

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
