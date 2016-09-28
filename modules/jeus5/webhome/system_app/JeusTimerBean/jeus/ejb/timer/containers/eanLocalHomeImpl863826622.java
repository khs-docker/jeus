package jeus.ejb.timer.containers;

import javax.ejb.*;
import jeus.ejb.bean.*;
import jeus.ejb.bean.objectbase.*;
import jeus.ejb.bean.context.*;
import jeus.util.*;
import jeus.ejb.util.*;

public final class eanLocalHomeImpl863826622 extends jeus.ejb.bean.objectbase.EJBLocalHomeImpl
	implements TimerLocalHome
{
	public eanLocalHomeImpl863826622(){
		super();
	}
	
	public jeus.ejb.timer.containers.TimerLocal create(java.lang.Long arg0, java.lang.String arg1, java.lang.Object arg2, java.util.Date arg3, long arg4, java.io.Serializable arg5) throws javax.ejb.CreateException
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (jeus.ejb.timer.containers.TimerLocal)delegate.__create(arg0, arg1, arg2, arg3, arg4, arg5);
		} catch(javax.transaction.TransactionRolledbackException ex1) {
			if(ex1.detail instanceof java.lang.Exception)
			throw new javax.ejb.TransactionRolledbackLocalException("", (java.lang.Exception)ex1.detail);
			else
			throw new javax.ejb.TransactionRolledbackLocalException("", ex1);
		} catch(javax.transaction.TransactionRequiredException ex2) {
			throw new javax.ejb.TransactionRequiredLocalException(jeus.util.ErrorMsgManager.getLocalizedString(ex2));
		} catch(java.rmi.NoSuchObjectException ex3) {
			if(ex3.detail instanceof java.lang.Exception)
			throw new javax.ejb.NoSuchObjectLocalException("", (java.lang.Exception)ex3.detail);
			else
			throw new javax.ejb.NoSuchObjectLocalException("", ex3);
		} catch(java.rmi.RemoteException ex4) {
			throw new javax.ejb.EJBException("", ex4);
		}
	}
	
	public jeus.ejb.timer.containers.TimerLocal findByPrimaryKey(jeus.ejb.timer.containers.TimerPrimaryKey arg0) throws javax.ejb.FinderException
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (jeus.ejb.timer.containers.TimerLocal)delegate.__findByPrimaryKey(arg0);
		} catch(javax.transaction.TransactionRolledbackException ex1) {
			if(ex1.detail instanceof java.lang.Exception)
			throw new javax.ejb.TransactionRolledbackLocalException("", (java.lang.Exception)ex1.detail);
			else
			throw new javax.ejb.TransactionRolledbackLocalException("", ex1);
		} catch(javax.transaction.TransactionRequiredException ex2) {
			throw new javax.ejb.TransactionRequiredLocalException(jeus.util.ErrorMsgManager.getLocalizedString(ex2));
		} catch(java.rmi.NoSuchObjectException ex3) {
			if(ex3.detail instanceof java.lang.Exception)
			throw new javax.ejb.NoSuchObjectLocalException("", (java.lang.Exception)ex3.detail);
			else
			throw new javax.ejb.NoSuchObjectLocalException("", ex3);
		} catch(java.rmi.RemoteException ex4) {
			throw new javax.ejb.EJBException("", ex4);
		}
	}
	
	public java.util.Set selectTimerIdsByContainer(java.lang.String arg0) throws javax.ejb.FinderException
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (java.util.Set)delegate.__selectTimerIdsByContainer(arg0);
		} catch(javax.transaction.TransactionRolledbackException ex1) {
			if(ex1.detail instanceof java.lang.Exception)
			throw new javax.ejb.TransactionRolledbackLocalException("", (java.lang.Exception)ex1.detail);
			else
			throw new javax.ejb.TransactionRolledbackLocalException("", ex1);
		} catch(javax.transaction.TransactionRequiredException ex2) {
			throw new javax.ejb.TransactionRequiredLocalException(jeus.util.ErrorMsgManager.getLocalizedString(ex2));
		} catch(java.rmi.NoSuchObjectException ex3) {
			if(ex3.detail instanceof java.lang.Exception)
			throw new javax.ejb.NoSuchObjectLocalException("", (java.lang.Exception)ex3.detail);
			else
			throw new javax.ejb.NoSuchObjectLocalException("", ex3);
		} catch(java.rmi.RemoteException ex4) {
			throw new javax.ejb.EJBException("", ex4);
		}
	}
	
	public java.util.Set selectAllTimerIds() throws javax.ejb.FinderException
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (java.util.Set)delegate.__selectAllTimerIds();
		} catch(javax.transaction.TransactionRolledbackException ex1) {
			if(ex1.detail instanceof java.lang.Exception)
			throw new javax.ejb.TransactionRolledbackLocalException("", (java.lang.Exception)ex1.detail);
			else
			throw new javax.ejb.TransactionRolledbackLocalException("", ex1);
		} catch(javax.transaction.TransactionRequiredException ex2) {
			throw new javax.ejb.TransactionRequiredLocalException(jeus.util.ErrorMsgManager.getLocalizedString(ex2));
		} catch(java.rmi.NoSuchObjectException ex3) {
			if(ex3.detail instanceof java.lang.Exception)
			throw new javax.ejb.NoSuchObjectLocalException("", (java.lang.Exception)ex3.detail);
			else
			throw new javax.ejb.NoSuchObjectLocalException("", ex3);
		} catch(java.rmi.RemoteException ex4) {
			throw new javax.ejb.EJBException("", ex4);
		}
	}
	
	public java.util.Set selectTimersByContainer(java.lang.String arg0) throws javax.ejb.FinderException
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (java.util.Set)delegate.__selectTimersByContainer(arg0);
		} catch(javax.transaction.TransactionRolledbackException ex1) {
			if(ex1.detail instanceof java.lang.Exception)
			throw new javax.ejb.TransactionRolledbackLocalException("", (java.lang.Exception)ex1.detail);
			else
			throw new javax.ejb.TransactionRolledbackLocalException("", ex1);
		} catch(javax.transaction.TransactionRequiredException ex2) {
			throw new javax.ejb.TransactionRequiredLocalException(jeus.util.ErrorMsgManager.getLocalizedString(ex2));
		} catch(java.rmi.NoSuchObjectException ex3) {
			if(ex3.detail instanceof java.lang.Exception)
			throw new javax.ejb.NoSuchObjectLocalException("", (java.lang.Exception)ex3.detail);
			else
			throw new javax.ejb.NoSuchObjectLocalException("", ex3);
		} catch(java.rmi.RemoteException ex4) {
			throw new javax.ejb.EJBException("", ex4);
		}
	}
	
	public java.util.Set selectAllTimers() throws javax.ejb.FinderException
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (java.util.Set)delegate.__selectAllTimers();
		} catch(javax.transaction.TransactionRolledbackException ex1) {
			if(ex1.detail instanceof java.lang.Exception)
			throw new javax.ejb.TransactionRolledbackLocalException("", (java.lang.Exception)ex1.detail);
			else
			throw new javax.ejb.TransactionRolledbackLocalException("", ex1);
		} catch(javax.transaction.TransactionRequiredException ex2) {
			throw new javax.ejb.TransactionRequiredLocalException(jeus.util.ErrorMsgManager.getLocalizedString(ex2));
		} catch(java.rmi.NoSuchObjectException ex3) {
			if(ex3.detail instanceof java.lang.Exception)
			throw new javax.ejb.NoSuchObjectLocalException("", (java.lang.Exception)ex3.detail);
			else
			throw new javax.ejb.NoSuchObjectLocalException("", ex3);
		} catch(java.rmi.RemoteException ex4) {
			throw new javax.ejb.EJBException("", ex4);
		}
	}
	
	public java.util.Set selectAllTimersOwnedBy(java.lang.String arg0) throws javax.ejb.FinderException
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (java.util.Set)delegate.__selectAllTimersOwnedBy(arg0);
		} catch(javax.transaction.TransactionRolledbackException ex1) {
			if(ex1.detail instanceof java.lang.Exception)
			throw new javax.ejb.TransactionRolledbackLocalException("", (java.lang.Exception)ex1.detail);
			else
			throw new javax.ejb.TransactionRolledbackLocalException("", ex1);
		} catch(javax.transaction.TransactionRequiredException ex2) {
			throw new javax.ejb.TransactionRequiredLocalException(jeus.util.ErrorMsgManager.getLocalizedString(ex2));
		} catch(java.rmi.NoSuchObjectException ex3) {
			if(ex3.detail instanceof java.lang.Exception)
			throw new javax.ejb.NoSuchObjectLocalException("", (java.lang.Exception)ex3.detail);
			else
			throw new javax.ejb.NoSuchObjectLocalException("", ex3);
		} catch(java.rmi.RemoteException ex4) {
			throw new javax.ejb.EJBException("", ex4);
		}
	}
	
	public void remove(java.lang.Object arg0) throws javax.ejb.RemoveException, javax.ejb.EJBException
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		delegate.__remove(arg0);
		} catch(javax.transaction.TransactionRolledbackException ex1) {
			if(ex1.detail instanceof java.lang.Exception)
			throw new javax.ejb.TransactionRolledbackLocalException("", (java.lang.Exception)ex1.detail);
			else
			throw new javax.ejb.TransactionRolledbackLocalException("", ex1);
		} catch(javax.transaction.TransactionRequiredException ex2) {
			throw new javax.ejb.TransactionRequiredLocalException(jeus.util.ErrorMsgManager.getLocalizedString(ex2));
		} catch(java.rmi.NoSuchObjectException ex3) {
			if(ex3.detail instanceof java.lang.Exception)
			throw new javax.ejb.NoSuchObjectLocalException("", (java.lang.Exception)ex3.detail);
			else
			throw new javax.ejb.NoSuchObjectLocalException("", ex3);
		} catch(java.rmi.RemoteException ex4) {
			throw new javax.ejb.EJBException("", ex4);
		}
	}
	private merBeanHomeImpl1979871371 delegate;
	public void setDelegate(Object delegate)
	{
		this.delegate = (merBeanHomeImpl1979871371)delegate;
	}
	public jeus.ejb.bean.objectbase.EJBHomeImpl getDelegate()
	{
		return delegate;
	}
	private static int interfaceHash = 2116046520;
	public int getInterfaceHash()
	{
		return interfaceHash;
	}
}
