package ejb.relation.otom;

import java.util.*;

import javax.ejb.*;

import javax.naming.*;

import javax.rmi.*;

import javax.transaction.*;


public class otmtestBean implements SessionBean
{
   SessionContext sessionContext;

   public void testCreateRelation()
   {
      StudentHome studentHome = null;
      Student student = null;
      TeacherHome teacherHome = null;
      Teacher teacher = null;

      try
      {
         System.out.println("Looking up Student.");
         studentHome = (StudentHome)this.lookup("local/Student", StudentHome.class);
         System.out.println("Looking up Teacher.");
         teacherHome = (TeacherHome)this.lookup("local/Teacher", TeacherHome.class);
      }
      catch (NamingException ex)
      {
         ex.printStackTrace();

         throw new EJBException(ex);
      }

      for (int i = 1; i <= 10; i++)
      {
         try
         {
            System.out.println("Creating teacher" + i);
            teacher = teacherHome.create("teacher" + i, "Park" + i);
         }
         catch (CreateException ex)
         {
            ex.printStackTrace();
            throw new EJBException("Fail to create teacher entity bean.", ex);
         }

         try
         {
            StringBuffer buf = new StringBuffer();

            for (int j = i; j < 20; j++)
            {
               buf.setLength(0);
               buf.append("student").append(i).append(j);
               System.out.println("Creating " + buf.toString());
               student = studentHome.create(buf.toString(), "Clifford" + buf.toString());

               System.out.println("Adding " + buf.toString() + " into teacher" + i);
               teacher.getStudent().add(student);
            }
         }
         catch (CreateException ex)
         {
            ex.printStackTrace();
            throw new EJBException("Fail to create student entity bean.", ex);
         }
      }
   }

   public void testPrintSegment()
   {
      StudentHome studentHome = null;
      Student student = null;
      TeacherHome teacherHome = null;
      Teacher teacher = null;

      try
      {
         System.out.println("Looking up Student.");
         studentHome = (StudentHome)this.lookup("local/Student", StudentHome.class);

         System.out.println("Looking up Teacher.");
         teacherHome = (TeacherHome)this.lookup("local/Teacher", TeacherHome.class);
      }
      catch (NamingException ex)
      {
         ex.printStackTrace();

         throw new EJBException(ex);
      }

      for (int i = 6; i <= 7; i++)
      {
         try
         {
            System.out.println("Finding teacher" + i);

            TeacherPK pk = new TeacherPK("teacher" + i);
            teacher = teacherHome.findByPrimaryKey(pk);
            System.out.println("# TEACHER: " + teacher.getTeacherid() + "[" + teacher.getName() + "]");
         }
         catch (FinderException ex)
         {
            ex.printStackTrace();
            throw new EJBException("Fail to find teacher entity bean.", ex);
         }

         try
         {
            Collection col;

            col = teacher.getStudent();

            Iterator it = col.iterator();

            while (it.hasNext())
            {
               student = (Student)it.next();

               System.out.println("    - Student: " + student.getStudentid() + "[" + student.getName() + "]");
            }
         }
         catch (Exception ex)
         {
            ex.printStackTrace();
            throw new EJBException("Fail to print student entity bean.", ex);
         }
      }
   }

   public void testChangeRelation()
   {
      StudentHome studentHome = null;
      Student student = null;
      TeacherHome teacherHome = null;
      Teacher teacher = null;
      Teacher teacher6 = null;

      try
      {
         System.out.println("Looking up Student.");
         studentHome = (StudentHome)this.lookup("local/Student", StudentHome.class);

         System.out.println("Looking up Teacher.");
         teacherHome = (TeacherHome)this.lookup("local/Teacher", TeacherHome.class);
      }
      catch (NamingException ex)
      {
         ex.printStackTrace();

         throw new EJBException(ex);
      }

      try
      {
         teacher6 = teacherHome.findByPrimaryKey(new TeacherPK("teacher6"));
      }
      catch (FinderException ex)
      {
         ex.printStackTrace();
         throw new EJBException("Fail to find teacher6 entity bean.", ex);
      }

      for (int i = 7; i <= 10; i++)
      {
         try
         {
            System.out.println("Finding teacher" + i);

            TeacherPK pk = new TeacherPK("teacher" + i);
            teacher = teacherHome.findByPrimaryKey(pk);
            System.out.println("# TEACHER: " + teacher.getTeacherid() + "[" + teacher.getName() + "]");
         }
         catch (FinderException ex)
         {
            ex.printStackTrace();
            throw new EJBException("Fail to find teacher entity bean.", ex);
         }

         try
         {
            Collection col;

            col = teacher.getStudent();

            Iterator it = col.iterator();

            while (it.hasNext())
            {
               student = (Student)it.next();
               it.remove();
               System.out.println("Moving " + teacher.getName() + "'s student " + student.getName() + " to " + teacher6.getName() + ".");
               student.setTeacher(teacher6);
               System.out.println(".... OK.");
            }
         }
         catch (Exception ex)
         {
            ex.printStackTrace();
            throw new EJBException("Fail to print student entity bean.", ex);
         }

         Collection col2 = teacher.getStudent();

         if (col2.size() != 0)
         {
            throw new EJBException("Moving relationship didn't work.");
         }
      }
   }

   public void testCreateRelationWithCollection()
   {
      StudentHome studentHome = null;
      Student student = null;
      TeacherHome teacherHome = null;
      Teacher teacher = null;

      try
      {
         studentHome = (StudentHome)this.lookup("local/Student", StudentHome.class);
         teacherHome = (TeacherHome)this.lookup("local/Teacher", TeacherHome.class);
      }
      catch (NamingException ex)
      {
         ex.printStackTrace();

         throw new EJBException(ex);
      }

      for (int i = 1; i <= 10; i++)
      {
         Vector vec = new Vector();

         try
         {
            teacher = teacherHome.create("teacher" + i, "Park" + i);
         }
         catch (CreateException ex)
         {
            ex.printStackTrace();
            throw new EJBException("Fail to create teacher entity bean.", ex);
         }

         try
         {
            for (int j = i; j < 100; j++)
            {
               student = studentHome.create("student" + j, "Clifford" + j);
               vec.add(student);
            }

            teacher.setStudent(vec);
         }
         catch (CreateException ex)
         {
            ex.printStackTrace();
            throw new EJBException("Fail to create student entity bean.", ex);
         }
      }
   }

   public void testChangeRelationWithCollection()
   {
      StudentHome studentHome = null;
      Student student = null;
      TeacherHome teacherHome = null;
      Teacher teacher = null;
      Teacher teacher6 = null;

      try
      {
         System.out.println("Looking up Student.");
         studentHome = (StudentHome)this.lookup("local/Student", StudentHome.class);

         System.out.println("Looking up Teacher.");
         teacherHome = (TeacherHome)this.lookup("local/Teacher", TeacherHome.class);
      }
      catch (NamingException ex)
      {
         ex.printStackTrace();

         throw new EJBException(ex);
      }

      try
      {
         teacher6 = teacherHome.findByPrimaryKey(new TeacherPK("teacher6"));
      }
      catch (FinderException ex)
      {
         ex.printStackTrace();
         throw new EJBException("Fail to find teacher6 entity bean.", ex);
      }

      for (int i = 7; i <= 10; i++)
      {
         try
         {
            System.out.println("Finding teacher" + i);

            TeacherPK pk = new TeacherPK("teacher" + i);
            teacher = teacherHome.findByPrimaryKey(pk);
            System.out.println("# TEACHER: " + teacher.getTeacherid() + "[" + teacher.getName() + "]");
         }
         catch (FinderException ex)
         {
            ex.printStackTrace();
            throw new EJBException("Fail to find teacher entity bean.", ex);
         }

         try
         {
            Collection col;

            col = teacher.getStudent();

            System.out.println("Moving " + teacher.getName() + "'s student " + student.getName() + " to " + teacher6.getName() + ".");
            teacher6.setStudent(col);
            System.out.println(".... OK.");
         }
         catch (Exception ex)
         {
            ex.printStackTrace();
            throw new EJBException("Fail to print student entity bean.", ex);
         }

         Collection col2 = teacher.getStudent();

         if (col2.size() != 0)
         {
            throw new EJBException("Moving relationship didn't work.");
         }
      }
   }

   public void testRemoveWithLocal()
   {
      StudentHome studentHome = null;
      Student student = null;
      TeacherHome teacherHome = null;
      Teacher teacher = null;

      try
      {
         System.out.println("Looking up Teacher.");
         teacherHome = (TeacherHome)this.lookup("local/Teacher", TeacherHome.class);
      }
      catch (NamingException ex)
      {
         ex.printStackTrace();

         throw new EJBException(ex);
      }

      for (int i = 1; i <= 10; i++)
      {
         try
         {
            System.out.println("Finding teacher" + i);

            TeacherPK pk = new TeacherPK("teacher" + i);
            teacher = teacherHome.findByPrimaryKey(pk);
            System.out.println("Removing " + teacher.getTeacherid() + "[" + teacher.getName() + "]");
            teacher.remove();
            System.out.println("..OK");
         }
         catch (FinderException ex)
         {
            ex.printStackTrace();
            throw new EJBException("Fail to find teacher entity bean.", ex);
         }
         catch (RemoveException ex)
         {
            ex.printStackTrace();
            throw new EJBException("Fail to remove teacher entity bean.", ex);
         }
      }
   }

   public void testRemoveWithLocalHome()
   {
      StudentHome studentHome = null;
      Student student = null;
      TeacherHome teacherHome = null;
      Teacher teacher = null;

      try
      {
         System.out.println("Looking up Teacher.");
         teacherHome = (TeacherHome)this.lookup("local/Teacher", TeacherHome.class);
      }
      catch (NamingException ex)
      {
         ex.printStackTrace();

         throw new EJBException(ex);
      }

      for (int i = 1; i <= 10; i++)
      {
         try
         {
            System.out.println("Finding teacher" + i);

            TeacherPK pk = new TeacherPK("teacher" + i);
            System.out.println("Removing " + pk.toString());
            teacherHome.remove(pk);
            System.out.println("..OK");
         }
         catch (RemoveException ex)
         {
            ex.printStackTrace();
            throw new EJBException("Fail to remove teacher entity bean.", ex);
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
