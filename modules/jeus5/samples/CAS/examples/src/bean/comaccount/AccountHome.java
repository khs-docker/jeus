/*
 *
 * Copyright 2000 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * This software is the proprietary information of Sun Microsystems, Inc.  
 * Use is subject to license terms.
 * 
 */

package comaccount;

import java.util.Collection;
import java.rmi.RemoteException;
import javax.ejb.*;

public interface AccountHome extends EJBHome {

    public Account create(String accountId, String firstName, 
        String lastName, String type, double balance, 
        double creditLimit)
        throws RemoteException, CreateException;
 
    public Account create(String accountId)
        throws RemoteException, CreateException;
   
    public Account findByPrimaryKey(String id) 
        throws FinderException, RemoteException;
    
    public Collection findByLastName(String lastName)
        throws FinderException, RemoteException;

    public Collection findByBalance(double low, double high)
        throws FinderException, RemoteException;

    public Collection findAll()
        throws FinderException, RemoteException;
}
