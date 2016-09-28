package ejb.ejbql.relationQuery;

import java.util.*;

import javax.ejb.*;


public interface ReservationHomeLocal extends EJBLocalHome
{
   public ReservationLocal create(Integer id, double payAmount, String reservedDate, Collection customers) throws CreateException, EJBException;

   public ReservationLocal findByPrimaryKey(Integer id) throws FinderException, EJBException;

   public Collection findAll() throws FinderException, EJBException;
}
