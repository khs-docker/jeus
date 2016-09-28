package calc;

public class DevideByZeroException extends Exception
{
   String errorMsg;

   DevideByZeroException()
   {
   }

   DevideByZeroException(String errorMsg)
   {
      super(errorMsg);
   }

   public String getErrorMsg()
   {
      return errorMsg;
   }
}
