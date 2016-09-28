/*
 * Copyright 2000 Sun Microsystems, Inc. All Rights Reserved.
 *
 * This software is the proprietary information of Sun Microsystems, Inc.
 * Use is subject to license terms.
 *
 */

package comaccount;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface Account extends EJBObject {

    // business logic methods

    public void debit(double amount)
        throws InsufficientBalanceException, RemoteException;

    public void credit(double amount)
        throws RemoteException;

    // getters

    public String getAccountId()
        throws RemoteException;

    public String getFirstName()
        throws RemoteException;

    public String getLastName()
        throws RemoteException;

    public String getType()
        throws RemoteException;

    public double getBalance()
        throws RemoteException;

    public double getCreditLimit()
        throws RemoteException;

    // setters

    public void setFirstName(String firstName)
        throws RemoteException;

    public void setLastName(String lastName)
        throws RemoteException;

    public void setType(String type)
        throws RemoteException, InvalidTypeException;

    public void setBalance(double balance)
        throws RemoteException;

    public void setCreditLimit(double creditLimit)
        throws RemoteException;

}
