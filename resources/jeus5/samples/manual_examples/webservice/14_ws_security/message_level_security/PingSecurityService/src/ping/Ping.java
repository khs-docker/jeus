package ping;

public interface Ping extends java.rmi.Remote
{
   public String ping(String arg) throws java.rmi.RemoteException;
}
