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

public final class merBeanHomeImpl1979871371 extends EJBHomeImpl

{
	public merBeanHomeImpl1979871371() throws RemoteException {
		super();
	}
	
	transient private static EJBMethodPermission method13Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocalHome.class.getMethod("create", new Class[] {java.lang.Long.class, java.lang.String.class, java.lang.Object.class, java.util.Date.class, long.class, java.io.Serializable.class});
			method13Rsc = new EJBMethodPermission("JeusTimerBean", "LocalHome", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public jeus.ejb.timer.containers.TimerLocal __create(java.lang.Long arg0, java.lang.String arg1, java.lang.Object arg2, java.util.Date arg3, long arg4, java.io.Serializable arg5) throws javax.ejb.CreateException, java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			erBeanObjectImpl448553963 ejbObject;
			try {
				ejbObject = (erBeanObjectImpl448553963) container.getEJBObjectInstance();
			} catch(RemoteException e) {
				logger.log(Level.WARNING, "problem in handling the request",e);
				throw e;
			}
			
			this.container.createMethodCalled();
			
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = ejbObject;
			request.methodType = 1;
			request.txAttr = 2;
			
			
			try {
				this.container.preInvokeHome(request);
				TimerBean ejbBean = (TimerBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] {arg0, arg1, arg2, arg3, new Long(arg4), arg5 };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("JeusTimerBean", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method13Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method create(java.lang.Long,java.lang.String,java.lang.Object,java.util.Date,long,java.io.Serializable)", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod create(java.lang.Long,java.lang.String,java.lang.Object,java.util.Date,long,java.io.Serializable)");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				ejbBean.ejbCreate(arg0, arg1, arg2, arg3, arg4, arg5);
				((CMEntityContainer)this.container).registerEJBBean(request);
				ejbBean.ejbPostCreate(arg0, arg1, arg2, arg3, arg4, arg5);
				((CMEntityContainer)this.container).registerEJBBean(ejbObject, request.tx);
			} catch(Throwable ex) {
				logger.log(Level.WARNING, "problem in handling the request",ex);
				request.exception = ex;
			} finally {
				this.container.postInvokeHome(request);
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
				if(request.exception instanceof RemoteException) {
					throw (RemoteException)request.exception; 
				}
				else if(request.exception instanceof javax.ejb.CreateException) {
					throw (javax.ejb.CreateException)request.exception;
				} 
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return (jeus.ejb.timer.containers.TimerLocal)ejbObject.getEJBLocalObjectImpl();
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method14Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocalHome.class.getMethod("findByPrimaryKey", new Class[] {jeus.ejb.timer.containers.TimerPrimaryKey.class});
			method14Rsc = new EJBMethodPermission("JeusTimerBean", "LocalHome", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public jeus.ejb.timer.containers.TimerLocal __findByPrimaryKey(jeus.ejb.timer.containers.TimerPrimaryKey arg0) throws javax.ejb.FinderException, java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			erBeanObjectImpl448553963 ejbObject = null;
			
			
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = ejbObject;
			request.methodType = 2;
			request.method = "findByPrimaryKey(jeus.ejb.timer.containers.TimerPrimaryKey)";
			request.txAttr = 2;
			
			jeus.ejb.timer.containers.TimerLocal returnValue = null;
			
			
			try {
				this.container.preInvokeHome(request);
				TimerBean ejbBean = null;
				Object[] args = new Object[] {arg0 };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("JeusTimerBean", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method14Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method findByPrimaryKey(jeus.ejb.timer.containers.TimerPrimaryKey)", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod findByPrimaryKey(jeus.ejb.timer.containers.TimerPrimaryKey)");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				java.lang.Object[] findargs = new Object[1];
				findargs[0] = arg0;
				returnValue = (jeus.ejb.timer.containers.TimerLocal)((CMEntityContainer)this.container).findEntities(request, findargs, isLocal,true);
			} catch(Throwable ex) {
				logger.log(Level.WARNING, "problem in handling the request",ex);
				request.exception = ex;
			} finally {
				this.container.postInvokeHome(request);
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
				if(request.exception instanceof RemoteException) {
					throw (RemoteException)request.exception; 
				}
				else if(request.exception instanceof javax.ejb.FinderException) {
					throw (javax.ejb.FinderException)request.exception;
				} 
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return (jeus.ejb.timer.containers.TimerLocal)returnValue;
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method15Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocalHome.class.getMethod("selectTimerIdsByContainer", new Class[] {java.lang.String.class});
			method15Rsc = new EJBMethodPermission("JeusTimerBean", "LocalHome", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.util.Set __selectTimerIdsByContainer(java.lang.String arg0) throws javax.ejb.FinderException, java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			erBeanObjectImpl448553963 ejbObject;
			try {
				ejbObject = (erBeanObjectImpl448553963) container.getEJBObjectInstance();
			} catch(RemoteException e) {
				logger.log(Level.WARNING, "problem in handling the request",e);
				throw e;
			}
			
			
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = ejbObject;
			request.methodType = 3;
			request.txAttr = 2;
			
			java.util.Set returnValue = null;
			
			try {
				this.container.preInvokeHome(request);
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
						EJBSecurity.checkEJBMethodPermission(method15Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method selectTimerIdsByContainer(java.lang.String)", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod selectTimerIdsByContainer(java.lang.String)");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.ejbHomeSelectTimerIdsByContainer(arg0);
			} catch(Throwable ex) {
				logger.log(Level.WARNING, "problem in handling the request",ex);
				request.exception = ex;
			} finally {
				this.container.postInvokeHome(request);
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
				if(request.exception instanceof RemoteException) {
					throw (RemoteException)request.exception; 
				}
				else if(request.exception instanceof javax.ejb.FinderException) {
					throw (javax.ejb.FinderException)request.exception;
				} 
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return (java.util.Set)returnValue;
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method16Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocalHome.class.getMethod("selectAllTimerIds", new Class[] {});
			method16Rsc = new EJBMethodPermission("JeusTimerBean", "LocalHome", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.util.Set __selectAllTimerIds() throws javax.ejb.FinderException, java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			erBeanObjectImpl448553963 ejbObject;
			try {
				ejbObject = (erBeanObjectImpl448553963) container.getEJBObjectInstance();
			} catch(RemoteException e) {
				logger.log(Level.WARNING, "problem in handling the request",e);
				throw e;
			}
			
			
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = ejbObject;
			request.methodType = 3;
			request.txAttr = 2;
			
			java.util.Set returnValue = null;
			
			try {
				this.container.preInvokeHome(request);
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
						EJBSecurity.checkEJBMethodPermission(method16Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method selectAllTimerIds()", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod selectAllTimerIds()");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.ejbHomeSelectAllTimerIds();
			} catch(Throwable ex) {
				logger.log(Level.WARNING, "problem in handling the request",ex);
				request.exception = ex;
			} finally {
				this.container.postInvokeHome(request);
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
				if(request.exception instanceof RemoteException) {
					throw (RemoteException)request.exception; 
				}
				else if(request.exception instanceof javax.ejb.FinderException) {
					throw (javax.ejb.FinderException)request.exception;
				} 
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return (java.util.Set)returnValue;
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method17Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocalHome.class.getMethod("selectTimersByContainer", new Class[] {java.lang.String.class});
			method17Rsc = new EJBMethodPermission("JeusTimerBean", "LocalHome", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.util.Set __selectTimersByContainer(java.lang.String arg0) throws javax.ejb.FinderException, java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			erBeanObjectImpl448553963 ejbObject;
			try {
				ejbObject = (erBeanObjectImpl448553963) container.getEJBObjectInstance();
			} catch(RemoteException e) {
				logger.log(Level.WARNING, "problem in handling the request",e);
				throw e;
			}
			
			
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = ejbObject;
			request.methodType = 3;
			request.txAttr = 2;
			
			java.util.Set returnValue = null;
			
			try {
				this.container.preInvokeHome(request);
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
						EJBSecurity.checkEJBMethodPermission(method17Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method selectTimersByContainer(java.lang.String)", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod selectTimersByContainer(java.lang.String)");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.ejbHomeSelectTimersByContainer(arg0);
			} catch(Throwable ex) {
				logger.log(Level.WARNING, "problem in handling the request",ex);
				request.exception = ex;
			} finally {
				this.container.postInvokeHome(request);
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
				if(request.exception instanceof RemoteException) {
					throw (RemoteException)request.exception; 
				}
				else if(request.exception instanceof javax.ejb.FinderException) {
					throw (javax.ejb.FinderException)request.exception;
				} 
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return (java.util.Set)returnValue;
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method18Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocalHome.class.getMethod("selectAllTimers", new Class[] {});
			method18Rsc = new EJBMethodPermission("JeusTimerBean", "LocalHome", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.util.Set __selectAllTimers() throws javax.ejb.FinderException, java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			erBeanObjectImpl448553963 ejbObject;
			try {
				ejbObject = (erBeanObjectImpl448553963) container.getEJBObjectInstance();
			} catch(RemoteException e) {
				logger.log(Level.WARNING, "problem in handling the request",e);
				throw e;
			}
			
			
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = ejbObject;
			request.methodType = 3;
			request.txAttr = 2;
			
			java.util.Set returnValue = null;
			
			try {
				this.container.preInvokeHome(request);
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
						EJBSecurity.checkEJBMethodPermission(method18Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method selectAllTimers()", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod selectAllTimers()");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.ejbHomeSelectAllTimers();
			} catch(Throwable ex) {
				logger.log(Level.WARNING, "problem in handling the request",ex);
				request.exception = ex;
			} finally {
				this.container.postInvokeHome(request);
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
				if(request.exception instanceof RemoteException) {
					throw (RemoteException)request.exception; 
				}
				else if(request.exception instanceof javax.ejb.FinderException) {
					throw (javax.ejb.FinderException)request.exception;
				} 
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return (java.util.Set)returnValue;
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method19Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocalHome.class.getMethod("selectAllTimersOwnedBy", new Class[] {java.lang.String.class});
			method19Rsc = new EJBMethodPermission("JeusTimerBean", "LocalHome", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.util.Set __selectAllTimersOwnedBy(java.lang.String arg0) throws javax.ejb.FinderException, java.rmi.RemoteException
	{
		if(container.suspended)
			throw new javax.ejb.EJBException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			erBeanObjectImpl448553963 ejbObject;
			try {
				ejbObject = (erBeanObjectImpl448553963) container.getEJBObjectInstance();
			} catch(RemoteException e) {
				logger.log(Level.WARNING, "problem in handling the request",e);
				throw e;
			}
			
			
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = ejbObject;
			request.methodType = 3;
			request.txAttr = 2;
			
			java.util.Set returnValue = null;
			
			try {
				this.container.preInvokeHome(request);
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
						EJBSecurity.checkEJBMethodPermission(method19Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new javax.ejb.EJBException("authorization failed for the method selectAllTimersOwnedBy(java.lang.String)", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new javax.ejb.EJBException("run-as-principal setting failed for the moethod selectAllTimersOwnedBy(java.lang.String)");
					}
				} catch(javax.ejb.EJBException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.ejbHomeSelectAllTimersOwnedBy(arg0);
			} catch(Throwable ex) {
				logger.log(Level.WARNING, "problem in handling the request",ex);
				request.exception = ex;
			} finally {
				this.container.postInvokeHome(request);
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
				if(request.exception instanceof RemoteException) {
					throw (RemoteException)request.exception; 
				}
				else if(request.exception instanceof javax.ejb.FinderException) {
					throw (javax.ejb.FinderException)request.exception;
				} 
				else if(request.exception instanceof java.lang.RuntimeException) {
					throw (java.lang.RuntimeException)request.exception; 
				} 
				else {
					throw new java.rmi.RemoteException("Unexpected exception", request.exception);
				}
			}
			return (java.util.Set)returnValue;
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method20Rsc;
	
	static {
		try {
			Method methodObj = 
				TimerLocalHome.class.getMethod("remove", new Class[] {java.lang.Object.class});
			method20Rsc = new EJBMethodPermission("JeusTimerBean", "LocalHome", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public final void __remove(Object primaryKey) throws RemoveException, RemoteException
	{
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		RemoteRequest request = new RemoteRequest();
		request.methodType = 4;
		request.txAttr = 2;
		try {
			container.removeWithPrimaryKey(primaryKey, request, method20Rsc, new Object[] {primaryKey} );
		} finally {
			ExecutionContextStack.pop();
		}
	}
	public EJBMethodPermission getGetEJBMetaDataRsc()
	{
		return getEJBMetaDataRsc;
	}
	public EJBMethodPermission getGetHomeHandleRsc()
	{
		return getHomeHandleRsc;
	}
	
	transient private static EJBMethodPermission getEJBMetaDataRsc;
	
	
	transient private static EJBMethodPermission getHomeHandleRsc;
	
}
