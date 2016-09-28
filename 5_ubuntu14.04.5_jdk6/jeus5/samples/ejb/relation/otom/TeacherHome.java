package ejb.relation.otom;

import java.util.*;

import javax.ejb.*;


public interface TeacherHome extends javax.ejb.EJBLocalHome
{
   public Teacher create(String teacherid, String name) throws CreateException;

   public Teacher findByPrimaryKey(TeacherPK pk) throws FinderException;
}
