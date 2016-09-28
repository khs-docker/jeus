package ejb.relation.mtom;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
import javax.ejb.FinderException;


public interface StudentLocalHome extends EJBLocalHome
{
   public StudentLocal create(String number, String name) throws CreateException;

   public StudentLocal findByPrimaryKey(String number) throws FinderException;
}
