import jeus.management.snmp.core.*;


public class TestClient
{
   static SnmpMessage snmpMessage;
   static SnmpGetSetPdu getSetPdu;
   static int defaultPort = 161; // 161;
   static String defaultIP = "127.0.0.1";

   /**
    * DOCUMENT ME!
    *
    * @param oid DOCUMENT ME!
    *
    * @throws java.io.IOException DOCUMENT ME!
    */
   static void testGetWithSecurity(String oid) throws java.io.IOException
   {
      // Create SNMP message object, it may contain one of the following
      // protocol data unit : GET, SET, TRAP, GET-NEXT.
      snmpMessage = new SnmpMessage();

      // create a Set Protocol Data Unit.
      getSetPdu = new SnmpGetSetPdu();
      getSetPdu.setMsgType(AsnObject.GET_REQ_MSG);
      getSetPdu.setReqId(1);
      snmpMessage.setPdu(getSetPdu);

      snmpMessage.setSnmpVersion(3);

      snmpMessage.setUserName("jeus".getBytes());

      snmpMessage.setAuthMode(true);
      snmpMessage.setAuthAlgorithm(SecurityInterface.SHA);
      snmpMessage.setAuthPassword("jeus".getBytes());

      // Remove temporary
      // snmpMessage.setEncryptionMode (true);
      // snmpMessage.setEncryptPassword ("testtest".getBytes ());
      snmpMessage.setContextEngineID("test engine");
      snmpMessage.setContextName("test name");

      getSetPdu.addNameValuePair(new AsnNameValuePair(oid, new AsnNull()));

      System.out.println("Sending ... ");

      SnmpClient client = new SnmpClient();
      client.sendSnmpMessage(defaultIP, defaultPort, snmpMessage);

      System.out.println("Reply : ");

      SnmpGetSetPdu reply = (SnmpGetSetPdu)snmpMessage.getPdu();
      System.out.println(" PDU type : " + reply.getMsgTypeName());
      System.out.println(" error status : " + reply.getErrorStatus());
      System.out.println(" error index  : " + reply.getErrorIndex());

      for (int i = 0; i < reply.getValueSize(); i++)
      {
         System.out.println(reply.getNameValuePair(i).toString());
      }
   }

   /**
    * DOCUMENT ME!
    *
    * @param oid DOCUMENT ME!
    *
    * @throws java.io.IOException DOCUMENT ME!
    */
   static void testGetWithoutSecurity(String oid) throws java.io.IOException
   {
      // Create SNMP message object, it may contain one of the following
      // protocol data unit : GET, SET, TRAP, GET-NEXT.
      snmpMessage = new SnmpMessage();

      // create a Set Protocol Data Unit.
      getSetPdu = new SnmpGetSetPdu();
      getSetPdu.setMsgType(AsnObject.GET_REQ_MSG);
      getSetPdu.setReqId(2);
      snmpMessage.setPdu(getSetPdu);

      snmpMessage.setSnmpVersion(1);

      snmpMessage.setContextEngineID("test engine");
      snmpMessage.setContextName("test name");

      getSetPdu.addNameValuePair(new AsnNameValuePair(oid, new AsnNull()));

      System.out.println("Sending ... ");

      SnmpClient client = new SnmpClient();
      client.sendSnmpMessage(defaultIP, defaultPort, snmpMessage);

      System.out.println("Reply : ");

      SnmpGetSetPdu reply = (SnmpGetSetPdu)snmpMessage.getPdu();
      System.out.println(" PDU type : " + reply.getMsgTypeName());
      System.out.println(" error status : " + reply.getErrorStatus());
      System.out.println(" error index  : " + reply.getErrorIndex());

      for (int i = 0; i < reply.getValueSize(); i++)
      {
         System.out.println(reply.getNameValuePair(i).toString());
      }
   }

   /**
    * DOCUMENT ME!
    */
   static void testStopSnmpAgent()
   {
   }

   public static void main(String[] args)
   {
      String[] oids = new String[]
      {
         "1.3.6.1.4.1.14586.100.4.1", "1.3.6.1.4.1.14586.100.4.2",
         "1.3.6.1.4.1.14586.100.4.3", "1.3.6.1.4.1.14586.100.4.4",
         "1.3.6.1.4.1.14586.100.4.6", "1.3.6.1.4.1.14586.100.4.7",
         "1.3.6.1.4.1.14586.100.4.8", "1.3.6.1.4.1.14586.100.4.9",
         "1.3.6.1.4.1.14586.100.4.10", "1.3.6.1.4.1.14586.100.4.101",
         "1.3.6.1.4.1.14586.100.4.102", "1.3.6.1.4.1.14586.100.4.103",
         "1.3.6.1.4.1.14586.100.4.104", "1.3.6.1.4.1.14586.100.4.105",
         "1.3.6.1.4.1.14586.100.4.111", "1.3.6.1.4.1.14586.100.4.121",
         "1.3.6.1.4.1.14586.100.4.122", "1.3.6.1.4.1.14586.100.4.123",
      };

      if (args.length > 0)
      {
         defaultPort = Integer.parseInt(args[0]);
      }

      System.out.println("PORT : " + defaultPort);

      if (args.length > 1)
      {
         defaultIP = args[1];
      }

      System.out.println("IP : " + defaultIP);

      String oid;

      if (args.length > 2)
      {
         oid = args[2];
      }
      else
      {
         oid = "1.3.6.1.4.1.14586.100.4.1";
      }

      System.out.println("OID : " + oid);

      try
      {
         if (!oid.equals("all"))
         {
            testGetWithSecurity(oid);
         }

         else
         {
            for (int i = 0; i < oids.length; i++)
            {
               testGetWithSecurity(oids[i]);
            }
         }
      }
      catch (Exception ex)
      {
         System.out.println("ex *** : " + ex);
         ex.printStackTrace();
      }
   }
} // TestClient
