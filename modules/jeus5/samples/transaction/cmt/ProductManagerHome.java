package transaction.cmt;

import java.rmi.*;

import java.util.*;

import javax.ejb.*;


public interface ProductManagerHome extends EJBHome
{
   public ProductManager create() throws RemoteException, CreateException;
}
