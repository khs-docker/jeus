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

public final class MEJBHomeImpl128304011 extends EJBHomeImpl
 implements 
javax.management.j2ee.ManagementHome
{
	public MEJBHomeImpl128304011() throws RemoteException {
		super();
	}
	
	transient private static EJBMethodPermission method12Rsc;
	
	static {
		try {
			Method methodObj = 
				ManagementHome.class.getMethod("create", new Class[] {});
			method12Rsc = new EJBMethodPermission("MEJB", "Home", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public javax.management.j2ee.Management create() throws javax.ejb.CreateException, java.rmi.RemoteException
	{
		if(container.suspended)
			throw new jeus.ejb.ejbserver.EJBSuspendException("Services for this ejb bean is currently suspended");
		ExecutionContextStack.push(container.getContextMap());
		boolean isSetEJBSecurityContext = false;
		jeus.security.base.Subject runAsPrincipal = container.setRunAsName();
		container.incActiveThreadCount();
		try {
			MEJBObjectImpl1356265195 ejbObject;
			try {
				ejbObject = (MEJBObjectImpl1356265195) container.getEJBObjectInstance();
			} catch(RemoteException e) {
				logger.log(Level.WARNING, "problem in handling the request",e);
				throw e;
			}
			
			this.container.createMethodCalled();
			
			ExecutionContextStack.pop();
			try {
				if(isLocal)
					return (javax.management.j2ee.Management)ejbObject;
				else if(container.exportIIOP && container.isIIOP())
					return (javax.management.j2ee.Management)ejbObject.getIIOPStub();
				else
					return (javax.management.j2ee.Management)ejbObject.getRMIStub();
			} catch (ContainerException nsoe) {
				logger.log(Level.SEVERE, "fail to convert to stub", nsoe);
				throw new java.rmi.RemoteException("fail to convert to stub", nsoe);
			}
		} finally {
			container.decActiveThreadCount();
		}
	}
	
	transient private static EJBMethodPermission method13Rsc;
	
	static {
		try {
			Method methodObj = 
				ManagementHome.class.getMethod("remove", new Class[] {javax.ejb.Handle.class});
			method13Rsc = new EJBMethodPermission("MEJB", "Home", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public final void remove(Handle handle) throws RemoteException, RemoveException
	{
	}
	
	transient private static EJBMethodPermission method14Rsc;
	
	static {
		try {
			Method methodObj = 
				ManagementHome.class.getMethod("remove", new Class[] {java.lang.Object.class});
			method14Rsc = new EJBMethodPermission("MEJB", "Home", methodObj);
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage()); }
	}
	
	public final void remove(Object primaryKey) throws RemoveException, RemoteException
	{
		if(container.suspended)
			throw new jeus.ejb.ejbserver.EJBSuspendException("Services for this ejb bean is currently suspended");
		
		throw new RemoveException("EJB Session is not allowed to call remove(primaryKey)");
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
	
	static {
		try {
			getEJBMetaDataRsc = new EJBMethodPermission("MEJB", "Home", ManagementHome.class.getMethod("getEJBMetaData", new Class[] {} ));
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage());}
	}
	
	
	transient private static EJBMethodPermission getHomeHandleRsc;
	
	static {
		try {
			getHomeHandleRsc = new EJBMethodPermission("MEJB", "Home", ManagementHome.class.getMethod("getHomeHandle", new Class[] {} ));
		} catch (NoSuchMethodException ex) { ex.printStackTrace(); throw new RuntimeException(ex.getMessage());}
	}
	
}
