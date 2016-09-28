/*
 * [EmployeeServiceIF.java]
 *
 * @Peter Go Copyright (c) 1998-2004 by TmaxSoft, Inc. All Rights Reserved.
 *
 */
package com.tmax.webservices.emp.service;

import com.tmax.webservices.emp.domain.Employee;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface EmployeeServiceIF extends Remote
{
   public void addEmployee(Employee emp) throws RemoteException;

   public void modifyEmployee(Employee emp) throws RemoteException;

   public void removeEmployee(String empNo) throws RemoteException;

   public Employee findEmployee(String empNo) throws RemoteException;

   public Employee[] findEmployees() throws RemoteException;
}
