package calc;

import javax.xml.rpc.holders.DoubleHolder;


public class Calculator implements CalculatorIF
{
   public Calculator()
   {
   }

   public void calc(CalcData data, DoubleHolder result)
   {
      String op = data.getOp();
      double num1 = data.getNum1();
      double num2 = data.getNum2();
      double ret = -9999.0;

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
      }

      result.value = ret;
   }
}
