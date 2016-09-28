package calc;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface CalculatorIF extends Remote
{
   public double calc(CalcData data) throws RemoteException;
}
