package calc;

import java.rmi.RemoteException;


public class Calculator
{
   public Calculator()
   {
   }

   public double calc(CalcData data) throws RemoteException, DevideByZeroException
   {
      String op = data.getOp();
      double num1 = data.getNum1();
      double num2 = data.getNum2();
      double ret = 0;

      if (op.equals("plus"))
      {
         ret = num1 + num2;
      }
      else if (op.equals("minus"))
      {
         ret = num1 - num2;
      }
      else if (op.equals("mult"))
      {
         ret = num1 * num2;
      }
      else if (op.equals("div"))
      {
         if (num2 != 0)
         {
            ret = num1 / num2;
         }
         else
         {
            throw new DevideByZeroException("divide by zero");
         }
      }
      else
      {
         throw new RemoteException("invalid opertion : " + op);
      }

      return ret;
   }
}
