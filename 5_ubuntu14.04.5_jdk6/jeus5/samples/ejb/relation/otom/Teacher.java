package ejb.relation.otom;

import java.util.*;

import javax.ejb.*;


public interface Teacher extends javax.ejb.EJBLocalObject
{
   public String getTeacherid();

   public void setName(String name);

   public String getName();

   public void setStudent(Collection student);

   public Collection getStudent();
}
