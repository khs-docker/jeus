package ejb.relation.otom;

import java.lang.reflect.*;

import javax.ejb.*;

import javax.naming.*;

import javax.rmi.*;


public class Client
{
   public static void main(String[] args) throws Exception
   {
      Context ctx;
      otmtestHome testHome;
      otmtest testRemote;

      ctx = new InitialContext();

      System.out.println("<< One-to-Many CMP Relation Test >>");

      System.out.println("< Creating data >");
      testHome = (otmtestHome)PortableRemoteObject.narrow(ctx.lookup("otmtest"), otmtestHome.class);
      testRemote = testHome.create();
      testRemote.testCreateRelation();
      testRemote.testPrintSegment();

      System.out.println("< Changing relation >");
      testRemote.testChangeRelation();
      testRemote.testPrintSegment();

      System.out.println("< Removing >");
      testRemote.testRemoveWithLocal();

      ctx.close();
   }
}
