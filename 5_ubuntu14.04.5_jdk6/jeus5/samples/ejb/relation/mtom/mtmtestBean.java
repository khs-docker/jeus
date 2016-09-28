package ejb.relation.mtom;

import java.util.*;

import javax.ejb.*;

import javax.naming.*;

import javax.rmi.*;

import javax.transaction.*;


public class mtmtestBean implements SessionBean
{
   SessionContext sessionContext;

   public void testSetCourseIntoStudent()
   {
      CourseLocalHome courseLocalHome;
      CourseLocal courseLocal;
      Collection coll;

      String studentID;
      String courseID;

      StudentLocalHome studentLocalHome;
      StudentLocal studentLocal;

      try
      {
         courseLocalHome = (CourseLocalHome)this.lookup("local/Course", CourseLocalHome.class);
         studentLocalHome = (StudentLocalHome)this.lookup("local/Student", StudentLocalHome.class);
      }
      catch (NamingException ex)
      {
         ex.printStackTrace();

         throw new EJBException(ex);
      }

      for (int i = 0; i < 10; i++)
      {
         UserTransaction ut = (UserTransaction)this.sessionContext.getUserTransaction();

         try
         {
            ut.begin();
            studentID = "num" + i;
            courseID = "code" + (i + 10);

            try
            {
               courseLocal = courseLocalHome.findByPrimaryKey(courseID);
               System.out.println("Found course[" + courseID + "]");
            }
            catch (FinderException ex)
            {
               ex.printStackTrace();
               throw new EJBException("Fail to find course [" + courseID + "].", ex);
            }

            try
            {
               studentLocal = studentLocalHome.findByPrimaryKey(studentID);
               System.out.println("Found student[" + studentID + "].");
            }
            catch (FinderException ex)
            {
               ex.printStackTrace();
               throw new EJBException("Fail to find student [" + studentID + "].", ex);
            }

            System.out.println("Set course[" + courseID + "] into student[" + studentID + "].");

            studentLocal.getCourse().add(courseLocal);

            ut.commit();
         }
         catch (Exception ex)
         {
            ex.printStackTrace();
            throw new EJBException(ex);
         }
         finally
         {
            try
            {
               ut.rollback();
            }
            catch (Exception ex)
            {
            }
         }
      }
   }

   public void testSetCourseIntoStudentWithCollection()
   {
      CourseLocalHome home;
      CourseLocal course;
      Collection coll;

      StudentLocalHome studentHome;
      StudentLocal student;

      try
      {
         home = (CourseLocalHome)this.lookup("local/Course", CourseLocalHome.class);
         studentHome = (StudentLocalHome)this.lookup("local/Student", StudentLocalHome.class);
      }
      catch (NamingException ex)
      {
         ex.printStackTrace();

         throw new EJBException(ex);
      }

      for (int i = 0; i < 10; i++)
      {
         UserTransaction ut = (UserTransaction)this.sessionContext.getUserTransaction();

         try
         {
            ut.begin();

            Vector vec = new Vector();

            course = home.findByPrimaryKey("code" + i);
            student = studentHome.findByPrimaryKey("num" + (i * 2));

            System.out.println("Set course[code" + i + "] into student[num" + (i * 2) + "].");
            vec.add(course);
            student.setCourse(vec);

            ut.commit();
         }
         catch (FinderException ex)
         {
            ex.printStackTrace();

            throw new EJBException("Fail to find course [code" + i + "].");
         }
         catch (Exception ex)
         {
            ex.printStackTrace();
            throw new EJBException(ex);
         }
         finally
         {
            try
            {
               ut.rollback();
            }
            catch (Exception ex)
            {
            }
         }
      }
   }

   public void testSetStudentIntoCourse()
   {
      CourseLocalHome home;
      CourseLocal course;
      Collection coll;

      String studentID;
      String courseID;

      StudentLocalHome studentHome;
      StudentLocal studentLocal;

      try
      {
         home = (CourseLocalHome)this.lookup("local/Course", CourseLocalHome.class);
         studentHome = (StudentLocalHome)this.lookup("local/Student", StudentLocalHome.class);
      }
      catch (NamingException ex)
      {
         ex.printStackTrace();

         throw new EJBException(ex);
      }

      for (int i = 0; i < 10; i++)
      {
         UserTransaction ut = (UserTransaction)this.sessionContext.getUserTransaction();

         try
         {
            ut.begin();
            studentID = "num" + (i + 10);
            courseID = "code" + i;

            try
            {
               course = home.findByPrimaryKey(courseID);
               System.out.println("Found course[" + courseID + "]");
            }
            catch (FinderException ex)
            {
               ex.printStackTrace();
               throw new EJBException("Fail to find course [" + courseID + "].", ex);
            }

            try
            {
               studentLocal = studentHome.findByPrimaryKey(studentID);
               System.out.println("Found studentLocal[" + studentID + "].");
            }
            catch (FinderException ex)
            {
               ex.printStackTrace();
               throw new EJBException("Fail to find studentLocal [" + studentID + "].", ex);
            }

            System.out.println("Set course[" + courseID + "] into studentLocal[" + studentID + "].");

            course.getStudent().add(studentLocal);

            ut.commit();
         }
         catch (Exception ex)
         {
            ex.printStackTrace();
            throw new EJBException(ex);
         }
         finally
         {
            try
            {
               ut.rollback();
            }
            catch (Exception ex)
            {
            }
         }
      }
   }

   public void testPrintStudentsCourse()
   {
      CourseLocalHome home;
      CourseLocal course;
      Collection coll;

      String studentID;
      String courseID;

      StudentLocalHome studentHome;
      StudentLocal student;

      try
      {
         home = (CourseLocalHome)this.lookup("local/Course", CourseLocalHome.class);
         studentHome = (StudentLocalHome)this.lookup("local/Student", StudentLocalHome.class);
      }
      catch (NamingException ex)
      {
         ex.printStackTrace();

         throw new EJBException(ex);
      }

      for (int i = 0; i < 20; i++)
      {
         UserTransaction ut = (UserTransaction)this.sessionContext.getUserTransaction();

         try
         {
            ut.begin();
            studentID = "num" + i;

            try
            {
               student = studentHome.findByPrimaryKey(studentID);
               System.out.println("Found student[" + studentID + "].");
            }
            catch (FinderException ex)
            {
               ex.printStackTrace();
               throw new EJBException("Fail to find student [" + studentID + "].", ex);
            }

            Collection col = student.getCourse();

            System.out.println("#### StudentLocal[" + studentID + "]'s course ####");

            for (Iterator it = col.iterator(); it.hasNext();)
            {
               course = (CourseLocal)it.next();
               System.out.println("  - " + course.getSubject());
            }

            ut.commit();
         }
         catch (Exception ex)
         {
            ex.printStackTrace();
            throw new EJBException(ex);
         }
         finally
         {
            try
            {
               ut.rollback();
            }
            catch (Exception ex)
            {
            }
         }
      }
   }

   public void testPrintCoursesStudent()
   {
      CourseLocalHome home;
      CourseLocal course;
      Collection coll;

      String studentID;
      String courseID;

      StudentLocalHome studentHome;
      StudentLocal student;

      try
      {
         home = (CourseLocalHome)this.lookup("local/Course", CourseLocalHome.class);
      }
      catch (NamingException ex)
      {
         ex.printStackTrace();

         throw new EJBException(ex);
      }

      for (int i = 0; i < 20; i++)
      {
         UserTransaction ut = (UserTransaction)this.sessionContext.getUserTransaction();

         try
         {
            ut.begin();
            courseID = "code" + i;

            try
            {
               course = home.findByPrimaryKey(courseID);
               System.out.println("Found course[" + courseID + "].");
            }
            catch (FinderException ex)
            {
               ex.printStackTrace();
               throw new EJBException("Fail to find course[" + courseID + "].", ex);
            }

            Collection col = course.getStudent();

            System.out.println("#### CourseLocal[" + courseID + "]'s student ####");

            for (Iterator it = col.iterator(); it.hasNext();)
            {
               student = (StudentLocal)it.next();
               System.out.println("  - " + student.getName());
            }

            ut.commit();
         }
         catch (Exception ex)
         {
            ex.printStackTrace();
            throw new EJBException(ex);
         }
         finally
         {
            try
            {
               ut.rollback();
            }
            catch (Exception ex)
            {
            }
         }
      }
   }

   public void testDeleteCourseFromStudent()
   {
      CourseLocalHome home;
      CourseLocal course;
      Collection coll;

      String studentID;
      String courseID;

      StudentLocalHome studentLocalHome;
      StudentLocal student;

      try
      {
         studentLocalHome = (StudentLocalHome)this.lookup("local/Student", StudentLocalHome.class);
      }
      catch (NamingException ex)
      {
         ex.printStackTrace();

         throw new EJBException(ex);
      }

      for (int i = 0; i < 10; i++)
      {
         UserTransaction ut = (UserTransaction)this.sessionContext.getUserTransaction();

         try
         {
            ut.begin();
            studentID = "num" + i;

            try
            {
               student = studentLocalHome.findByPrimaryKey(studentID);
               System.out.println("Found student[" + studentID + "].");
            }
            catch (FinderException ex)
            {
               ex.printStackTrace();
               throw new EJBException("Fail to find course[" + studentID + "].", ex);
            }

            Collection col = student.getCourse();

            System.out.println("#### StudentLocal[" + studentID + "]'s course ####");

            for (Iterator it = col.iterator(); it.hasNext();)
            {
               course = (CourseLocal)it.next();
               System.out.println("Removing [" + course.getCode() + ", " + course.getSubject() + "]");
               course.remove();
            }

            ut.commit();
         }
         catch (Exception ex)
         {
            ex.printStackTrace();
            throw new EJBException(ex);
         }
         finally
         {
            try
            {
               ut.rollback();
            }
            catch (Exception ex)
            {
            }
         }
      }
   }

   public void testDeleteStudentFromCourse()
   {
      CourseLocalHome home;
      CourseLocal course;
      Collection coll;

      String studentID;
      String courseID;

      StudentLocalHome studentHome;
      StudentLocal student;

      try
      {
         home = (CourseLocalHome)this.lookup("local/Course", CourseLocalHome.class);
      }
      catch (NamingException ex)
      {
         ex.printStackTrace();

         throw new EJBException(ex);
      }

      for (int i = 0; i < 10; i++)
      {
         UserTransaction ut = (UserTransaction)this.sessionContext.getUserTransaction();

         try
         {
            ut.begin();
            courseID = "code" + i;

            try
            {
               course = home.findByPrimaryKey(courseID);
               System.out.println("Found course[" + courseID + "].");
            }
            catch (FinderException ex)
            {
               ex.printStackTrace();
               throw new EJBException("Fail to find course[" + courseID + "].", ex);
            }

            Collection col = course.getStudent();

            System.out.println("#### CourseLocal[" + courseID + "]'s student ####");

            for (Iterator it = col.iterator(); it.hasNext();)
            {
               student = (StudentLocal)it.next();
               System.out.println("Removing [" + student.getNumber() + ", " + student.getName() + "]");
               student.remove();
            }

            ut.commit();
         }
         catch (Exception ex)
         {
            ex.printStackTrace();
            throw new EJBException(ex);
         }
         finally
         {
            try
            {
               ut.rollback();
            }
            catch (Exception ex)
            {
            }
         }
      }
   }

   public void ejbCreate()
   {
   }

   public void ejbRemove()
   {
   }

   public void ejbActivate()
   {
   }

   public void ejbPassivate()
   {
   }

   public void setSessionContext(SessionContext context)
   {
      sessionContext = context;
   }

   private Object lookup(String exportName, Class objectClass) throws NamingException
   {
      Context ctx;
      Object returnObject;

      ctx = new InitialContext();

      returnObject = PortableRemoteObject.narrow(ctx.lookup(exportName), objectClass);

      return returnObject;
   }
}
