package javax.management.j2ee;

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
import jeus.management.enterprise.agent.*;

public final class MEJBObjectImpl1356265195 extends EJBStatelessSessionObjectImpl
 implements 
javax.management.j2ee.Management
{
	public MEJBObjectImpl1356265195() throws RemoteException {
		super();
	}
	
	transient private static EJBMethodPermission method0Rsc;
	
	static {
		try {
			Method methodObj = 
				Management.class.getMethod("invoke", new Class[] {javax.management.ObjectName.class, java.lang.String.class, java.lang.Object[].class, java.lang.String[].class});
			method0Rsc = new EJBMethodPermission("MEJB", "Remote", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.lang.Object invoke(javax.management.ObjectName arg0, java.lang.String arg1, java.lang.Object[] arg2, java.lang.String[] arg3) throws javax.management.InstanceNotFoundException, javax.management.MBeanException, javax.management.ReflectionException, java.rmi.RemoteException
	{
		if(container.suspended)
			throw new jeus.ejb.ejbserver.EJBSuspendException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			
			java.lang.Object returnValue = null;
			
			try {
				this.container.preInvoke(request);
				MEJBBean ejbBean = (MEJBBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] {arg0, arg1, arg2, arg3 };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("mejb", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method0Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new java.rmi.RemoteException("authorization failed for the method invoke(javax.management.ObjectName,java.lang.String,java.lang.Object[],java.lang.String[])", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new java.rmi.RemoteException("run-as-principal setting failed for the moethod invoke(javax.management.ObjectName,java.lang.String,java.lang.Object[],java.lang.String[])");
					}
				} catch(java.rmi.RemoteException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.invoke(arg0, arg1, arg2, arg3);
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
				else if(request.exception instanceof javax.management.InstanceNotFoundException) {
					throw (javax.management.InstanceNotFoundException)request.exception;
				} 
				else if(request.exception instanceof javax.management.MBeanException) {
					throw (javax.management.MBeanException)request.exception;
				} 
				else if(request.exception instanceof javax.management.ReflectionException) {
					throw (javax.management.ReflectionException)request.exception;
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
				Management.class.getMethod("getDefaultDomain", new Class[] {});
			method1Rsc = new EJBMethodPermission("MEJB", "Remote", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.lang.String getDefaultDomain() throws java.rmi.RemoteException
	{
		if(container.suspended)
			throw new jeus.ejb.ejbserver.EJBSuspendException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			
			java.lang.String returnValue = null;
			
			try {
				this.container.preInvoke(request);
				MEJBBean ejbBean = (MEJBBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] { };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("mejb", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method1Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new java.rmi.RemoteException("authorization failed for the method getDefaultDomain()", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new java.rmi.RemoteException("run-as-principal setting failed for the moethod getDefaultDomain()");
					}
				} catch(java.rmi.RemoteException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.getDefaultDomain();
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
				Management.class.getMethod("isRegistered", new Class[] {javax.management.ObjectName.class});
			method2Rsc = new EJBMethodPermission("MEJB", "Remote", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public boolean isRegistered(javax.management.ObjectName arg0) throws java.rmi.RemoteException
	{
		if(container.suspended)
			throw new jeus.ejb.ejbserver.EJBSuspendException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			
			boolean returnValue = false;
			
			try {
				this.container.preInvoke(request);
				MEJBBean ejbBean = (MEJBBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] {arg0 };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("mejb", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method2Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new java.rmi.RemoteException("authorization failed for the method isRegistered(javax.management.ObjectName)", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new java.rmi.RemoteException("run-as-principal setting failed for the moethod isRegistered(javax.management.ObjectName)");
					}
				} catch(java.rmi.RemoteException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.isRegistered(arg0);
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
				Management.class.getMethod("getAttributes", new Class[] {javax.management.ObjectName.class, java.lang.String[].class});
			method3Rsc = new EJBMethodPermission("MEJB", "Remote", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public javax.management.AttributeList getAttributes(javax.management.ObjectName arg0, java.lang.String[] arg1) throws javax.management.InstanceNotFoundException, javax.management.ReflectionException, java.rmi.RemoteException
	{
		if(container.suspended)
			throw new jeus.ejb.ejbserver.EJBSuspendException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			
			javax.management.AttributeList returnValue = null;
			
			try {
				this.container.preInvoke(request);
				MEJBBean ejbBean = (MEJBBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] {arg0, arg1 };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("mejb", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method3Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new java.rmi.RemoteException("authorization failed for the method getAttributes(javax.management.ObjectName,java.lang.String[])", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new java.rmi.RemoteException("run-as-principal setting failed for the moethod getAttributes(javax.management.ObjectName,java.lang.String[])");
					}
				} catch(java.rmi.RemoteException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.getAttributes(arg0, arg1);
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
				else if(request.exception instanceof javax.management.InstanceNotFoundException) {
					throw (javax.management.InstanceNotFoundException)request.exception;
				} 
				else if(request.exception instanceof javax.management.ReflectionException) {
					throw (javax.management.ReflectionException)request.exception;
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
	
	transient private static EJBMethodPermission method4Rsc;
	
	static {
		try {
			Method methodObj = 
				Management.class.getMethod("queryNames", new Class[] {javax.management.ObjectName.class, javax.management.QueryExp.class});
			method4Rsc = new EJBMethodPermission("MEJB", "Remote", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.util.Set queryNames(javax.management.ObjectName arg0, javax.management.QueryExp arg1) throws java.rmi.RemoteException
	{
		if(container.suspended)
			throw new jeus.ejb.ejbserver.EJBSuspendException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			
			java.util.Set returnValue = null;
			
			try {
				this.container.preInvoke(request);
				MEJBBean ejbBean = (MEJBBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] {arg0, arg1 };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("mejb", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method4Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new java.rmi.RemoteException("authorization failed for the method queryNames(javax.management.ObjectName,javax.management.QueryExp)", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new java.rmi.RemoteException("run-as-principal setting failed for the moethod queryNames(javax.management.ObjectName,javax.management.QueryExp)");
					}
				} catch(java.rmi.RemoteException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.queryNames(arg0, arg1);
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
				Management.class.getMethod("getMBeanCount", new Class[] {});
			method5Rsc = new EJBMethodPermission("MEJB", "Remote", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.lang.Integer getMBeanCount() throws java.rmi.RemoteException
	{
		if(container.suspended)
			throw new jeus.ejb.ejbserver.EJBSuspendException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			
			java.lang.Integer returnValue = null;
			
			try {
				this.container.preInvoke(request);
				MEJBBean ejbBean = (MEJBBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] { };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("mejb", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method5Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new java.rmi.RemoteException("authorization failed for the method getMBeanCount()", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new java.rmi.RemoteException("run-as-principal setting failed for the moethod getMBeanCount()");
					}
				} catch(java.rmi.RemoteException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.getMBeanCount();
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
				Management.class.getMethod("getAttribute", new Class[] {javax.management.ObjectName.class, java.lang.String.class});
			method6Rsc = new EJBMethodPermission("MEJB", "Remote", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public java.lang.Object getAttribute(javax.management.ObjectName arg0, java.lang.String arg1) throws javax.management.MBeanException, javax.management.AttributeNotFoundException, javax.management.InstanceNotFoundException, javax.management.ReflectionException, java.rmi.RemoteException
	{
		if(container.suspended)
			throw new jeus.ejb.ejbserver.EJBSuspendException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			
			java.lang.Object returnValue = null;
			
			try {
				this.container.preInvoke(request);
				MEJBBean ejbBean = (MEJBBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] {arg0, arg1 };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("mejb", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method6Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new java.rmi.RemoteException("authorization failed for the method getAttribute(javax.management.ObjectName,java.lang.String)", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new java.rmi.RemoteException("run-as-principal setting failed for the moethod getAttribute(javax.management.ObjectName,java.lang.String)");
					}
				} catch(java.rmi.RemoteException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.getAttribute(arg0, arg1);
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
				else if(request.exception instanceof javax.management.MBeanException) {
					throw (javax.management.MBeanException)request.exception;
				} 
				else if(request.exception instanceof javax.management.AttributeNotFoundException) {
					throw (javax.management.AttributeNotFoundException)request.exception;
				} 
				else if(request.exception instanceof javax.management.InstanceNotFoundException) {
					throw (javax.management.InstanceNotFoundException)request.exception;
				} 
				else if(request.exception instanceof javax.management.ReflectionException) {
					throw (javax.management.ReflectionException)request.exception;
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
				Management.class.getMethod("setAttribute", new Class[] {javax.management.ObjectName.class, javax.management.Attribute.class});
			method7Rsc = new EJBMethodPermission("MEJB", "Remote", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public void setAttribute(javax.management.ObjectName arg0, javax.management.Attribute arg1) throws javax.management.InstanceNotFoundException, javax.management.AttributeNotFoundException, javax.management.InvalidAttributeValueException, javax.management.MBeanException, javax.management.ReflectionException, java.rmi.RemoteException
	{
		if(container.suspended)
			throw new jeus.ejb.ejbserver.EJBSuspendException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			
			
			try {
				this.container.preInvoke(request);
				MEJBBean ejbBean = (MEJBBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] {arg0, arg1 };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("mejb", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method7Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new java.rmi.RemoteException("authorization failed for the method setAttribute(javax.management.ObjectName,javax.management.Attribute)", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new java.rmi.RemoteException("run-as-principal setting failed for the moethod setAttribute(javax.management.ObjectName,javax.management.Attribute)");
					}
				} catch(java.rmi.RemoteException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				ejbBean.setAttribute(arg0, arg1);
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
				else if(request.exception instanceof javax.management.InstanceNotFoundException) {
					throw (javax.management.InstanceNotFoundException)request.exception;
				} 
				else if(request.exception instanceof javax.management.AttributeNotFoundException) {
					throw (javax.management.AttributeNotFoundException)request.exception;
				} 
				else if(request.exception instanceof javax.management.InvalidAttributeValueException) {
					throw (javax.management.InvalidAttributeValueException)request.exception;
				} 
				else if(request.exception instanceof javax.management.MBeanException) {
					throw (javax.management.MBeanException)request.exception;
				} 
				else if(request.exception instanceof javax.management.ReflectionException) {
					throw (javax.management.ReflectionException)request.exception;
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
	
	transient private static EJBMethodPermission method8Rsc;
	
	static {
		try {
			Method methodObj = 
				Management.class.getMethod("setAttributes", new Class[] {javax.management.ObjectName.class, javax.management.AttributeList.class});
			method8Rsc = new EJBMethodPermission("MEJB", "Remote", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public javax.management.AttributeList setAttributes(javax.management.ObjectName arg0, javax.management.AttributeList arg1) throws javax.management.InstanceNotFoundException, javax.management.ReflectionException, java.rmi.RemoteException
	{
		if(container.suspended)
			throw new jeus.ejb.ejbserver.EJBSuspendException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			
			javax.management.AttributeList returnValue = null;
			
			try {
				this.container.preInvoke(request);
				MEJBBean ejbBean = (MEJBBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] {arg0, arg1 };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("mejb", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method8Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new java.rmi.RemoteException("authorization failed for the method setAttributes(javax.management.ObjectName,javax.management.AttributeList)", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new java.rmi.RemoteException("run-as-principal setting failed for the moethod setAttributes(javax.management.ObjectName,javax.management.AttributeList)");
					}
				} catch(java.rmi.RemoteException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.setAttributes(arg0, arg1);
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
				else if(request.exception instanceof javax.management.InstanceNotFoundException) {
					throw (javax.management.InstanceNotFoundException)request.exception;
				} 
				else if(request.exception instanceof javax.management.ReflectionException) {
					throw (javax.management.ReflectionException)request.exception;
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
				Management.class.getMethod("getMBeanInfo", new Class[] {javax.management.ObjectName.class});
			method9Rsc = new EJBMethodPermission("MEJB", "Remote", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public javax.management.MBeanInfo getMBeanInfo(javax.management.ObjectName arg0) throws javax.management.IntrospectionException, javax.management.InstanceNotFoundException, javax.management.ReflectionException, java.rmi.RemoteException
	{
		if(container.suspended)
			throw new jeus.ejb.ejbserver.EJBSuspendException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			
			javax.management.MBeanInfo returnValue = null;
			
			try {
				this.container.preInvoke(request);
				MEJBBean ejbBean = (MEJBBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] {arg0 };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("mejb", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method9Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new java.rmi.RemoteException("authorization failed for the method getMBeanInfo(javax.management.ObjectName)", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new java.rmi.RemoteException("run-as-principal setting failed for the moethod getMBeanInfo(javax.management.ObjectName)");
					}
				} catch(java.rmi.RemoteException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.getMBeanInfo(arg0);
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
				else if(request.exception instanceof javax.management.IntrospectionException) {
					throw (javax.management.IntrospectionException)request.exception;
				} 
				else if(request.exception instanceof javax.management.InstanceNotFoundException) {
					throw (javax.management.InstanceNotFoundException)request.exception;
				} 
				else if(request.exception instanceof javax.management.ReflectionException) {
					throw (javax.management.ReflectionException)request.exception;
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
				Management.class.getMethod("getListenerRegistry", new Class[] {});
			method10Rsc = new EJBMethodPermission("MEJB", "Remote", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public javax.management.j2ee.ListenerRegistration getListenerRegistry() throws java.rmi.RemoteException
	{
		if(container.suspended)
			throw new jeus.ejb.ejbserver.EJBSuspendException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			RemoteRequest request = new RemoteRequest();
			request.ejbObject = this;
			request.methodType = 0;
			
			javax.management.j2ee.ListenerRegistration returnValue = null;
			
			try {
				this.container.preInvoke(request);
				MEJBBean ejbBean = (MEJBBean) request.ejbContext.ejbBean;
				Object[] args = new Object[] { };
				try {
					try {
						EJBSecurity.setEJBSecurityContext("mejb", ejbBean, args, null);
					} catch (Throwable t) {
						throw new JeusRuntimeException("internal error during setEJBSecurityContext", t);
					}
					isSetEJBSecurityContext = true;
					try {
						EJBSecurity.checkEJBMethodPermission(method10Rsc);
					} catch (jeus.security.base.SecurityException ex) {
						throw new java.rmi.RemoteException("authorization failed for the method getListenerRegistry()", ex);
					} catch (jeus.security.base.ServiceException ex) {
						throw new JeusRuntimeException("internal error during checkEJBMethodPermission", ex);
					}
					try {
						if (runAsPrincipal != null)
							EJBSecurity.setEJBRunAsIdentity(runAsPrincipal);
					} catch(Exception se) {
						logger.log(Level.WARNING, "problem in handling the request",se);
						throw new java.rmi.RemoteException("run-as-principal setting failed for the moethod getListenerRegistry()");
					}
				} catch(java.rmi.RemoteException e) {
					logger.log(Level.WARNING, "problem in handling the request",e);
					throw e;
				}
				
				returnValue = 	ejbBean.getListenerRegistry();
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
				Management.class.getMethod("remove", new Class[] {});
			method11Rsc = new EJBMethodPermission("MEJB", "Remote", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public void remove() throws RemoveException, RemoteException
	{
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		RemoteRequest request = new RemoteRequest();
		request.methodType = 4;
		try {
			innerRemove(request, nullObjectArray, method11Rsc, false);
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
	
	static {
		try {
			getEJBHomeRsc = new EJBMethodPermission("MEJB", "Remote", Management.class.getMethod("getEJBHome", new Class[] {} ));
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage());}
	}
	
	
	transient private static EJBMethodPermission getHandleRsc;
	
	static {
		try {
			getHandleRsc = new EJBMethodPermission("MEJB", "Remote", Management.class.getMethod("getHandle", new Class[] {} ));
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage());}
	}
	
	
	transient private static EJBMethodPermission isIdenticalRRsc;
	
	static {
		try {
			isIdenticalRRsc = new EJBMethodPermission("MEJB", "Remote", Management.class.getMethod("isIdentical", new Class[] {javax.ejb.EJBObject.class} ));
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage());}
	}
	
	
	transient private static EJBMethodPermission getPrimaryKeyRRsc;
	
	static {
		try {
			getPrimaryKeyRRsc = new EJBMethodPermission("MEJB", "Remote", Management.class.getMethod("getPrimaryKey", new Class[] {} ));
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage());}
	}
	
	
	transient private static EJBMethodPermission getEJBLocalHomeRsc;
	
	
	transient private static EJBMethodPermission isIdenticalLRsc;
	
	
	transient private static EJBMethodPermission getPrimaryKeyLRsc;
	
	private static int type = 1;
	public int __jeus_getType()
	{
		return type;
	}
	
}
