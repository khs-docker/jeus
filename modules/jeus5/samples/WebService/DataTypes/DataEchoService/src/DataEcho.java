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


public interface DataEcho extends java.rmi.Remote
{
   public String echoString(String str) throws java.rmi.RemoteException;

   public Boolean echoBoolean(Boolean bool) throws java.rmi.RemoteException;

   public Double echoDouble(Double dbl) throws java.rmi.RemoteException;

   public Float echoFloat(Float flt) throws java.rmi.RemoteException;

   public Integer echoInteger(Integer in) throws java.rmi.RemoteException;

   public Byte echoByte(Byte by) throws java.rmi.RemoteException;

   public BigDecimal echoBigDecimal(BigDecimal bd) throws java.rmi.RemoteException;

   public Calendar echoCalendar(Calendar cal) throws java.rmi.RemoteException;
}
