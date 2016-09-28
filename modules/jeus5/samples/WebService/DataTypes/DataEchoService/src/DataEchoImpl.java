package com.tmax.qa.datatypes;


/**
 * <p>Title: JEUS Web Service DataEchoService Program</p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: TmaxSoft Co., Ltd.</p>
 * @author Go, Seoung Hyun
 * @version 1.0
 */
import java.math.*;

import java.util.*;


public class DataEchoImpl implements DataEcho
{
   /**
    * Request and Response String Type
    */
   public String echoString(String str) throws java.rmi.RemoteException
   {
      return str;
   }

   /**
    * Request and Response Boolean Type
    */
   public Boolean echoBoolean(Boolean bool) throws java.rmi.RemoteException
   {
      return bool;
   }

   /**
    * Request and Response Double Type
    */
   public Double echoDouble(Double dbl) throws java.rmi.RemoteException
   {
      return dbl;
   }

   /**
    * Request and Response Float Type
    */
   public Float echoFloat(Float flt) throws java.rmi.RemoteException
   {
      return flt;
   }

   /**
    * Request and Response Integer Type
    */
   public Integer echoInteger(Integer in) throws java.rmi.RemoteException
   {
      return in;
   }

   /**
    * Request and Response Byte Type
    */
   public Byte echoByte(Byte by) throws java.rmi.RemoteException
   {
      return by;
   }

   /**
    * Request and Response Decimal Type
    */
   public BigDecimal echoBigDecimal(BigDecimal bd) throws java.rmi.RemoteException
   {
      return bd;
   }

   /**
    * Request and Response Datetime Type
    */
   public Calendar echoCalendar(Calendar cal) throws java.rmi.RemoteException
   {
      return cal;
   }
}
