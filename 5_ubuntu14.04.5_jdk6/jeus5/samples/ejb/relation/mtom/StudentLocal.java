package ejb.relation.mtom;

import java.util.Collection;

import javax.ejb.EJBLocalObject;


public interface StudentLocal extends EJBLocalObject
{
   public String getNumber();

   public void setName(String name);

   public String getName();

   public void setCourse(Collection course);

   public Collection getCourse();
}
