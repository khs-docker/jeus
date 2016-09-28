package ejb.relation.mtom;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
import javax.ejb.FinderException;


public interface CourseLocalHome extends EJBLocalHome
{
   public CourseLocal create(String code, String subject) throws CreateException;

   public CourseLocal findByPrimaryKey(String code) throws FinderException;
}
