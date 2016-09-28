package jeus.ejb.timer.containers;

import javax.ejb.*;
import java.rmi.*;
import javax.rmi.*;
import java.security.*;
import jeus.ejb.bean.*;
import jeus.ejb.bean.objectbase.*;
import jeus.ejb.bean.context.*;
import jeus.util.*;
import jeus.ejb.util.*;
import java.util.logging.*;
import jeus.security.container.ejb.EJBSecurity;
import java.lang.reflect.*;
import javax.security.jacc.*;
import jeus.ejb.container.*;
import javax.xml.soap.SOAPMessage;
import java.rmi.server.*;
import jeus.util.message.*;

public final class erBeanObjectImpl448553963 extends EJBEntityObjectImpl

{
	public erBeanObjectImpl448553963() throws RemoteException {
		super();
	}
	
	transient private static EJBMethodPermission method0Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocal.class.getMethod("getInfo", new Class[] {});
			method0Rsc = new EJBMethodPermission("JeusTimerBean", "Local", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.io.Serializable __getInfo() throws java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			request.txAttr = 2;
			
			java.io.Serializable returnValue = null;
			
			try {
				this.container.preInvoke(request);
				TimerBean ejbBean = (TimerBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] { };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("JeusTimerBean", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method0Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method getInfo()", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod getInfo()");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.getInfo();
			} catch(Throwable ex) {
				request.exception = ex;
				logger.log(Level.WARNING, "problem in handling the request",ex);
			} finally {
				this.container.postInvoke(request);
			}
			try {
				if (runAsPrincipal != null)
	EJBSecurity.clearEJBRunAsIdentity();
if (isSetEJBSecurityContext)
	EJBSecurity.clearEJBSecurityContext();
			} catch (Throwable ex) {
				throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
			}
			ExecutionContextStack.pop();
			if(request.exception != null)
			{
				if(request.exception instanceof javax.transaction.TransactionRolledbackException) {
					throw (javax.transaction.TransactionRolledbackException)request.exception; 
				}else if(request.exception instanceof javax.transaction.TransactionRequiredException) {
					throw (javax.transaction.TransactionRequiredException)request.exception; 
				}else if(request.exception instanceof java.rmi.NoSuchObjectException) {
					throw (java.rmi.NoSuchObjectException)request.exception; 
				}else if(request.exception instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException)request.exception; 
				}
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return returnValue;
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method1Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocal.class.getMethod("getInfo", new Class[] {java.lang.ClassLoader.class});
			method1Rsc = new EJBMethodPermission("JeusTimerBean", "Local", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.io.Serializable __getInfo(java.lang.ClassLoader arg0) throws java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			request.txAttr = 2;
			
			java.io.Serializable returnValue = null;
			
			try {
				this.container.preInvoke(request);
				TimerBean ejbBean = (TimerBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] {arg0 };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("JeusTimerBean", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method1Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method getInfo(java.lang.ClassLoader)", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod getInfo(java.lang.ClassLoader)");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.getInfo(arg0);
			} catch(Throwable ex) {
				request.exception = ex;
				logger.log(Level.WARNING, "problem in handling the request",ex);
			} finally {
				this.container.postInvoke(request);
			}
			try {
				if (runAsPrincipal != null)
	EJBSecurity.clearEJBRunAsIdentity();
if (isSetEJBSecurityContext)
	EJBSecurity.clearEJBSecurityContext();
			} catch (Throwable ex) {
				throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
			}
			ExecutionContextStack.pop();
			if(request.exception != null)
			{
				if(request.exception instanceof javax.transaction.TransactionRolledbackException) {
					throw (javax.transaction.TransactionRolledbackException)request.exception; 
				}else if(request.exception instanceof javax.transaction.TransactionRequiredException) {
					throw (javax.transaction.TransactionRequiredException)request.exception; 
				}else if(request.exception instanceof java.rmi.NoSuchObjectException) {
					throw (java.rmi.NoSuchObjectException)request.exception; 
				}else if(request.exception instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException)request.exception; 
				}
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return returnValue;
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method2Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocal.class.getMethod("getTimerId", new Class[] {});
			method2Rsc = new EJBMethodPermission("JeusTimerBean", "Local", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.lang.Long __getTimerId() throws java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			request.txAttr = 2;
			
			java.lang.Long returnValue = null;
			
			try {
				this.container.preInvoke(request);
				TimerBean ejbBean = (TimerBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] { };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("JeusTimerBean", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method2Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method getTimerId()", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod getTimerId()");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.getTimerId();
			} catch(Throwable ex) {
				request.exception = ex;
				logger.log(Level.WARNING, "problem in handling the request",ex);
			} finally {
				this.container.postInvoke(request);
			}
			try {
				if (runAsPrincipal != null)
	EJBSecurity.clearEJBRunAsIdentity();
if (isSetEJBSecurityContext)
	EJBSecurity.clearEJBSecurityContext();
			} catch (Throwable ex) {
				throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
			}
			ExecutionContextStack.pop();
			if(request.exception != null)
			{
				if(request.exception instanceof javax.transaction.TransactionRolledbackException) {
					throw (javax.transaction.TransactionRolledbackException)request.exception; 
				}else if(request.exception instanceof javax.transaction.TransactionRequiredException) {
					throw (javax.transaction.TransactionRequiredException)request.exception; 
				}else if(request.exception instanceof java.rmi.NoSuchObjectException) {
					throw (java.rmi.NoSuchObjectException)request.exception; 
				}else if(request.exception instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException)request.exception; 
				}
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return returnValue;
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method3Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocal.class.getMethod("setLastExpiration", new Class[] {java.util.Date.class});
			method3Rsc = new EJBMethodPermission("JeusTimerBean", "Local", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public void __setLastExpiration(java.util.Date arg0) throws java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			request.txAttr = 2;
			
			
			try {
				this.container.preInvoke(request);
				TimerBean ejbBean = (TimerBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] {arg0 };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("JeusTimerBean", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method3Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method setLastExpiration(java.util.Date)", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod setLastExpiration(java.util.Date)");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				ejbBean.setLastExpiration(arg0);
			} catch(Throwable ex) {
				request.exception = ex;
				logger.log(Level.WARNING, "problem in handling the request",ex);
			} finally {
				this.container.postInvoke(request);
			}
			try {
				if (runAsPrincipal != null)
	EJBSecurity.clearEJBRunAsIdentity();
if (isSetEJBSecurityContext)
	EJBSecurity.clearEJBSecurityContext();
			} catch (Throwable ex) {
				throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
			}
			ExecutionContextStack.pop();
			if(request.exception != null)
			{
				if(request.exception instanceof javax.transaction.TransactionRolledbackException) {
					throw (javax.transaction.TransactionRolledbackException)request.exception; 
				}else if(request.exception instanceof javax.transaction.TransactionRequiredException) {
					throw (javax.transaction.TransactionRequiredException)request.exception; 
				}else if(request.exception instanceof java.rmi.NoSuchObjectException) {
					throw (java.rmi.NoSuchObjectException)request.exception; 
				}else if(request.exception instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException)request.exception; 
				}
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method4Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocal.class.getMethod("getOwnerId", new Class[] {});
			method4Rsc = new EJBMethodPermission("JeusTimerBean", "Local", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.lang.String __getOwnerId() throws java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			request.txAttr = 2;
			
			java.lang.String returnValue = null;
			
			try {
				this.container.preInvoke(request);
				TimerBean ejbBean = (TimerBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] { };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("JeusTimerBean", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method4Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method getOwnerId()", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod getOwnerId()");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.getOwnerId();
			} catch(Throwable ex) {
				request.exception = ex;
				logger.log(Level.WARNING, "problem in handling the request",ex);
			} finally {
				this.container.postInvoke(request);
			}
			try {
				if (runAsPrincipal != null)
	EJBSecurity.clearEJBRunAsIdentity();
if (isSetEJBSecurityContext)
	EJBSecurity.clearEJBSecurityContext();
			} catch (Throwable ex) {
				throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
			}
			ExecutionContextStack.pop();
			if(request.exception != null)
			{
				if(request.exception instanceof javax.transaction.TransactionRolledbackException) {
					throw (javax.transaction.TransactionRolledbackException)request.exception; 
				}else if(request.exception instanceof javax.transaction.TransactionRequiredException) {
					throw (javax.transaction.TransactionRequiredException)request.exception; 
				}else if(request.exception instanceof java.rmi.NoSuchObjectException) {
					throw (java.rmi.NoSuchObjectException)request.exception; 
				}else if(request.exception instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException)request.exception; 
				}
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return returnValue;
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method5Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocal.class.getMethod("getIntervalDuration", new Class[] {});
			method5Rsc = new EJBMethodPermission("JeusTimerBean", "Local", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public long __getIntervalDuration() throws java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			request.txAttr = 2;
			
			long returnValue = 0;
			
			try {
				this.container.preInvoke(request);
				TimerBean ejbBean = (TimerBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] { };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("JeusTimerBean", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method5Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method getIntervalDuration()", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod getIntervalDuration()");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.getIntervalDuration();
			} catch(Throwable ex) {
				request.exception = ex;
				logger.log(Level.WARNING, "problem in handling the request",ex);
			} finally {
				this.container.postInvoke(request);
			}
			try {
				if (runAsPrincipal != null)
	EJBSecurity.clearEJBRunAsIdentity();
if (isSetEJBSecurityContext)
	EJBSecurity.clearEJBSecurityContext();
			} catch (Throwable ex) {
				throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
			}
			ExecutionContextStack.pop();
			if(request.exception != null)
			{
				if(request.exception instanceof javax.transaction.TransactionRolledbackException) {
					throw (javax.transaction.TransactionRolledbackException)request.exception; 
				}else if(request.exception instanceof javax.transaction.TransactionRequiredException) {
					throw (javax.transaction.TransactionRequiredException)request.exception; 
				}else if(request.exception instanceof java.rmi.NoSuchObjectException) {
					throw (java.rmi.NoSuchObjectException)request.exception; 
				}else if(request.exception instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException)request.exception; 
				}
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return returnValue;
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method6Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocal.class.getMethod("getContainerId", new Class[] {});
			method6Rsc = new EJBMethodPermission("JeusTimerBean", "Local", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.lang.String __getContainerId() throws java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			request.txAttr = 2;
			
			java.lang.String returnValue = null;
			
			try {
				this.container.preInvoke(request);
				TimerBean ejbBean = (TimerBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] { };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("JeusTimerBean", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method6Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method getContainerId()", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod getContainerId()");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.getContainerId();
			} catch(Throwable ex) {
				request.exception = ex;
				logger.log(Level.WARNING, "problem in handling the request",ex);
			} finally {
				this.container.postInvoke(request);
			}
			try {
				if (runAsPrincipal != null)
	EJBSecurity.clearEJBRunAsIdentity();
if (isSetEJBSecurityContext)
	EJBSecurity.clearEJBSecurityContext();
			} catch (Throwable ex) {
				throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
			}
			ExecutionContextStack.pop();
			if(request.exception != null)
			{
				if(request.exception instanceof javax.transaction.TransactionRolledbackException) {
					throw (javax.transaction.TransactionRolledbackException)request.exception; 
				}else if(request.exception instanceof javax.transaction.TransactionRequiredException) {
					throw (javax.transaction.TransactionRequiredException)request.exception; 
				}else if(request.exception instanceof java.rmi.NoSuchObjectException) {
					throw (java.rmi.NoSuchObjectException)request.exception; 
				}else if(request.exception instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException)request.exception; 
				}
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return returnValue;
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method7Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocal.class.getMethod("getTimedObjectPrimaryKey", new Class[] {});
			method7Rsc = new EJBMethodPermission("JeusTimerBean", "Local", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.lang.Object __getTimedObjectPrimaryKey() throws java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			request.txAttr = 2;
			
			java.lang.Object returnValue = null;
			
			try {
				this.container.preInvoke(request);
				TimerBean ejbBean = (TimerBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] { };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("JeusTimerBean", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method7Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method getTimedObjectPrimaryKey()", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod getTimedObjectPrimaryKey()");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.getTimedObjectPrimaryKey();
			} catch(Throwable ex) {
				request.exception = ex;
				logger.log(Level.WARNING, "problem in handling the request",ex);
			} finally {
				this.container.postInvoke(request);
			}
			try {
				if (runAsPrincipal != null)
	EJBSecurity.clearEJBRunAsIdentity();
if (isSetEJBSecurityContext)
	EJBSecurity.clearEJBSecurityContext();
			} catch (Throwable ex) {
				throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
			}
			ExecutionContextStack.pop();
			if(request.exception != null)
			{
				if(request.exception instanceof javax.transaction.TransactionRolledbackException) {
					throw (javax.transaction.TransactionRolledbackException)request.exception; 
				}else if(request.exception instanceof javax.transaction.TransactionRequiredException) {
					throw (javax.transaction.TransactionRequiredException)request.exception; 
				}else if(request.exception instanceof java.rmi.NoSuchObjectException) {
					throw (java.rmi.NoSuchObjectException)request.exception; 
				}else if(request.exception instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException)request.exception; 
				}
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return returnValue;
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method8Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocal.class.getMethod("getTimedObjectPrimaryKey", new Class[] {java.lang.ClassLoader.class});
			method8Rsc = new EJBMethodPermission("JeusTimerBean", "Local", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.lang.Object __getTimedObjectPrimaryKey(java.lang.ClassLoader arg0) throws java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			request.txAttr = 2;
			
			java.lang.Object returnValue = null;
			
			try {
				this.container.preInvoke(request);
				TimerBean ejbBean = (TimerBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] {arg0 };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("JeusTimerBean", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method8Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method getTimedObjectPrimaryKey(java.lang.ClassLoader)", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod getTimedObjectPrimaryKey(java.lang.ClassLoader)");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.getTimedObjectPrimaryKey(arg0);
			} catch(Throwable ex) {
				request.exception = ex;
				logger.log(Level.WARNING, "problem in handling the request",ex);
			} finally {
				this.container.postInvoke(request);
			}
			try {
				if (runAsPrincipal != null)
	EJBSecurity.clearEJBRunAsIdentity();
if (isSetEJBSecurityContext)
	EJBSecurity.clearEJBSecurityContext();
			} catch (Throwable ex) {
				throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
			}
			ExecutionContextStack.pop();
			if(request.exception != null)
			{
				if(request.exception instanceof javax.transaction.TransactionRolledbackException) {
					throw (javax.transaction.TransactionRolledbackException)request.exception; 
				}else if(request.exception instanceof javax.transaction.TransactionRequiredException) {
					throw (javax.transaction.TransactionRequiredException)request.exception; 
				}else if(request.exception instanceof java.rmi.NoSuchObjectException) {
					throw (java.rmi.NoSuchObjectException)request.exception; 
				}else if(request.exception instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException)request.exception; 
				}
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return returnValue;
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method9Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocal.class.getMethod("getCreationTime", new Class[] {});
			method9Rsc = new EJBMethodPermission("JeusTimerBean", "Local", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.util.Date __getCreationTime() throws java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			request.txAttr = 2;
			
			java.util.Date returnValue = null;
			
			try {
				this.container.preInvoke(request);
				TimerBean ejbBean = (TimerBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] { };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("JeusTimerBean", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method9Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method getCreationTime()", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod getCreationTime()");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.getCreationTime();
			} catch(Throwable ex) {
				request.exception = ex;
				logger.log(Level.WARNING, "problem in handling the request",ex);
			} finally {
				this.container.postInvoke(request);
			}
			try {
				if (runAsPrincipal != null)
	EJBSecurity.clearEJBRunAsIdentity();
if (isSetEJBSecurityContext)
	EJBSecurity.clearEJBSecurityContext();
			} catch (Throwable ex) {
				throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
			}
			ExecutionContextStack.pop();
			if(request.exception != null)
			{
				if(request.exception instanceof javax.transaction.TransactionRolledbackException) {
					throw (javax.transaction.TransactionRolledbackException)request.exception; 
				}else if(request.exception instanceof javax.transaction.TransactionRequiredException) {
					throw (javax.transaction.TransactionRequiredException)request.exception; 
				}else if(request.exception instanceof java.rmi.NoSuchObjectException) {
					throw (java.rmi.NoSuchObjectException)request.exception; 
				}else if(request.exception instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException)request.exception; 
				}
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return returnValue;
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method10Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocal.class.getMethod("getInitialExpiration", new Class[] {});
			method10Rsc = new EJBMethodPermission("JeusTimerBean", "Local", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.util.Date __getInitialExpiration() throws java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			request.txAttr = 2;
			
			java.util.Date returnValue = null;
			
			try {
				this.container.preInvoke(request);
				TimerBean ejbBean = (TimerBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] { };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("JeusTimerBean", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method10Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method getInitialExpiration()", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod getInitialExpiration()");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.getInitialExpiration();
			} catch(Throwable ex) {
				request.exception = ex;
				logger.log(Level.WARNING, "problem in handling the request",ex);
			} finally {
				this.container.postInvoke(request);
			}
			try {
				if (runAsPrincipal != null)
	EJBSecurity.clearEJBRunAsIdentity();
if (isSetEJBSecurityContext)
	EJBSecurity.clearEJBSecurityContext();
			} catch (Throwable ex) {
				throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
			}
			ExecutionContextStack.pop();
			if(request.exception != null)
			{
				if(request.exception instanceof javax.transaction.TransactionRolledbackException) {
					throw (javax.transaction.TransactionRolledbackException)request.exception; 
				}else if(request.exception instanceof javax.transaction.TransactionRequiredException) {
					throw (javax.transaction.TransactionRequiredException)request.exception; 
				}else if(request.exception instanceof java.rmi.NoSuchObjectException) {
					throw (java.rmi.NoSuchObjectException)request.exception; 
				}else if(request.exception instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException)request.exception; 
				}
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return returnValue;
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method11Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocal.class.getMethod("getLastExpiration", new Class[] {});
			method11Rsc = new EJBMethodPermission("JeusTimerBean", "Local", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.util.Date __getLastExpiration() throws java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			request.txAttr = 2;
			
			java.util.Date returnValue = null;
			
			try {
				this.container.preInvoke(request);
				TimerBean ejbBean = (TimerBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] { };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("JeusTimerBean", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method11Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method getLastExpiration()", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod getLastExpiration()");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.getLastExpiration();
			} catch(Throwable ex) {
				request.exception = ex;
				logger.log(Level.WARNING, "problem in handling the request",ex);
			} finally {
				this.container.postInvoke(request);
			}
			try {
				if (runAsPrincipal != null)
	EJBSecurity.clearEJBRunAsIdentity();
if (isSetEJBSecurityContext)
	EJBSecurity.clearEJBSecurityContext();
			} catch (Throwable ex) {
				throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
			}
			ExecutionContextStack.pop();
			if(request.exception != null)
			{
				if(request.exception instanceof javax.transaction.TransactionRolledbackException) {
					throw (javax.transaction.TransactionRolledbackException)request.exception; 
				}else if(request.exception instanceof javax.transaction.TransactionRequiredException) {
					throw (javax.transaction.TransactionRequiredException)request.exception; 
				}else if(request.exception instanceof java.rmi.NoSuchObjectException) {
					throw (java.rmi.NoSuchObjectException)request.exception; 
				}else if(request.exception instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException)request.exception; 
				}
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return returnValue;
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method12Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocal.class.getMethod("remove", new Class[] {});
			method12Rsc = new EJBMethodPermission("JeusTimerBean", "Local", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public void __remove() throws RemoveException, RemoteException
	{
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		RemoteRequest request = new RemoteRequest();
		request.methodType = 4;
		request.txAttr = 2;
		try {
			innerRemove(request, nullObjectArray, method12Rsc, true);
		} finally {
			ExecutionContextStack.pop();
		}
	}
	public EJBMethodPermission getGetEJBHomeRsc()
	{
		return getEJBHomeRsc;
	}
	public EJBMethodPermission getGetHandleRsc()
	{
		return getHandleRsc;
	}
	public EJBMethodPermission getIsIdenticalRRsc()
	{
		return isIdenticalRRsc;
	}
	public EJBMethodPermission getGetPrimaryKeyRRsc()
	{
		return getPrimaryKeyRRsc;
	}
	public EJBMethodPermission getGetEJBLocalHomeRsc()
	{
		return getEJBLocalHomeRsc;
	}
	public EJBMethodPermission getIsIdenticalLRsc()
	{
		return isIdenticalLRsc;
	}
	public EJBMethodPermission getGetPrimaryKeyLRsc()
	{
		return getPrimaryKeyLRsc;
	}
	
	transient private static EJBMethodPermission getEJBHomeRsc;
	
	
	transient private static EJBMethodPermission getHandleRsc;
	
	
	transient private static EJBMethodPermission isIdenticalRRsc;
	
	
	transient private static EJBMethodPermission getPrimaryKeyRRsc;
	
	
	transient private static EJBMethodPermission getEJBLocalHomeRsc;
	
	static {
		try {
			getEJBLocalHomeRsc = new EJBMethodPermission("JeusTimerBean", "Local", TimerLocal.class.getMethod("getEJBLocalHome", new Class[] {} ));
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage());}
	}
	
	
	transient private static EJBMethodPermission isIdenticalLRsc;
	
	static {
		try {
			isIdenticalLRsc = new EJBMethodPermission("JeusTimerBean", "Local", TimerLocal.class.getMethod("isIdentical", new Class[] {javax.ejb.EJBLocalObject.class} ));
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage());}
	}
	
	
	transient private static EJBMethodPermission getPrimaryKeyLRsc;
	
	static {
		try {
			getPrimaryKeyLRsc = new EJBMethodPermission("JeusTimerBean", "Local", TimerLocal.class.getMethod("getPrimaryKey", new Class[] {} ));
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage());}
	}
	
	private static int type = 0;
	public int __jeus_getType()
	{
		return type;
	}
	
}
