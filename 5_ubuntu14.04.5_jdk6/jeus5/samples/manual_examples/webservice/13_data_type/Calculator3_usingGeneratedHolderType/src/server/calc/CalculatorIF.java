package calc;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.xml.rpc.holders.DoubleHolder;


public interface CalculatorIF extends Remote
{
   public void calc(CalcDataHolder result) throws RemoteException;
}
