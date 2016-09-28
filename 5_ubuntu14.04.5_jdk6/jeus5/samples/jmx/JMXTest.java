import jeus.connector.stats.*;

import jeus.management.JMXConstants;
import jeus.management.RemoteMBeanServerFactory;

import jeus.management.j2ee.*;

import jeus.management.snmp.adaptor.SnmpSupportList;

import jeus.server.service.*;

import java.io.*;

import java.util.*;
import java.util.Map;

import javax.management.MBeanInfo;
import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.j2ee.statistics.*;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

import javax.naming.Context;


public class JMXTest
{
   public static Hashtable queries = SnmpSupportList.classes;
   public static Hashtable attributes = new Hashtable();

   static
   {
      Vector attrs = null;

// Node
        attrs = new Vector();
		attributes.put("J2EEDomain", attrs);
		attrs.add("objectName");
		attrs.add("servers");

		attrs = new Vector();
		attributes.put("J2EEServer", attrs);
		attrs.add("objectName");
		attrs.add("serverVersion");
		attrs.add("serverVendor");
		attrs.add("javaVMs");
		attrs.add("deployedObjects");
		attrs.add("resources");
		attrs.add("jeusServices");
		attrs.add("engines");
		attrs.add("enginesFromDescriptor");
		attrs.add("distributedModules");
		attrs.add("nodeName");
		attrs.add("appPaths");

		attrs = new Vector();
		attributes.put("JVM", attrs);
		attrs.add("objectName");
		attrs.add("javaVersion");
		attrs.add("javaVendor");
		attrs.add("node");
		attrs.add("oSName");
		attrs.add("oSVersion");
		attrs.add("allProperties");
		attrs.add("heapSize-upperBound");
		attrs.add("heapSize-lowerBound");
		attrs.add("heapSize-highWaterMark");
		attrs.add("heapSize-lowWaterMark");
		attrs.add("heapSize-current");
		attrs.add("upTime-count");
		attrs.add("totalSize-highWaterMark");
		attrs.add("totalSize-lowWaterMark");
		attrs.add("totalSize-current");

		attrs = new Vector();
		attributes.put("Servlet", attrs);
		attrs.add("objectName");
		attrs.add("averageExecutionTime");
		attrs.add("servletInfo");
		attrs.add("serviceTime-count");
		attrs.add("serviceTime-maxTime");
		attrs.add("serviceTime-minTime");
		attrs.add("serviceTime-totalTime");
		
		attrs = new Vector();
		attributes.put("EJBEngineMo", attrs);
		attrs.add("objectName");
		attrs.add("blockThreadCount");
		attrs.add("stats");
		

		attrs = new Vector();
		attributes.put("ContextGroupMo", attrs);
		attrs.add("objectName");
		attrs.add("SessionContainer");
		attrs.add("SessionTimeout");
		attrs.add("WebListeners");
		attrs.add("WebModules");
		attrs.add("deployObjects");

		attrs = new Vector();
		attributes.put("WebEngineMo", attrs);
		attrs.add("objectName");
		attrs.add("checkClassReload");
		attrs.add("checkDbConnectionPool");
		attrs.add("checkSession");
		attrs.add("checkThreadPool");
		attrs.add("ConfigInfo");
		attrs.add("Configuration");
		attrs.add("ContextGroupNames");
		attrs.add("ContextGroups");
		attrs.add("DBConnectionPool");
		attrs.add("ServerStatus");
		attrs.add("SessionContainer");
		attrs.add("WebtConnectionGroup");
		attrs.add("FreeMemory-count");
		attrs.add("TotalMemory-count");

		attrs = new Vector();
		attributes.put("WebListenerMo", attrs);
		attrs.add("objectName");
		attrs.add("ThreadPools");
		attrs.add("Type");
		attrs.add("Port");
		attrs.add("readTimeout");
		attrs.add("reconnectTimeout");
		attrs.add("postdataReadTimeout");		

		attrs = new Vector();
		attributes.put("JEUSManager", attrs);
		attrs.add("objectName");
		attrs.add("AliveNodeNames");
		attrs.add("j2eeServerNames"); 
		attrs.add("j2eeServers");
		attrs.add("javaVMs");
		attrs.add("jeusHome");
		attrs.add("jeusServices");
		attrs.add("NodesFromDescriptor");
		attrs.add("PID");
		attrs.add("serverVendor");
		attrs.add("serverVersion");		


		attrs = new Vector();
		attributes.put("SubjectMo", attrs);
		attrs.add("objectName");
		attrs.add("SubjectNames");		


		attrs = new Vector();
		attributes.put("SecurityDomainMo", attrs);
		attrs.add("objectName");
		attrs.add("Description");
		attrs.add("DomainName");
		attrs.add("Policys");
		attrs.add("Subjects");
		

		attrs = new Vector();
		attributes.put("PolicyMo", attrs);
		attrs.add("objectName");
		attrs.add("PolicyIds");
		

		attrs = new Vector();
		attributes.put("SecurityMo", attrs);
		attrs.add("objectName");
		attrs.add("CurrentDomain");
		attrs.add("SecurityDomains");
		
		attrs = new Vector();
		attributes.put("JMSEngineMo", attrs);
		attrs.add("objectName");
		attrs.add("EngineName");
		attrs.add("JMSResource");

// Container
        attrs = new Vector();
		attributes.put("J2EEApplication", attrs);
		attrs.add("objectName");
		attrs.add("deploymentDescriptor");
		attrs.add("server");
		attrs.add("modules");
		attrs.add("moduleType");
		attrs.add("applicationType");
		attrs.add("jeusDeploymentPlan");
		attrs.add("targetModuleID");
		
        attrs = new Vector();
		attributes.put("AppClientModule", attrs);
		attrs.add("objectName");
		attrs.add("deploymentDescriptor");
		attrs.add("server");
		attrs.add("javaVMs");
		attrs.add("applicationType");
		attrs.add("moduleType");
		attrs.add("jeusDeploymentPlan");
		attrs.add("targetModuleID");
		
        attrs = new Vector();
		attributes.put("EJBModule", attrs);
		attrs.add("objectName");
		attrs.add("clientViewPath");
		attrs.add("ejbCount");
		attrs.add("ejbs");
		attrs.add("deploymentDescriptor");
		attrs.add("javaVMs");
		attrs.add("server");
		attrs.add("jeusDeploymentPlan");
		attrs.add("targetModuleID");
		attrs.add("moduleType");
		attrs.add("applicationType");
		
        attrs = new Vector();
        attributes.put("MessageDrivenBean", attrs);
        attrs.add("objectName");
        attrs.add("createCount-count");
        attrs.add("removeCount-count");
        attrs.add("requestCount-count");
        attrs.add("committedCount-count");
        attrs.add("rolledbackCount-count");
        attrs.add("timeoutRolledbackCount-count");
        attrs.add("messageCount-count");
        attrs.add("totalEJBBeanCount-highWaterMark");
        attrs.add("totalEJBBeanCount-lowWaterMark");
        attrs.add("totalEJBBeanCount-current");
        attrs.add("activeEJBBeanCount-highWaterMark");
        attrs.add("activeEJBBeanCount-lowWaterMark");
        attrs.add("activeEJBBeanCount-current");
		
		attrs = new Vector();
		attributes.put("EntityBean", attrs);
		attrs.add("objectName");
		attrs.add("createCount-count");
		attrs.add("removeCount-count");
		attrs.add("requestCount-count");
		attrs.add("committedCount-count");
		attrs.add("rolledbackCount-count");
		attrs.add("timeoutRolledbackCount-count");
		attrs.add("readyCount-highWaterMark");
		attrs.add("readyCount-lowWaterMark");
		attrs.add("readyCount-current");
		attrs.add("pooledCount-highWaterMark");
		attrs.add("pooledCount-lowWaterMark");
		attrs.add("pooledCount-current");
		attrs.add("autoRemovedEJBObjectCount-count");
		attrs.add("totalEJBBeanCount-highWaterMark");
		attrs.add("totalEJBBeanCount-lowWaterMark");
		attrs.add("totalEJBBeanCount-current");
		attrs.add("activeEJBBeanCount-highWaterMark");
		attrs.add("activeEJBBeanCount-lowWaterMark");
		attrs.add("activeEJBBeanCount-current");
		attrs.add("totalThreadCount-highWaterMark");
		attrs.add("totalThreadCount-lowWaterMark");
		attrs.add("totalThreadCount-current");
		attrs.add("activeThreadCount-highWaterMark");
		attrs.add("activeThreadCount-lowWaterMark");
		attrs.add("activeThreadCount-current");
		attrs.add("totalEJBObjectCount-highWaterMark");
		attrs.add("totalEJBObjectCount-lowWaterMark");
		attrs.add("totalEJBObjectCount-current");
		attrs.add("activeEJBObjectCount-highWaterMark");
		attrs.add("activeEJBObjectCount-lowWaterMark");
		attrs.add("activeEJBObjectCount-current");
		attrs.add("aaaaaaaaaaaaaaaaaaaaaaa");
		attrs.add("passiveCount-highWaterMark");
		attrs.add("passiveCount-lowWaterMark");
		attrs.add("passiveCount-current");
		
		attrs = new Vector();
		attributes.put("StatefulSessionBean", attrs);
		attrs.add("objectName");
		attrs.add("createCount-count");
		attrs.add("removeCount-count");
		attrs.add("requestCount-count");
		attrs.add("committedCount-count");
		attrs.add("rolledbackCount-count");
		attrs.add("timeoutRolledbackCount-count");
		attrs.add("methodReadyCount-highWaterMark");
		attrs.add("methodReadyCount-lowWaterMark");
		attrs.add("methodReadyCount-current");
		attrs.add("passiveCount-highWaterMark");
		attrs.add("passiveCount-lowWaterMark");
		attrs.add("passiveCount-current");
		attrs.add("autoRemovedEJBObjectCount-count");
		attrs.add("totalEJBBeanCount-highWaterMark");
		attrs.add("totalEJBBeanCount-lowWaterMark");
		attrs.add("totalEJBBeanCount-current");
		attrs.add("activeEJBBeanCount-highWaterMark");
		attrs.add("activeEJBBeanCount-lowWaterMark");
		attrs.add("activeEJBBeanCount-current");
		attrs.add("totalThreadCount-highWaterMark");
		attrs.add("totalThreadCount-lowWaterMark");
		attrs.add("totalThreadCount-current");
		attrs.add("activeThreadCount-highWaterMark");
		attrs.add("activeThreadCount-lowWaterMark");
		attrs.add("activeThreadCount-current");
		attrs.add("totalEJBObjectCount-highWaterMark");
		attrs.add("totalEJBObjectCount-lowWaterMark");
		attrs.add("totalEJBObjectCount-current");
		attrs.add("activeEJBObjectCount-highWaterMark");
		attrs.add("activeEJBObjectCount-lowWaterMark");
		attrs.add("activeEJBObjectCount-current");
		attrs.add("fileDBSizeCount-highWaterMark");
		attrs.add("fileDBSizeCount-lowWaterMark");
		attrs.add("fileDBSizeCount-current");

		attrs = new Vector();
		attributes.put("StatelessSessionBean", attrs);
		attrs.add("objectName");
		attrs.add("createCount-count");
		attrs.add("removeCount-count");
		attrs.add("requestCount-count");
		attrs.add("committedCount-count");
		attrs.add("rolledbackCount-count");
		attrs.add("timeoutRolledbackCount-count");
		attrs.add("methodReadyCount-highWaterMark");
		attrs.add("methodReadyCount-lowWaterMark");
		attrs.add("methodReadyCount-current");
		attrs.add("totalEJBBeanCount-highWaterMark");
		attrs.add("totalEJBBeanCount-lowWaterMark");
		attrs.add("totalEJBBeanCount-current");
		attrs.add("activeEJBBeanCount-highWaterMark");
		attrs.add("activeEJBBeanCount-lowWaterMark");
		attrs.add("activeEJBBeanCount-current");
		attrs.add("totalThreadCount-highWaterMark");
		attrs.add("totalThreadCount-lowWaterMark");
		attrs.add("totalThreadCount-current");
		attrs.add("activeThreadCount-highWaterMark");
		attrs.add("activeThreadCount-lowWaterMark");
		attrs.add("activeThreadCount-current");

		attrs = new Vector();
		attributes.put("WebModule", attrs);
		attrs.add("objectName");
		attrs.add("deploymentDescriptor");
		attrs.add("server");
		attrs.add("javaVMs");
		attrs.add("servlets");
		attrs.add("contextGroupObjectName");
		attrs.add("contextGroup");
		attrs.add("realDocBase");
		attrs.add("jeusDeploymentPlan");
		attrs.add("targetModuleID");
		attrs.add("moduleType");
		attrs.add("applicationType");
		attrs.add("autoReload");
		attrs.add("requestCount-count");
		attrs.add("allSessionsSize-count");
		attrs.add("activeSessionsSize-count");
		attrs.add("passivateSessionsSize-count");
		attrs.add("localSessionsSize-count");
		attrs.add("processingTime-count");
		
		attrs = new Vector();
		attributes.put("ResourceAdapterModule", attrs);
		attrs.add("objectName");
		attrs.add("deploymentDescriptor");
		attrs.add("server");
		attrs.add("javaVMs");
		attrs.add("moduleType");
		attrs.add("applicationType");
		attrs.add("jeusDeploymentPlan");
		attrs.add("targetModuleID");
		attrs.add("min");
		attrs.add("max");
		attrs.add("step");
		attrs.add("keepAliveTime");
		attrs.add("releaseTimeout");
		attrs.add("rejectTimeout");
		
		attrs = new Vector();
		attributes.put("ResourceAdapter", attrs);
		attrs.add("objectName");
		
		attrs = new Vector();
		attributes.put("JavaMailResource", attrs);
		attrs.add("objectName");
		attrs.add("property");
		
        attrs = new Vector();
		attributes.put("JCAResource", attrs);
		attrs.add("objectName");
		attrs.add("cMInfo");
		attrs.add("dissociationtimeout");
		attrs.add("invalidationtimeout");
		attrs.add("max");
		attrs.add("maxDisposableCount");
		attrs.add("maxWaiter");
		attrs.add("min");
		attrs.add("pooledTimeout");
		attrs.add("skipMatching");
		attrs.add("useWrapper");
		attrs.add("waitingTime");
		attrs.add("waitTrial");

        attrs = new Vector();
		attributes.put("JCAConnectionFactory", attrs);
		attrs.add("objectName");
		attrs.add("cMInfo");
		attrs.add("min");
		attrs.add("max");
		attrs.add("maxWaiter");
		attrs.add("maxDisposableCount");
		attrs.add("waitTrial");
		attrs.add("waitingTime");
		attrs.add("pooledTimeout");
		attrs.add("dissociationtimeout");
		attrs.add("invalidationtimeout");
		attrs.add("skipMatching");
		attrs.add("useWrapper");

        attrs = new Vector();
		attributes.put("JCAManagedConnectionFactory", attrs);
		attrs.add("objectName");
		attrs.add("j2EEType");
		attrs.add("permissionName");

		attrs = new Vector();
		attributes.put("JDBCResource", attrs);
		attrs.add("objectName");
		attrs.add("jdbcDataSources");
		attrs.add("cPInfo");
        attrs.add("connectionPools-createCount-count");
        attrs.add("connectionPools-closeCount-count");
        attrs.add("connectionPools-poolSize-upperBound");
        attrs.add("connectionPools-poolSize-lowerBound");
        attrs.add("connectionPools-poolSize-highWaterMark");
        attrs.add("connectionPools-poolSize-lowWaterMark");
        attrs.add("connectionPools-poolSize-current");
        attrs.add("connectionPools-freePoolSize-upperBound");
        attrs.add("connectionPools-freePoolSize-lowerBound");
        attrs.add("connectionPools-freePoolSize-highWaterMark");
        attrs.add("connectionPools-freePoolSize-lowWaterMark");
        attrs.add("connectionPools-freePoolSize-current");
        attrs.add("connectionPools-waitingThreadCount-highWaterMark");
        attrs.add("connectionPools-waitingThreadCount-lowWaterMark");
        attrs.add("connectionPools-waitingThreadCount-current");
        attrs.add("connectionPools-reConnectCount-count");
        attrs.add("connectionPools-waitTime-count");
        attrs.add("connectionPools-waitTime-maxTime");
        attrs.add("connectionPools-waitTime-minTime");
        attrs.add("connectionPools-waitTime-totalTime");
        attrs.add("connectionPools-useTime-count");
        attrs.add("connectionPools-useTime-maxTime");
        attrs.add("connectionPools-useTime-minTime");
        attrs.add("connectionPools-useTime-totalTime");
        attrs.add("connectionPools-jdbcDataSource");

		attrs = new Vector();
		attributes.put("JDBCDataSource", attrs);
		attrs.add("objectName");
		attrs.add("jdbcDriver");
		attrs.add("config");
		attrs.add("cPInfo");
		attrs.add("jdbcDataSource");
		attrs.add("ReConnectCount-Count");
        attrs.add("createCount-count");
        attrs.add("closeCount-count");
        attrs.add("poolSize-upperBound");
        attrs.add("poolSize-lowerBound");
        attrs.add("poolSize-highWaterMark");
        attrs.add("poolSize-lowWaterMark");
        attrs.add("poolSize-current");
        attrs.add("freePoolSize-upperBound");
        attrs.add("freePoolSize-lowerBound");
        attrs.add("freePoolSize-highWaterMark");
        attrs.add("freePoolSize-lowWaterMark");
        attrs.add("freePoolSize-current");
        attrs.add("waitingThreadCount-highWaterMark");
        attrs.add("waitingThreadCount-lowWaterMark");
        attrs.add("waitingThreadCount-current");
        attrs.add("waitTime-count");
        attrs.add("waitTime-maxTime");
        attrs.add("waitTime-minTime");
        attrs.add("waitTime-totalTime");
        attrs.add("useTime-count");
        attrs.add("useTime-maxTime");
        attrs.add("useTime-minTime");
        attrs.add("useTime-totalTime");
        
		attrs = new Vector();
		attributes.put("JDBCDriver", attrs);
		attrs.add("objectName");
		
		attrs = new Vector();
		attributes.put("JMSResource", attrs);
		attrs.add("objectName");
		attrs.add("clusterInfo");
		attrs.add("jMSConnectionFactoryResourceNames");
		attrs.add("jMSDestinationResourceNames");
		attrs.add("jMSClientResourceNames");
		attrs.add("freeMemory");
		attrs.add("totalMemory");
		attrs.add("jMSConnectionFactoryResources");

		attrs = new Vector();
		attributes.put("JNDIResource", attrs);
		attrs.add("objectName");
		
		attrs = new Vector();
		attributes.put("JTAResource", attrs);
		attrs.add("objectName");
		attrs.add("AverageExecutionTime");
		attrs.add("activeTimeout");
		attrs.add("prepareTimeout");
		attrs.add("preparedTimeout");
		attrs.add("commitTimeout");
		attrs.add("recoveryTimeout");
		attrs.add("uncompletedTimeout");
		attrs.add("heuristicRollback");
		attrs.add("resolution");
		attrs.add("threadPool");
		attrs.add("trobles");
		attrs.add("activeCount-count");
		attrs.add("committedCount-count");
		attrs.add("rolledbackCount-count");
		attrs.add("timeoutCount-count");
		attrs.add("timeoutRolledbackCount-count");
		attrs.add("activeTimeoutCount-count");
		attrs.add("prepareTimeoutCount-count");
		attrs.add("preparedTimeoutCount-count");
		attrs.add("commitTimeoutCount-count");
		attrs.add("heuristicRolledbackCount-count");
		attrs.add("executionTime-count");
		attrs.add("executionTime-maxTime");
		attrs.add("executionTime-minTime");
		attrs.add("executionTime-totalTime");

		attrs = new Vector();
		attributes.put("URLResource", attrs);
		attrs.add("objectName");
		attrs.add("uRLInfo");
		
		attrs = new Vector();
		attributes.put("JMSConnectionResource", attrs);
		attrs.add("objectName");
		attrs.add("jMSSessionResourceNames");
		attrs.add("J2EEType");
		attrs.add("PermissionName");

        attrs = new Vector();
		attributes.put("JMSConsumerResource", attrs);
		attrs.add("objectName");
		attrs.add("destinationResourceObjectName");
		attrs.add("durableSubscriberResourceObjectName");
		attrs.add("sendTimeAvg");

        attrs = new Vector();
		attributes.put("JMSProducerResource", attrs);
		attrs.add("objectName");
		attrs.add("destinationResourceObjectName");
		attrs.add("durableSubscriberResourceObjectName");
		attrs.add("sendTimeAvg");
		attrs.add("destination");
		attrs.add("messageCount-count");
		attrs.add("pendingMessageCount-count");
		attrs.add("expiredMessageCount-count");
		attrs.add("messageWaitTime-count");
		attrs.add("messageWaitTime-maxTime");
		attrs.add("messageWaitTime-minTime");
		attrs.add("messageWaitTime-totalTime");
		attrs.add("sendTime-count");
		attrs.add("sendTime-maxTime");
		attrs.add("sendTime-minTime");
		attrs.add("sendTime-totalTime");

		attrs = new Vector();
		attributes.put("JMSSessionResource", attrs);
		attrs.add("objectName");
		attrs.add("jMSEndPointConsumerNames");
        attrs.add("messageCount-count");
        attrs.add("pendingMessageCount-count");
        attrs.add("expiredMessageCount-count");
        attrs.add("messageWaitTime-count");
        attrs.add("messageWaitTime-maxTime");
        attrs.add("messageWaitTime-minTime");
        attrs.add("messageWaitTime-totalTime");
        attrs.add("durableSubscriptionCount-count");
        attrs.add("producers-destination");
        attrs.add("producers-messageCount-count");
        attrs.add("producers-pendingMessageCount-count");
        attrs.add("producers-expiredMessageCount-count");
        attrs.add("producers-messageWaitTime-count");
        attrs.add("producers-messageWaitTime-maxTime");
        attrs.add("producers-messageWaitTime-minTime");
        attrs.add("producers-messageWaitTime-totalTime");
        attrs.add("consumers-origin");
        attrs.add("consumers-messageCount-count");
        attrs.add("consumers-pendingMessageCount-count");
        attrs.add("consumers-expiredMessageCount-count");
        attrs.add("consumers-messageWaitTime-count");
        attrs.add("consumers-messageWaitTime-maxTime");
        attrs.add("consumers-messageWaitTime-minTime");
        attrs.add("consumers-messageWaitTime-totalTime");
        attrs.add("sendTime-count");
        attrs.add("sendTime-maxTime");
        attrs.add("sendTime-minTime");
        attrs.add("sendTime-totalTime");
		attrs.add("commitCount-count");
		attrs.add("rollbackCount-count");
		attrs.add("transactionCount-count");
		
		attrs = new Vector();
		attributes.put("DBConnectionPoolMo", attrs);
		attrs.add("objectName");
		attrs.add("blockDuration");
		attrs.add("dBConnectionPoolInfo-dBConnectionInfo");
		attrs.add("dBConnectionPoolInfo-currentPoolSize");
		attrs.add("dBConnectionPoolInfo-freeConnectionNum");
		attrs.add("dBConnectionPoolInfo-activeConnectionNum");
		attrs.add("dBConnectionPoolInfo-connectionPoolID");
		attrs.add("dBConnectionPoolInfo-connectionPoolingRule");
		attrs.add("dBConnectionPoolInfo-connectionUrl");
		attrs.add("dBConnectionPoolInfo-driverClassName");
		attrs.add("dBConnectionPoolInfo-connectionArgs");
		attrs.add("dBConnectionPoolInfo-initCapacity");
		attrs.add("dBConnectionPoolInfo-maxCapacity");
		attrs.add("dBConnectionPoolInfo-incrementRate");
		attrs.add("dBConnectionPoolInfo-maxIdleTime");
		attrs.add("dBConnectionPoolInfo-dynamicIncrement");
		attrs.add("dBConnectionPoolInfo-connectionTimeOut");
		attrs.add("dBConnectionPoolInfo-loginDelay");
		attrs.add("dBConnectionPoolInfo-closeDelay");
		attrs.add("dBConnectionPoolInfo-closeLongActiveConnection");
		attrs.add("dBConnectionPoolInfo-maxActiveTime");
		attrs.add("dBConnectionPoolInfo-maxUseCount");
		attrs.add("dBConnectionPoolInfo-checkQuery");
		attrs.add("min");
		attrs.add("max");
		attrs.add("step");
		attrs.add("dBConnectionPoolInfo-maxAliveTime");
		attrs.add("maxIdleTime");
		attrs.add("maxAliveTime");
		attrs.add("dynamicIncrement");
		attrs.add("getConnectionTimeout");
		attrs.add("closeLongActiveConnection");
		attrs.add("maxActiveTime");
		attrs.add("maxUseCount");
		attrs.add("activeThreadCount-count");
		attrs.add("blockThreadCount-count");
		attrs.add("allThreadCount-count");

		attrs = new Vector();
		attributes.put("ThreadPoolMo", attrs);
		attrs.add("objectName");
		attrs.add("min");
		attrs.add("max");
		attrs.add("step");
		attrs.add("maxIdleTime");
		attrs.add("maxQueue");
		attrs.add("maxWaitQueue");
		attrs.add("activeThreadCount-count");
		attrs.add("blockThreadCount-count");
		attrs.add("allThreadCount-count");
		attrs.add("maxThreadCount-count");
		attrs.add("waitQueueCount-count");
		attrs.add("threadState_ALL_INFO");
	
		attrs = new Vector();
		attributes.put("WebtConnectionGroupMo", attrs);
		attrs.add("objectName");
		attrs.add("totalConnectionCount-count");
		attrs.add("freeConnectionCount-count");
		attrs.add("usedConnectionCount-count");
								
		attrs = new Vector();
		attributes.put("JMSClientResource", attrs);
		attrs.add("objectName");
		attrs.add("hostAddress");
		attrs.add("port");
		attrs.add("jMSConnectionResourceNames");
		attrs.add("namePartString");
		attrs.add("connectionCount-count");
        attrs.add("commitCount-count");
        attrs.add("rollbackCount-count");
        attrs.add("transactionCount-count");

		attrs = new Vector();
		attributes.put("JMSQueueConnectionFactoryResource", attrs);
		attrs.add("objectName");
		attrs.add("name");
		
		attrs = new Vector();
		attributes.put("JMSQueueDestinationResource", attrs);
		attrs.add("objectName");
		attrs.add("name");
		attrs.add("objectName");
		attrs.add("exportName");
		attrs.add("type");
		attrs.add("destination");
		attrs.add("jMSConsumerResourceNames");
		attrs.add("remainingMessages");
		attrs.add("messageCount-count");
		attrs.add("pendingMessageCount-count");
		attrs.add("expiredMessageCount-count");
		attrs.add("messageWaitTime-count");
		attrs.add("messageWaitTime-maxTime");
		attrs.add("messageWaitTime-minTime");
		attrs.add("messageWaitTime-totalTime");
		attrs.add("sendTime-count");
		attrs.add("sendTime-maxTime");
		attrs.add("sendTime-minTime");
		attrs.add("sendTime-totalTime");

		attrs = new Vector();
		attributes.put("JMSDurableSubscriberResource", attrs);
		attrs.add("objectName");
		attrs.add("name");
		attrs.add("clientID");
		attrs.add("remainingMessages");
		attrs.add("selector");
		attrs.add("jMSConsumerResourceName");
		attrs.add("messageInfo");

		attrs = new Vector();
		attributes.put("JMSTopicConnectionFactoryResource", attrs);
		attrs.add("objectName");
		attrs.add("name");
		
		attrs = new Vector();
		attributes.put("JMSTopicDestinationResource", attrs);
		attrs.add("objectName");
		attrs.add("name");
		attrs.add("exportName");
		attrs.add("type");
		attrs.add("jMSDurableSubscriberResourceNames");
		attrs.add("destination");
		attrs.add("jMSConsumerResourceNames");
		attrs.add("messageCount-count");
		attrs.add("pendingMessageCount-count");
		attrs.add("expiredMessageCount-count");
		attrs.add("messageWaitTime-count");
		attrs.add("messageWaitTime-maxTime");
		attrs.add("messageWaitTime-minTime");
		attrs.add("messageWaitTime-totalTime");
		attrs.add("sendTime-count");
		attrs.add("sendTime-maxTime");
		attrs.add("sendTime-minTime");
		attrs.add("sendTime-totalTime");

		attrs = new Vector();
		attributes.put("ThreadPool", attrs);
		attrs.add("objectName");
		attrs.add("threadOperationInfo");
		attrs.add("max");
		attrs.add("period");
		attrs.add("activeThreadCount-count");
		attrs.add("allThreadCount-count");
		attrs.add("blockThreadCount-count");
		attrs.add("maxThreadCount-count");
		attrs.add("waitQueueCount-count");
		
		attrs = new Vector();
		attributes.put("WebServerInfo", attrs);
		attrs.add("objectName");
		attrs.add("nodeInfo");
		attrs.add("svrAllInfo");
		
		attrs.add("svrCount-count");
		attrs.add("execCount-count");
		attrs.add("avgTime-count");
		attrs.add("avgTime-maxTime");
		attrs.add("avgTime-minTime");
		attrs.add("avgTime-totalTime");

		attrs = new Vector();
		attributes.put("ExternalWebtDataSource", attrs);
		attrs.add("objectName");
		attrs.add("type");
		attrs.add("port");
		attrs.add("webtProperties");
		attrs.add("exportName");
		attrs.add("hostAddr");
		attrs.add("level");
		attrs.add("createCount-count");
		attrs.add("closeCount-count");
		attrs.add("poolSize-upperBound");
		attrs.add("poolSize-lowerBound");
		attrs.add("poolSize-highWaterMark");
		attrs.add("poolSize-lowWaterMark");
		attrs.add("poolSize-current");
		attrs.add("freePoolSize-upperBound");
		attrs.add("freePoolSize-lowerBound");
		attrs.add("freePoolSize-highWaterMark");
		attrs.add("freePoolSize-lowWaterMark");
		attrs.add("freePoolSize-current");
		attrs.add("waitingThreadCount-highWaterMark");
		attrs.add("waitingThreadCount-lowWaterMark");
		attrs.add("waitingThreadCount-current");
		attrs.add("reConnectCount-count");
		attrs.add("totalConnectionCount-count");
		attrs.add("freeConnectionCount-count");
		attrs.add("activeConnectionCount-count");
		
        attrs = new Vector();
		attributes.put("J2EEDeployedObject", attrs);
		attrs.add("objectName");
		attrs.add("ApplicationType");
		attrs.add("deploymentDescriptor");
		attrs.add("ModuleType");
		attrs.add("server");
		attrs.add("TargetModuleID");

        attrs = new Vector();
		attributes.put("J2EEManagedObject", attrs);
		attrs.add("objectName");
		attrs.add("J2EEType");
		attrs.add("PermissionName");

        attrs = new Vector();
		attributes.put("J2EEModule", attrs);
		attrs.add("objectName");
		attrs.add("javaVMs");
		attrs.add("applicationType");
		attrs.add("deploymentDescriptor");
		attrs.add("jeusDeploymentPlan");
		attrs.add("moduleType");
		attrs.add("server");
		attrs.add("targetModuleID");

        attrs = new Vector();
		attributes.put("JAXResource", attrs);
		attrs.add("objectName");
		attrs.add("AuthenticationMethod");
		attrs.add("JaxrProperty");
		attrs.add("LifeCycleManagerURL");
		attrs.add("QueryManagerURL");
		attrs.add("j2EEType");
		attrs.add("permissionName");

		attrs = new Vector();
		attributes.put("ResourceAdaptorModule", attrs);
		attrs.add("objectName");
		attrs.add("keepAliveTime");
		attrs.add("max");
		attrs.add("min");
		attrs.add("rejectTimeout");
		attrs.add("releaseTimeout");
		attrs.add("step");

		attrs = new Vector();
		attributes.put("JMSConnectionFactoryResource", attrs);
		attrs.add("objectName");
		attrs.add("Name");

		attrs = new Vector();
		attributes.put("JMSDestinationResource", attrs);
		attrs.add("objectName");
		attrs.add("Destination");
		attrs.add("ExportName");
		attrs.add("JMSConsumerResourceNames");
		attrs.add("Name");
		attrs.add("Type");

		attrs = new Vector();
		attributes.put("JMSEndPointResource", attrs);
		attrs.add("objectName");
		attrs.add("Destination");
		attrs.add("DestinationResourceObjectName");
		attrs.add("DurableSubscriberResourceObjectName");
		attrs.add("SendTimeAvg");

		attrs = new Vector();
		attributes.put("JMSQuereConnectionFactory", attrs);
		attrs.add("objectName");
		attrs.add("MesssageInfo");
		attrs.add("RemainingMessages");

		attrs = new Vector();
		attributes.put("JMSQuereDestinationResource", attrs);
		attrs.add("objectName");
		attrs.add("MesssageInfo");
		attrs.add("RemainingMessages");

		attrs = new Vector();
		attributes.put("SessionContainerMo", attrs);
		attrs.add("objectName");
		attrs.add("CentralServerInfo");
		attrs.add("ContainerType");
		attrs.add("P2PConnectionStatus");
		attrs.add("InuseConnectionCount-count");
		attrs.add("RemoteActiveSessionCount-count");
		attrs.add("RemotePassivatedSessionCount-count");
		attrs.add("TotalConnectionCount-count");

		attrs = new Vector();
		attributes.put("SessionRouterMo", attrs);
		attrs.add("objectName");
		attrs.add("backupName");
		attrs.add("backupTrigger");
		attrs.add("checkTo");
		attrs.add("connectionTimeout");
		attrs.add("passivationTo");
		attrs.add("readTimeout");
		attrs.add("RouterName");

		attrs = new Vector();
		attributes.put("JDBCConnectionPool", attrs);
		attrs.add("objectName");
		attrs.add("ReConnectionCount");

		attrs = new Vector();
		attributes.put("ExternalWebtConnectionPool", attrs);
		attrs.add("ActiveConnectionCount");
		attrs.add("CloseCount");
		attrs.add("CreateCount");
		attrs.add("FreeConnectionCount");
		attrs.add("FreePoolSize");
		attrs.add("PoolSize");
		attrs.add("ReConnectionCount");
		attrs.add("TotalConnectionCount");
		attrs.add("WaitingThreadCount");

   }

   public static Vector tokenize(String str, String delim)
   {
      Vector tokens = new Vector();

      for (StringTokenizer tokenizer = new StringTokenizer(str);
               tokenizer.hasMoreTokens();)
      {
         String token = tokenizer.nextToken(delim);
         token = token.substring(0, 1).toUpperCase() + token.substring(1);
         tokens.add(token);
      }

      return tokens;
   }

   public static Object recursiveInvoke(Object callObject, Vector attributeNameVector, Object[] methodArgs, int depth) throws Exception
   {
      Object returnObject = null;
      Class callClass = callObject.getClass();
      String methodName = "get" + (String)attributeNameVector.get(depth);
      Class[] methodClass = null;
      java.lang.reflect.Method method = callClass.getMethod(methodName, methodClass);
      returnObject = method.invoke(callObject, methodArgs);

      if (returnObject == null)
      {
         return "";
      }

      Class returnClass = returnObject.getClass();
      Object[] returnObjectArray = null;

      int endOfDepth = attributeNameVector.size() - 1;

      if (depth == endOfDepth)
      {
         return returnObject;
      }
      else if (returnClass.isArray())
      {
         returnObjectArray = (Object[])returnObject;

         Vector returnValueVector = new Vector();

         for (int j = 0; j < returnObjectArray.length; j++)
         {
            returnObject = recursiveInvoke(returnObjectArray[j], attributeNameVector, methodArgs, depth + 1);

            if (depth < endOfDepth)
            {
               returnValueVector.add(returnObject);
            }
         }

         return returnValueVector;
      }
      else
      {
         returnObject = recursiveInvoke(returnObject, attributeNameVector, methodArgs, depth + 1);

         return returnObject;
      }
   }

   public static void testMbean(MBeanServerConnection connector, String key)
   {
      try
      {
         String queryString = (String)queries.get(key);
         System.out.println("<><><><> Query is : " + queryString);

         ObjectName scope = new ObjectName("JEUS:" + queryString + ",*");
         System.out.println("<><><><> Scope is : " + scope);

         Set set = connector.queryNames(scope, null);
         System.out.println("<><><><> Set is : " + set);
         System.out.println("<><><><> MBeanCount : " + connector.getMBeanCount());
         System.out.println("<><><><> Mbean = " + key + " ### Count of " + key + " Mbean = " + set.size());

         for (Iterator i = set.iterator(); i.hasNext();)
         {
            ObjectName obj = (ObjectName)i.next();
            Vector attrs = (Vector)attributes.get(key);
            System.out.println("<><><><> attributes = " + attrs.size());

            for (int ii = 0; ii < attrs.size(); ii++)
            {
               String wholeAttributeName = (String)attrs.get(ii);
               Vector attributeNameVector = tokenize(wholeAttributeName, "-");
               String attributeName = (String)attributeNameVector.get(0);
               attributeName = attributeName.substring(0, 1).toLowerCase() + attributeName.substring(1);

               Object returnObject = null;

               if (attributeNameVector.size() > 1)
               {
                  try
                  {
                     returnObject = connector.getAttribute(obj, attributeName);

                     if ((returnObject != null) & returnObject instanceof Statistic)
                     {
                        returnObject = recursiveInvoke(returnObject, attributeNameVector, null, 1);
                     }
                  }
                  catch (Throwable t)
                  {
                     try
                     {
                        returnObject = connector.getAttribute(obj, attributeName.substring(0, 1).toUpperCase() + attributeName.substring(1));

                        if ((returnObject != null) & returnObject instanceof Statistic)
                        {
                           returnObject = recursiveInvoke(returnObject, attributeNameVector, null, 1);
                        }
                     }
                     catch (Throwable tt)
                     {
                     }
                  }

                  if (returnObject == null)
                  {
                     Object callObject = connector.getAttribute(obj, "stats");
                     returnObject = recursiveInvoke(callObject, attributeNameVector, null, 0);
                  }
               }
               else
               {
                  try
                  {
                     returnObject = connector.getAttribute(obj, attributeName);

                     if (returnObject instanceof Statistic)
                     {
                        returnObject = recursiveInvoke(returnObject, attributeNameVector, null, 1);
                     }
                  }
                  catch (Throwable t)
                  {
                     try
                     {
                        returnObject = connector.getAttribute(obj, attributeName.substring(0, 1).toUpperCase() + attributeName.substring(1));

                        if (returnObject instanceof Statistic)
                        {
                           returnObject = recursiveInvoke(returnObject, attributeNameVector, null, 1);
                        }
                     }
                     catch (Throwable tt)
                     {
                        Object callObject = null;

                        try
                        {
                           callObject = connector.getAttribute(obj, "stats");
                        }
                        catch (Throwable ttt)
                        {
                        }

                        try
                        {
                           returnObject = recursiveInvoke(callObject, attributeNameVector, null, 0);
                        }
                        catch (Throwable tttt)
                        {
                           returnObject = null;
                        }
                     }
                  }
               }

               if (returnObject == null)
               {
                  System.out.println("    ---- " + wholeAttributeName + " is null!!!\n");

                  continue;
               }

               Class returnClass = returnObject.getClass();

               if (returnClass.isArray())
               {
                  Object[] returnArray = (Object[])returnObject;

                  for (int jj = 0; jj < returnArray.length; jj++)
                  {
                     System.out.println("    ---- " + wholeAttributeName + "[" + jj + "]=" + returnArray[jj] + "\n");
                  }
               }
               else
               {
                  System.out.println("    ---- " + wholeAttributeName + "=" + returnObject + "\n");
               }
            }
         }
      }
      catch (Throwable t)
      {
      }
   }

   public static void main(String[] args)
   {
      try
      {
         MBeanServerConnection connector = (MBeanServerConnection)RemoteMBeanServerFactory.getDedicatedMBeanServer(args[0], args[1], args[2], Boolean.valueOf(args[3]).booleanValue());

         if (args[4].equals("all"))
         {
            for (Enumeration e = queries.keys(); e.hasMoreElements();)
            {
               String key = (String)e.nextElement();
               testMbean(connector, key);
            }
         }
         else
         {
            String key = args[4];
            String queryString = (String)queries.get(key);

            if (queryString != null)
            {
               testMbean(connector, key);
            }
            else
            {
               System.out.println("mbean name is not valid!!");
            }
         }
      }
      catch (Throwable t)
      {
         t.printStackTrace();
      }
   }
}
