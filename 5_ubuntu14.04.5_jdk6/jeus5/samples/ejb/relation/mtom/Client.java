package ejb.relation.mtom;

import java.rmi.*;

import javax.ejb.*;

import javax.naming.*;

import javax.rmi.*;


public class Client
{
   public static void main(String[] args) throws Exception
   {
      Context ctx;
      mtmtestHome testHome;
      mtmtest testRemote;

      StudentRemoteHome studentHome;
      StudentRemote studentRemote;
      CourseRemoteHome courseHome;
      CourseRemote courseRemote;

      ctx = new InitialContext();

      System.out.println("<< Many-to-Many CMP Relation Test >>");
      studentHome = (StudentRemoteHome)PortableRemoteObject.narrow(ctx.lookup("mtm/Student"), StudentRemoteHome.class);

      System.out.println("< Creating Students data >");

      for (int i = 0; i < 20; i++)
      {
         System.out.println("Creating num" + i + ", student" + i);
         studentHome.create("num" + i, "student" + i);
      }

      courseHome = (CourseRemoteHome)PortableRemoteObject.narrow(ctx.lookup("mtm/Course"), CourseRemoteHome.class);
      System.out.println("< Creating Course data >");

      for (int i = 0; i < 20; i++)
      {
         System.out.println("Create code" + i + ", subject" + i);
         courseHome.create("code" + i, "subject" + i);
      }

      System.out.println("< Creaing relation >");
      testHome = (mtmtestHome)PortableRemoteObject.narrow(ctx.lookup("mtm/Test"), mtmtestHome.class);
      testRemote = testHome.create();
      testRemote.testSetCourseIntoStudent();
      testRemote.testSetStudentIntoCourse();

      System.out.println("< Print Relation >");
      testRemote.testPrintStudentsCourse();
      testRemote.testPrintCoursesStudent();

      System.out.println("< Removing Relation >");

      try
      {
         testRemote.testDeleteCourseFromStudent();
      }
      catch (Exception ex)
      {
      }

      try
      {
         testRemote.testDeleteStudentFromCourse();
      }
      catch (Exception ex)
      {
      }

      ctx.close();
   }
}
