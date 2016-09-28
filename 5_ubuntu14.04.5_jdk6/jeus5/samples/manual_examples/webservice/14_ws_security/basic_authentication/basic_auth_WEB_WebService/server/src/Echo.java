package jeustest.webservices.java2wsdl.doclit;

public interface Echo extends java.rmi.Remote
{
   public String echoString(String arg11) throws java.rmi.RemoteException;

   public String echoString_double(String arg1, String arg2) throws java.rmi.RemoteException;
}
