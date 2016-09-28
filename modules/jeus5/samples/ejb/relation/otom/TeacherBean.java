package ejb.relation.otom;

import java.util.*;

import javax.ejb.*;


abstract public class TeacherBean implements EntityBean
{
   EntityContext entityContext;

   public TeacherPK ejbCreate(java.lang.String teacherid, java.lang.String name) throws CreateException
   {
      setName(name);
      setTeacherid(teacherid);

      return null;
   }

   public void ejbPostCreate(java.lang.String teacherid, java.lang.String name) throws CreateException
   {
      /**@todo Complete this method*/
   }

   public void ejbRemove() throws RemoveException
   {
      /**@todo Complete this method*/
   }

   public abstract void setTeacherid(String teacherid);

   public abstract void setName(String name);

   public abstract void setStudent(Collection student);

   public abstract java.lang.String getTeacherid();

   public abstract java.lang.String getName();

   public abstract java.util.Collection getStudent();

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
