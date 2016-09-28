// This is generated by JEUS RMI Compiler.
// Do not edit any part of this.
package javax.management.j2ee;

import java.util.*;
import java.rmi.RemoteException;
import javax.naming.*;

public final class MEJBHomeImpl128304011_Stub
	extends jeus.ejb.bean.rmi.RMIStub
	implements javax.management.j2ee.ManagementHome
{
	private static final java.rmi.server.Operation[] operations = {
		new java.rmi.server.Operation("void remove(javax.ejb.Handle)"),
		new java.rmi.server.Operation("void remove(java.lang.Object)"),
		new java.rmi.server.Operation("javax.ejb.HomeHandle getHomeHandle()"),
		new java.rmi.server.Operation("javax.ejb.EJBMetaData getEJBMetaData()"),
		new java.rmi.server.Operation("javax.management.j2ee.Management create()")
	};
	
	private static final long interfaceHash = 902925309182443153L;
	
	// constructors
	public MEJBHomeImpl128304011_Stub() {
		super();
	}
	public MEJBHomeImpl128304011_Stub(java.rmi.server.RemoteRef ref) {
		super(ref);
	}
	
	// methods from remote interfaces
	
	// implementation of void remove(javax.ejb.Handle)
	public void remove(javax.ejb.Handle param_1)
		throws java.rmi.RemoteException, javax.ejb.RemoveException
	{
		try {
			String currExportName = null;
			java.rmi.server.RemoteObject currStub = this;
			
			while(true) {
				if(clusterSupport != null) //clustered
				{
					synchronized(clusterSupport) {
					currExportName = clusterSupport.getExportName();
					currStub = (java.rmi.server.RemoteObject) clusterSupport.getStub();
					}
				}
				
				java.rmi.server.RemoteRef ref = currStub.getRef();
				try {
					java.rmi.server.RemoteCall call = ref.newCall(currStub, operations, 0, interfaceHash);
					callClientInterceptors(call);
					try {
						java.io.ObjectOutput out = call.getOutputStream();
						out.writeObject(param_1);
						ref.invoke(call);
					} catch(Exception ex) {
						 setException(ex);
						 throw ex;
					}
					callAfterClientInterceptors(call);
					try {
						java.io.ObjectInput in = call.getInputStream();
					} catch (java.io.IOException e) {
						throw new java.rmi.UnmarshalException("error unmarshalling return", e);
					} finally {
						ref.done(call);
					}
					
					return;
				} catch(java.rmi.RemoteException ex) {
					if(clusterSupport != null) {
						clusterSupport.handleException(ex, currExportName, false);
					} else {
						throw ex;
					}
				}
				
			}
		} catch (java.rmi.ServerException e) {
			if(e.detail != null && e.detail instanceof java.rmi.RemoteException)
				throw (java.rmi.RemoteException)e.detail;
			else
			throw e;
		} catch (java.lang.RuntimeException e) {
			throw e;
		} catch (java.rmi.RemoteException e) {
			throw e;
		} catch (javax.ejb.RemoveException e) {
			throw e;
		} catch (java.lang.Exception e) {
			throw new java.rmi.UnexpectedException("undeclared checked exception", e);
		}
	}
	
	// implementation of void remove(java.lang.Object)
	public void remove(java.lang.Object param_1)
		throws java.rmi.RemoteException, javax.ejb.RemoveException
	{
		try {
			String currExportName = null;
			java.rmi.server.RemoteObject currStub = this;
			
			while(true) {
				if(clusterSupport != null) //clustered
				{
					synchronized(clusterSupport) {
					currExportName = clusterSupport.getExportName();
					currStub = (java.rmi.server.RemoteObject) clusterSupport.getStub();
					}
				}
				
				java.rmi.server.RemoteRef ref = currStub.getRef();
				try {
					java.rmi.server.RemoteCall call = ref.newCall(currStub, operations, 1, interfaceHash);
					callClientInterceptors(call);
					try {
						java.io.ObjectOutput out = call.getOutputStream();
						out.writeObject(param_1);
						ref.invoke(call);
					} catch(Exception ex) {
						 setException(ex);
						 throw ex;
					}
					callAfterClientInterceptors(call);
					try {
						java.io.ObjectInput in = call.getInputStream();
					} catch (java.io.IOException e) {
						throw new java.rmi.UnmarshalException("error unmarshalling return", e);
					} finally {
						ref.done(call);
					}
					
					return;
				} catch(java.rmi.RemoteException ex) {
					if(clusterSupport != null) {
						clusterSupport.handleException(ex, currExportName, false);
					} else {
						throw ex;
					}
				}
				
			}
		} catch (java.rmi.ServerException e) {
			if(e.detail != null && e.detail instanceof java.rmi.RemoteException)
				throw (java.rmi.RemoteException)e.detail;
			else
			throw e;
		} catch (java.lang.RuntimeException e) {
			throw e;
		} catch (java.rmi.RemoteException e) {
			throw e;
		} catch (javax.ejb.RemoveException e) {
			throw e;
		} catch (java.lang.Exception e) {
			throw new java.rmi.UnexpectedException("undeclared checked exception", e);
		}
	}
	
	// implementation of javax.ejb.HomeHandle getHomeHandle()
	public javax.ejb.HomeHandle getHomeHandle()
		throws java.rmi.RemoteException
	{
		javax.ejb.HomeHandle result;
		try {
			String currExportName = null;
			java.rmi.server.RemoteObject currStub = this;
			
			while(true) {
				if(clusterSupport != null) //clustered
				{
					synchronized(clusterSupport) {
					currExportName = clusterSupport.getExportName();
					currStub = (java.rmi.server.RemoteObject) clusterSupport.getStub();
					}
				}
				
				java.rmi.server.RemoteRef ref = currStub.getRef();
				try {
					java.rmi.server.RemoteCall call = ref.newCall(currStub, operations, 2, interfaceHash);
					callClientInterceptors(call);
					try {
						java.io.ObjectOutput out = call.getOutputStream();
						ref.invoke(call);
					} catch(Exception ex) {
						 setException(ex);
						 throw ex;
					}
					callAfterClientInterceptors(call);
					try {
						java.io.ObjectInput in = call.getInputStream();
						result = (javax.ejb.HomeHandle) in.readObject();
					} catch (java.io.IOException e) {
						throw new java.rmi.UnmarshalException("error unmarshalling return", e);
					} catch (java.lang.ClassNotFoundException e) {
						throw new java.rmi.UnmarshalException("error unmarshalling return", e);
					} finally {
						ref.done(call);
					}
					
					if(clusterSupport != null && (Object)result instanceof jeus.ejb.bean.objectbase.JEUSClusterStub) {
						((jeus.ejb.bean.objectbase.JEUSClusterStub)(Object)result).__jeus_setCluster(clusterSupport.getExportName(), clusterSupport.getCluster());
					}
					return result;
				} catch(java.rmi.RemoteException ex) {
					if(clusterSupport != null) {
						clusterSupport.handleException(ex, currExportName, false);
					} else {
						throw ex;
					}
				}
				
			}
		} catch (java.rmi.ServerException e) {
			if(e.detail != null && e.detail instanceof java.rmi.RemoteException)
				throw (java.rmi.RemoteException)e.detail;
			else
			throw e;
		} catch (java.lang.RuntimeException e) {
			throw e;
		} catch (java.rmi.RemoteException e) {
			throw e;
		} catch (java.lang.Exception e) {
			throw new java.rmi.UnexpectedException("undeclared checked exception", e);
		}
	}
	
	// implementation of javax.ejb.EJBMetaData getEJBMetaData()
	public javax.ejb.EJBMetaData getEJBMetaData()
		throws java.rmi.RemoteException
	{
		javax.ejb.EJBMetaData result;
		try {
			String currExportName = null;
			java.rmi.server.RemoteObject currStub = this;
			
			while(true) {
				if(clusterSupport != null) //clustered
				{
					synchronized(clusterSupport) {
					currExportName = clusterSupport.getExportName();
					currStub = (java.rmi.server.RemoteObject) clusterSupport.getStub();
					}
				}
				
				java.rmi.server.RemoteRef ref = currStub.getRef();
				try {
					java.rmi.server.RemoteCall call = ref.newCall(currStub, operations, 3, interfaceHash);
					callClientInterceptors(call);
					try {
						java.io.ObjectOutput out = call.getOutputStream();
						ref.invoke(call);
					} catch(Exception ex) {
						 setException(ex);
						 throw ex;
					}
					callAfterClientInterceptors(call);
					try {
						java.io.ObjectInput in = call.getInputStream();
						result = (javax.ejb.EJBMetaData) in.readObject();
					} catch (java.io.IOException e) {
						throw new java.rmi.UnmarshalException("error unmarshalling return", e);
					} catch (java.lang.ClassNotFoundException e) {
						throw new java.rmi.UnmarshalException("error unmarshalling return", e);
					} finally {
						ref.done(call);
					}
					
					if(clusterSupport != null && (Object)result instanceof jeus.ejb.bean.objectbase.JEUSClusterStub) {
						((jeus.ejb.bean.objectbase.JEUSClusterStub)(Object)result).__jeus_setCluster(clusterSupport.getExportName(), clusterSupport.getCluster());
					}
					return result;
				} catch(java.rmi.RemoteException ex) {
					if(clusterSupport != null) {
						clusterSupport.handleException(ex, currExportName, false);
					} else {
						throw ex;
					}
				}
				
			}
		} catch (java.rmi.ServerException e) {
			if(e.detail != null && e.detail instanceof java.rmi.RemoteException)
				throw (java.rmi.RemoteException)e.detail;
			else
			throw e;
		} catch (java.lang.RuntimeException e) {
			throw e;
		} catch (java.rmi.RemoteException e) {
			throw e;
		} catch (java.lang.Exception e) {
			throw new java.rmi.UnexpectedException("undeclared checked exception", e);
		}
	}
	
	// implementation of javax.management.j2ee.Management create()
	public javax.management.j2ee.Management create()
		throws javax.ejb.CreateException, java.rmi.RemoteException
	{
		javax.management.j2ee.Management result;
		try {
			String currExportName = null;
			java.rmi.server.RemoteObject currStub = this;
			
			while(true) {
				if(clusterSupport != null) //clustered
				{
					synchronized(clusterSupport) {
					currExportName = clusterSupport.getExportName();
					currStub = (java.rmi.server.RemoteObject) clusterSupport.getStub();
					}
				}
				
				java.rmi.server.RemoteRef ref = currStub.getRef();
				try {
					java.rmi.server.RemoteCall call = ref.newCall(currStub, operations, 4, interfaceHash);
					callClientInterceptors(call);
					try {
						java.io.ObjectOutput out = call.getOutputStream();
						ref.invoke(call);
					} catch(Exception ex) {
						 setException(ex);
						 throw ex;
					}
					callAfterClientInterceptors(call);
					try {
						java.io.ObjectInput in = call.getInputStream();
						result = (javax.management.j2ee.Management) in.readObject();
					} catch (java.io.IOException e) {
						throw new java.rmi.UnmarshalException("error unmarshalling return", e);
					} catch (java.lang.ClassNotFoundException e) {
						throw new java.rmi.UnmarshalException("error unmarshalling return", e);
					} finally {
						ref.done(call);
					}
					
					if(clusterSupport != null && (Object)result instanceof jeus.ejb.bean.objectbase.JEUSClusterStub) {
						((jeus.ejb.bean.objectbase.JEUSClusterStub)(Object)result).__jeus_setCluster(clusterSupport.getExportName(), clusterSupport.getCluster());
					}
					return result;
				} catch(java.rmi.RemoteException ex) {
					if(clusterSupport != null) {
						clusterSupport.handleException(ex, currExportName, false);
					} else {
						throw ex;
					}
				}
				
			}
		} catch (java.rmi.ServerException e) {
			if(e.detail != null && e.detail instanceof java.rmi.RemoteException)
				throw (java.rmi.RemoteException)e.detail;
			else
			throw e;
		} catch (java.lang.RuntimeException e) {
			throw e;
		} catch (java.rmi.RemoteException e) {
			throw e;
		} catch (javax.ejb.CreateException e) {
			throw e;
		} catch (java.lang.Exception e) {
			throw new java.rmi.UnexpectedException("undeclared checked exception", e);
		}
	}
}