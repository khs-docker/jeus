package ejb.relation.mtom;

import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;
import javax.ejb.RemoveException;


public abstract class CourseBean implements EntityBean
{
   EntityContext entityContext;

   public String ejbCreate(String code, String subject) throws CreateException
   {
      setCode(code);

      setSubject(subject);

      return null;
   }

   public void ejbPostCreate(String code, String subject) throws CreateException
   {
   }

   public void ejbRemove() throws RemoveException
   {
   }

   public abstract void setCode(String code);

   public abstract void setSubject(String subject);

   public abstract void setStudent(Collection student);

   public abstract String getCode();

   public abstract String getSubject();

   public abstract Collection getStudent();

   public void ejbLoad()
   {
   }

   public void ejbStore()
   {
   }

   public void ejbActivate()
   {
   }

   public void ejbPassivate()
   {
   }

   public void unsetEntityContext()
   {
      this.entityContext = null;
   }

   public void setEntityContext(EntityContext entityContext)
   {
      this.entityContext = entityContext;
   }
}
