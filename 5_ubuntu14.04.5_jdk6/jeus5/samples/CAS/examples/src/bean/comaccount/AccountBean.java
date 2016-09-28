/*
 *
 * Copyright 2000 Sun Microsystems, Inc. All Rights Reserved.
 *
 * This software is the proprietary information of Sun Microsystems, Inc.
 * Use is subject to license terms.
 *
 */

package comaccount;

import java.sql.*;
import javax.sql.*;
import java.util.*;
import javax.ejb.*;
import javax.naming.*;

public class AccountBean implements EntityBean {

    private String accountId;
    private String firstName;
    private String lastName;
    private String type;
    private double balance;
    private double creditLimit;
    private EntityContext context;
    private Connection con;
	private String dbName = "datasource";	
    private String[] validTypes = {"Savings", "Checking", "Money Market",
                                 "Credit Card"};


/*********************** Business Methods *************************/

    public void debit(double amount)
       throws InsufficientBalanceException {

       if (balance - amount < 0) {
           throw new InsufficientBalanceException();
       }
       balance -= amount;
    }

    public void credit(double amount) {
       balance += amount;
    }

    public String getAccountId() {
       return accountId;
    }

    public String getFirstName() {
       return firstName;
    }

    public String getLastName() {
       return lastName;
    }

    public String getType() {
       return type;
    }

    public double getBalance() {
       return balance;
    }

    public double getCreditLimit() {
       return creditLimit;
    }

    public void setFirstName(String firstName) {
       this.firstName = firstName;
    }

    public void setLastName(String lastName) {
       this.lastName = lastName;
    }

    public void setType(String type) throws InvalidTypeException {
       if (isValidType(type)) {
          this.type = type;
       } else {
          throw new InvalidTypeException(type);
       }
    }

    public void setBalance(double balance) {
       this.balance = balance;
    }

    public void setCreditLimit(double creditLimit) {
       this.creditLimit = creditLimit;
    }


/*********************** Life-Cycle and Finder Methods *********************/

    public String ejbCreate(String accountId, String firstName,
       String lastName, String type, double balance, double creditLimit)
       throws CreateException {

       if (accountId == null) {
          throw new CreateException
             ("A null accountId is not allowed");
       }

       if (balance < 0.00) {
          throw new CreateException
             ("A negative initial balance is not allowed.");
       }

       if (isValidType(type) == false) {
          throw new CreateException
             ("Invalid type: " + type);
       }

       try {
          insertRow(accountId, firstName, lastName, type, balance, creditLimit);
       } catch (Exception ex) {
           throw new EJBException("ejbCreate: " +
              ex.getMessage());
       }

       this.accountId = accountId;
       this.firstName = firstName;
       this.lastName = lastName;
       this.type = type;
       this.balance = balance;
       this.creditLimit = creditLimit;

       return accountId;
    }

    public String ejbCreate(String accountId)
       throws CreateException {

       if (accountId == null) {
          throw new CreateException
             ("A null accountId is not allowed");
       }

       firstName = null;
       lastName = null;
       type = null;
       balance = 0.0;
       creditLimit = 0.0;

       try {
          insertRow(accountId, firstName, lastName, type, balance, creditLimit);
       } catch (Exception ex) {
           throw new EJBException("ejbCreate: " +
              ex.getMessage());
       }

       this.accountId = accountId;
       return accountId;
    }

   public String ejbFindByPrimaryKey(String primaryKey)
      throws FinderException {

      boolean result;

      try {
         result = selectByPrimaryKey(primaryKey);
       } catch (Exception ex) {
           throw new EJBException("ejbFindByPrimaryKey: " +
              ex.getMessage());
       }

      if (result) {
         return primaryKey;
      }
      else {
         throw new ObjectNotFoundException
            ("Row for id " + primaryKey + " not found.");
      }
   }

   public Collection ejbFindByLastName(String lastName)
      throws FinderException {

      Collection result;

      try {
         result = selectByLastName(lastName);
       } catch (Exception ex) {
           throw new EJBException("ejbFindByLastName " +
              ex.getMessage());
       }

      return result;
   }

   public Collection ejbFindByBalance(double low, double high)
      throws FinderException {

      Collection result;

      try {
         result = selectByBalance(low, high);
       } catch (Exception ex) {
           throw new EJBException("ejbFindByBalance: " +
              ex.getMessage());
       }

      return result;
   }

   public Collection ejbFindAll()
      throws FinderException {

      Collection result;

      try {
         result = selectAll();
       } catch (Exception ex) {
           throw new EJBException("ejbFindAll: " +
              ex.getMessage());
       }

      return result;
   }

   public void ejbRemove() {

      try {
         deleteRow(accountId);
       } catch (Exception ex) {
           throw new EJBException("ejbRemove: " +
              ex.getMessage());
       }
   }

   public void setEntityContext(EntityContext context) {
      this.context = context;
   }

   public void unsetEntityContext() { }

   public void ejbActivate() {
      accountId = (String)context.getPrimaryKey();
   }

   public void ejbPassivate() {
      accountId = null;
   }

   public void ejbLoad() {

      try {
         loadRow();
       } catch (Exception ex) {
           throw new EJBException("ejbLoad: " +
              ex.getMessage());
       }
   }

   public void ejbStore() {

      try {
         storeRow();
       } catch (Exception ex) {
           throw new EJBException("ejbLoad: " +
              ex.getMessage());
       }
   }

   public void ejbPostCreate(String accountId, String firstName,
      String lastName, String type, double balance, double creditLimit) { }

   public void ejbPostCreate(String accountId) { }


/*********************** Private Helper Methods ****************************/

   private boolean isValidType(String type) {

   for (int k = 0; k < validTypes.length; k++) {
      if (validTypes[k].equals(type)) {
         return true;
      }
   }

   return false;
   }


/*********************** Database Routines *************************/


   private void makeConnection() {

       try {
           System.out.println("makeConnection()-----");
		   InitialContext ic = new InitialContext();
           DataSource ds = (DataSource) ic.lookup(dbName);
           con =  ds.getConnection();
		   System.out.println("makeConnection() succeeded");
       } catch (Exception ex) {
            throw new EJBException("Unable to connect to database named " +
                dbName + " : " + ex.getMessage());
       }
   }

   private void releaseConnection() {

       if (con != null) {
          try {
              con.close();
			  System.out.println("releaseConnection() closed");
          } catch (SQLException ex) {
              throw new EJBException("releaseConnection: " + ex.getMessage());
          }
       } // if
   }

   private void insertRow (String accountId, String firstName, String lastName,
       String type, double balance, double creditLimit)
       throws SQLException {

          makeConnection();
          String insertStatement =
                "insert into comaccount values ( ? , ? , ? , ? , ? , ? )";

          PreparedStatement prepStmt =
                con.prepareStatement(insertStatement);

          prepStmt.setString(1, accountId);
          prepStmt.setString(2, firstName);
          prepStmt.setString(3, lastName);
          prepStmt.setString(4, type);
          prepStmt.setDouble(5, balance);
          prepStmt.setDouble(6, creditLimit);

          prepStmt.executeUpdate();
          prepStmt.close();
          releaseConnection();
   }

   private void deleteRow(String accountId) throws SQLException {

      makeConnection();
      String deleteStatement =
            "delete from comaccount where comaccount_id = ? ";
      PreparedStatement prepStmt =
            con.prepareStatement(deleteStatement);

      prepStmt.setString(1, accountId);
      prepStmt.executeUpdate();
      prepStmt.close();
      releaseConnection();
   }

   private boolean selectByPrimaryKey(String primaryKey)
      throws SQLException {

      makeConnection();
      String selectStatement =
            "select comaccount_id " +
            "from comaccount where comaccount_id = ? ";
      PreparedStatement prepStmt =
            con.prepareStatement(selectStatement);
      prepStmt.setString(1, primaryKey);

      ResultSet rs = prepStmt.executeQuery();
      boolean result = rs.next();
      prepStmt.close();
      releaseConnection();
      return result;
   }

   private Collection selectByLastName(String lastName)
      throws SQLException {

      makeConnection();
      String selectStatement =
            "select comaccount_id " +
            "from comaccount where last_name = ? ";
      PreparedStatement prepStmt =
            con.prepareStatement(selectStatement);

      prepStmt.setString(1, lastName);
      ResultSet rs = prepStmt.executeQuery();
      ArrayList a = new ArrayList();

      while (rs.next()) {
         String account_id = rs.getString(1);
         a.add(account_id);
      }

      prepStmt.close();
      releaseConnection();
      return a;
   }

   private Collection selectByBalance(double low, double high)
      throws SQLException {

      makeConnection();
      String selectStatement =
            "select comaccount_id from comaccount " +
            "where balance > ? and balance < ?";
      PreparedStatement prepStmt =
            con.prepareStatement(selectStatement);

      prepStmt.setDouble(1, low);
      prepStmt.setDouble(2, high);
      ResultSet rs = prepStmt.executeQuery();
      ArrayList a = new ArrayList();

      while (rs.next()) {
         String accountId = rs.getString(1);
         a.add(accountId);
      }

      prepStmt.close();
      releaseConnection();
      return a;
   }

   private Collection selectAll()
      throws SQLException {

      System.out.println("in selectAll() , starts");
	  makeConnection();
      String selectStatement =
            "select comaccount_id from comaccount";
      PreparedStatement prepStmt =
            con.prepareStatement(selectStatement);

      ResultSet rs = prepStmt.executeQuery();
      ArrayList a = new ArrayList();

      System.out.println("in selectAll() , before row-fetch");
	  while (rs.next()) {
         String accountid = rs.getString(1);
         a.add(accountid);
      }
	  System.out.println("in selectAll() , row-fetch ends, ArrayList a :" + a.toString());

      prepStmt.close();
      releaseConnection();

      return a;
   }

   private void loadRow() throws SQLException {

      makeConnection();
      String selectStatement =
            "select first_name, last_name, type, balance, credit_limit " +
            "from comaccount where comaccount_id = ? ";
      PreparedStatement prepStmt =
            con.prepareStatement(selectStatement);

      prepStmt.setString(1, this.accountId);

      ResultSet rs = prepStmt.executeQuery();

      if (rs.next()) {
         this.firstName = rs.getString(1);
         this.lastName = rs.getString(2);
         this.type = rs.getString(3);
         this.balance = rs.getDouble(4);
         this.creditLimit= rs.getDouble(5);
         prepStmt.close();
      }
      else {
         prepStmt.close();
         releaseConnection();
         throw new NoSuchEntityException("Row for id " + accountId +
            " not found in database.");
      }
      releaseConnection();
   }


   private void storeRow() throws SQLException {

      makeConnection();
      String updateStatement =
            "update comaccount set first_name =  ? , last_name = ? , " +
            "type = ? , balance = ? , credit_limit = ? " +
            "where comaccount_id = ?";
      PreparedStatement prepStmt =
            con.prepareStatement(updateStatement);

      prepStmt.setString(1, firstName);
      prepStmt.setString(2, lastName);
      prepStmt.setString(3, type);
      prepStmt.setDouble(4, balance);
      prepStmt.setDouble(5, creditLimit);
      prepStmt.setString(6, accountId);
      int rowCount = prepStmt.executeUpdate();
      prepStmt.close();

      if (rowCount == 0) {
         releaseConnection();
         throw new EJBException("Storing row for id " + accountId + " failed.");
      }
      releaseConnection();
   }

} // AccountBean
