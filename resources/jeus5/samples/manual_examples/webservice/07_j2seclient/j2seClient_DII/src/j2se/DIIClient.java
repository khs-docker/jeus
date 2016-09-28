package j2se;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceFactory;


public class DIIClient
{
   private static final String NS_XSD = "http://www.w3.org/2001/XMLSchema";
   private static final QName QNAME_XSD_STRING = new QName(NS_XSD, "string");

   public void run()
   {
      try
      {
         ServiceFactory factory = ServiceFactory.newInstance();
         String endpoint = "http://localhost:8088/RpcEncEchoService/RpcEncEchoService";
         String targetNamespace = "urn:RpcEncService";
         Service service = factory.createService(new QName(targetNamespace, "RpcEncService"));
         Call call = service.createCall();

         call.setTargetEndpointAddress(endpoint);
         call.setOperationName(new QName(targetNamespace, "echoString"));
         call.addParameter("in0", QNAME_XSD_STRING, ParameterMode.IN);
         call.setReturnType(QNAME_XSD_STRING);

         String ret = (String)call.invoke(new Object[] { "JEUS" });
         System.out.println("response = " + ret);
      }
      catch (Exception e)
      {
         System.err.println(e.toString());
         e.printStackTrace();
      }
   }

   public static void main(String[] args)
   {
      DIIClient client = new DIIClient();

      try
      {
         client.run();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }
}
