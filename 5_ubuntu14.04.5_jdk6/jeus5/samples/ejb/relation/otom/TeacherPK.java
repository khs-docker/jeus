package ejb.relation.otom;

import java.io.*;


public class TeacherPK implements Serializable
{
   public String teacherid;

   public TeacherPK()
   {
   }

   public TeacherPK(String teacherid)
   {
      this.teacherid = teacherid;
   }

   public boolean equals(Object obj)
   {
      if (this == obj)
      {
         return true;
      }

      if (!(obj instanceof TeacherPK))
      {
         return false;
      }

      TeacherPK that = (TeacherPK)obj;

      if (!((that.teacherid == null) ? (this.teacherid == null) : that.teacherid.equals(this.teacherid)))
      {
         return false;
      }

      return true;
   }

   public int hashCode()
   {
      int result = 17;
      result = (37 * result) + this.teacherid.hashCode();

      return result;
   }
}
