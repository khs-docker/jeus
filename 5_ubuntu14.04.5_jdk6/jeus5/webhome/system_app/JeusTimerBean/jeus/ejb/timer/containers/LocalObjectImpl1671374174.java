package jeus.ejb.timer.containers;

import javax.ejb.*;
import jeus.ejb.bean.*;
import jeus.ejb.bean.objectbase.*;
import jeus.ejb.bean.context.*;
import jeus.util.*;
import jeus.ejb.util.*;

public final class LocalObjectImpl1671374174 extends jeus.ejb.bean.objectbase.EJBLocalObjectImpl
	implements TimerLocal
{
	public LocalObjectImpl1671374174(){
		super();
	}
	
	public java.io.Serializable getInfo() 
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (java.io.Serializable)delegate.__getInfo();
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
	
	public java.io.Serializable getInfo(java.lang.ClassLoader arg0) 
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (java.io.Serializable)delegate.__getInfo(arg0);
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
	
	public java.lang.Long getTimerId() 
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (java.lang.Long)delegate.__getTimerId();
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
	
	public void setLastExpiration(java.util.Date arg0) 
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		delegate.__setLastExpiration(arg0);
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
	
	public java.lang.String getOwnerId() 
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (java.lang.String)delegate.__getOwnerId();
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
	
	public long getIntervalDuration() 
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (long)delegate.__getIntervalDuration();
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
	
	public java.lang.String getContainerId() 
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (java.lang.String)delegate.__getContainerId();
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
	
	public java.lang.Object getTimedObjectPrimaryKey() 
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (java.lang.Object)delegate.__getTimedObjectPrimaryKey();
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
	
	public java.lang.Object getTimedObjectPrimaryKey(java.lang.ClassLoader arg0) 
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (java.lang.Object)delegate.__getTimedObjectPrimaryKey(arg0);
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
	
	public java.util.Date getCreationTime() 
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (java.util.Date)delegate.__getCreationTime();
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
	
	public java.util.Date getInitialExpiration() 
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (java.util.Date)delegate.__getInitialExpiration();
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
	
	public java.util.Date getLastExpiration() 
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		return (java.util.Date)delegate.__getLastExpiration();
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
	
	public void remove() throws javax.ejb.RemoveException, javax.ejb.EJBException
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		try {
			
		delegate.__remove();
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
	
	public javax.ejb.EJBLocalHome getEJBLocalHome() throws javax.ejb.EJBException
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		return (javax.ejb.EJBLocalHome)delegate.__getEJBLocalHome();
	}
	
	public java.lang.Object getPrimaryKey() throws javax.ejb.EJBException
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		return (java.lang.Object)delegate.__getPrimaryKey();
	}
	
	public boolean isIdentical(javax.ejb.EJBLocalObject arg0) throws javax.ejb.EJBException
	{
		if(unexported)
			throw new javax.ejb.NoSuchObjectLocalException();
		return (boolean)delegate.__isIdentical(arg0);
	}
	private erBeanObjectImpl448553963 delegate;
	public void setDelegate(Object delegate)
	{
		this.delegate = (erBeanObjectImpl448553963)delegate;
	}
	public jeus.ejb.bean.objectbase.EJBObjectImpl getDelegate()
	{
		return delegate;
	}
	private static int interfaceHash = 2116046520;
	public int getInterfaceHash()
	{
		return interfaceHash;
	}
}
