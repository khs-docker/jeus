package ejb.relation.mtom;

import java.util.Collection;

import javax.ejb.EJBLocalObject;


public interface CourseLocal extends EJBLocalObject
{
   public String getCode();

   public void setSubject(String subject);

   public String getSubject();

   public void setStudent(Collection student);

   public Collection getStudent();
}
