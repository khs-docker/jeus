package ejb.basic.statelessSession;

import java.rmi.*;

import javax.naming.*;

import javax.rmi.*;


public class Client
{
   public static void main(String[] args) throws Exception
   {
      InitialContext initial = new InitialContext();

      Object objref = initial.lookup("ejb.basic.statelessSession");

      CalcHome home = (CalcHome)PortableRemoteObject.narrow(objref, CalcHome.class);

      Calc calc = home.create();

      System.out.println("");

      System.out.println("<< Testing Calc EJBBean Using Stateless Session Bean >>");

      System.out.println("");

      // add
      System.out.println("Adding 11.11 and 22.22..");

      double result = calc.add(11.11, 22.22);

      System.out.println("result : " + result);

      // modified add
      System.out.println("Adding 11.11 and 22.22..");

      result = calc.modifiedAdd(11.11, 22.22);

      System.out.println("result : " + result);

      // subtract
      System.out.println("Subtracting 22.22 from 11.11..");

      result = calc.subtract(11.11, 22.22);

      System.out.println("result : " + result);

      // multiply
      System.out.println("Multiplying 11.11 by 22.22..");

      result = calc.multiply(11.11, 22.22);

      System.out.println("result : " + result);

      // divide
      System.out.println("Dividing 11.11 by 22.22..");

      result = calc.divide(11.11, 22.22);

      System.out.println("result : " + result);
   }
}
