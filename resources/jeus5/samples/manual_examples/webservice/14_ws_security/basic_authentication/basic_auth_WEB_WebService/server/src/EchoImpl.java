package jeustest.webservices.java2wsdl.doclit;

public class EchoImpl implements Echo
{
   public String echoString(String input0) throws java.rmi.RemoteException
   {
      return input0;
   }

   public String echoString_double(String input0, String input1) throws java.rmi.RemoteException
   {
      return input0 + input1;
   }
}
