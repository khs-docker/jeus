import com.test.calc.*;


public class CalcClient
{
   public static void main(String[] args)
   {
      CalcClient calc = new CalcClient();

      if (args.length != 3)
      {
         System.out.println("usage: java CalcClient num1 op num2");
         System.out.println(" where op is one of 'plus', 'minus', 'mult', 'div'");
         System.exit(1);
      }

      try
      {
         calc.run(args);
      }
      catch (DevideByZeroException e)
      {
         System.err.println(e.toString());
      }
      catch (Exception e)
      {
         System.err.println(e.toString());
      }
   }

   public void run(String[] args) throws Exception
   {
      CalculatorIF port = new Calculator4Service_Impl().getCalculatorIFPort();
      CalcData data = new CalcData();

      data.setNum1((new Double(args[0])).doubleValue());
      data.setNum2((new Double(args[2])).doubleValue());
      data.setOp(args[1]);

      double ret = port.calc(data);
      System.out.println(ret);
   }
}
