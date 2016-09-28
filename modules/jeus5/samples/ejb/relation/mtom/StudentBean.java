package ejb.relation.mtom;

import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;
import javax.ejb.RemoveException;


public abstract class StudentBean implements EntityBean
{
   EntityContext entityContext;

   public String ejbCreate(String number, String name) throws CreateException
   {
      setNumber(number);

      setName(name);

      return null;
   }

   public void ejbPostCreate(String number, String name) throws CreateException
   {
   }

   public void ejbRemove() throws RemoveException
   {
   }

   public abstract void setNumber(String number);

   public abstract void setName(String name);

   public abstract void setCourse(Collection course);

   public abstract String getNumber();

   public abstract String getName();

   public abstract Collection getCourse();

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
