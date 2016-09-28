package calc;

public class CalcData
{
   private double num1;
   private double num2;
   private String op;
   private double result;

   public CalcData()
   {
   }

   public double getNum1()
   {
      return num1;
   }

   public double getNum2()
   {
      return num2;
   }

   public String getOp()
   {
      return op;
   }

   public double getResult()
   {
      return result;
   }

   public void setNum1(double n)
   {
      num1 = n;
   }

   public void setNum2(double n)
   {
      num2 = n;
   }

   public void setOp(String s)
   {
      op = s;
   }

   public void setResult(double n)
   {
      result = n;
   }
}
