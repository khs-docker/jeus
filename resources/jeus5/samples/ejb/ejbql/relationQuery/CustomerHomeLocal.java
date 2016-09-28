package ejb.ejbql.relationQuery;

import java.util.*;

import javax.ejb.*;


public interface CustomerHomeLocal extends EJBLocalHome
{
   public CustomerLocal create(Integer id, String name) throws CreateException, EJBException;

   public CustomerLocal findByPrimaryKey(Integer id) throws FinderException, EJBException;

   public Collection findAll() throws FinderException, EJBException;
}
