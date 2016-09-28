package ping;

public class PingImpl implements Ping
{
   public String ping(String arg) throws java.rmi.RemoteException
   {
      return arg;
   }
}
