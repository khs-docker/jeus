package ejb.relation.otom;

import java.util.*;

import javax.ejb.*;


public interface Student extends javax.ejb.EJBLocalObject
{
   public String getStudentid();

   public void setName(String name);

   public String getName();

   public void setTeacher(Teacher teacher);

   public Teacher getTeacher();
}
