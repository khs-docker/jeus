package ejb.relation.otom;

import java.util.*;

import javax.ejb.*;


public interface StudentHome extends javax.ejb.EJBLocalHome
{
   public Student create(String studentid, String name) throws CreateException;

   public Student findByPrimaryKey(String studentid) throws FinderException;
}
