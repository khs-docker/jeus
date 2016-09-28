package ejb.relation.mtom;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.FinderException;


public interface CourseRemoteHome extends EJBHome
{
   public CourseRemote create(String code, String subject) throws CreateException, RemoteException;

   public CourseRemote findByPrimaryKey(String code) throws FinderException, RemoteException;
}
