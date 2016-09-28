package calc;

import javax.xml.rpc.holders.Holder;


public class CalcDataHolder implements Holder
{
   public CalcData value;

   public CalcDataHolder()
   {
   }

   public CalcDataHolder(CalcData value)
   {
      this.value = value;
   }
}
