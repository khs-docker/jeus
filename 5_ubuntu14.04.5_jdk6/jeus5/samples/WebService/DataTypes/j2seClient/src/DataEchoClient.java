package com.tmax.webservice.datatype;

import java.lang.*;

import java.math.*;

import java.util.*;

/*
 * Created on 2005. 2. 01.
 * @autor powflash@tmax.co.kr
 */
import javax.xml.rpc.soap.SOAPFaultException;


public class DataEchoClient
{
   public static void main(String[] argv)
   {
      try
      {
         DataEcho port = new DataEchoService_Impl().getDataEchoPort();
         String s = port.echoString("JEUS");
         Boolean b = port.echoBoolean(new Boolean("FALSE"));
         Double d = port.echoDouble(new Double("3.0"));
         Float f = port.echoFloat(new Float("2.221"));
         Integer i = port.echoInteger(new Integer("6358"));
         Byte by = port.echoByte(new Byte("127"));
         BigDecimal bd = port.echoBigDecimal(new BigDecimal("841"));
         Calendar rightNow = Calendar.getInstance();
         Calendar cl = port.echoCalendar(rightNow);

         System.out.println("response = " + s);
         System.out.println("response = " + b);
         System.out.println("response = " + d);
         System.out.println("response = " + f);
         System.out.println("response = " + i);
         System.out.println("response = " + by);
         System.out.println("response = " + bd);
         System.out.println("response = " + cl.getTime());
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }
}
