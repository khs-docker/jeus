package ejb.relation.otom;

import javax.ejb.*;


abstract public class StudentBean implements EntityBean
{
   EntityContext entityContext;

   public String ejbCreate(String studentid, String name) throws CreateException
   {
      setStudentid(studentid);
      setName(name);

      return null;
   }

   public void ejbPostCreate(String studentid, String name) throws CreateException
   {
      /**@todo Complete this method*/
   }

   public void ejbRemove() throws RemoveException
   {
      /**@todo Complete this method*/
   }

   public abstract void setStudentid(String studentid);

   public abstract void setName(String name);

   public abstract void setTeacher(Teacher teacher);

   public abstract java.lang.String getStudentid();

   public abstract java.lang.String getName();

   public abstract Teacher getTeacher();

   public void ejbLoad()
   {
      /**@todo Complete this method*/
   }

   public void ejbStore()
   {
      /**@todo Complete this method*/
   }

   public void ejbActivate()
   {
      /**@todo Complete this method*/
   }

   public void ejbPassivate()
   {
      /**@todo Complete this method*/
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
