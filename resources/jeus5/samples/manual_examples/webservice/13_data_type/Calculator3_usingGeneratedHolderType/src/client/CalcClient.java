import com.test.calc.*; // import generated classes by wsdl2java

import com.test.calc.holders.*; // import generated classes by wsdl2java


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
      catch (Exception e)
      {
         System.err.println(e.toString());
         e.printStackTrace();
      }
   }

   public void run(String[] args) throws Exception
   {
      CalculatorIF port = new Calculator3Service_Impl().getCalculatorIFPort();
      CalcData data = new CalcData();
      CalcDataHolder dataHolder = new CalcDataHolder(data);

      data.setNum1((new Double(args[0])).doubleValue());
      data.setNum2((new Double(args[2])).doubleValue());
      data.setOp(args[1]);

      port.calc(dataHolder);
      System.out.println(dataHolder.value.getResult());
   }
}
