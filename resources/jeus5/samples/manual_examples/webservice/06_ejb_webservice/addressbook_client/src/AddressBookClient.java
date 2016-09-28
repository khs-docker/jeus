package com.tmaxsoft.webservice.AddressBook;

/*
 * Created on 2005. 2. 01.
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
import AddressBook.*;

import javax.xml.rpc.soap.SOAPFaultException;


public class AddressBookClient
{
   public static void main(String[] args)
   {
      AddressBookClient abc = new AddressBookClient();

      try
      {
         AddressBookIF port = new AddressBookService_Impl().getAddressBookIFPort();

         abc.allPerson(port);
         abc.addPerson(port, "Peter");
         abc.modPerson(port, "Peter");
         abc.delPerson(port, "Peter");
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }

   /* Add */
   public void addPerson(AddressBookIF port, String name)
   {
      PersonInfo pi = new PersonInfo();
      Address ad = new Address();

      ad.setAddr("Chung-Ju");
      ad.setStreet("Kyo-Hyun");
      ad.setZipcode("380-952");

      pi.setAddress(ad);
      pi.setName(name);
      pi.setPhoneNumber("016-888-6666");

      System.out.println("############   Add Person  ###############");

      try
      {
         PersonInfo[] par = port.add(pi);

         for (int i = 0; i < par.length; i++)
            System.out.println("Person [" + i + "] = " + par[i].getName() + " @ " + par[i].getPhoneNumber());
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }

   /* View */
   public void viewPerson(AddressBookIF port)
   {
      PersonInfo pi = new PersonInfo();

      System.out.println("############ View Person   ###############");

      try
      {
         pi = port.view("Peter");
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }

      System.out.println("Person = " + pi.getName());
   }

   /* listAll */
   public void allPerson(AddressBookIF port)
   {
      System.out.println("############ List All Person #############");

      try
      {
         PersonInfo[] pi = port.listAll();

         for (int i = 0; i < pi.length; i++)
            System.out.println("Person [" + i + "] = " + pi[i].getName());
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }

   /* delete */
   public void delPerson(AddressBookIF port, String name)
   {
      System.out.println("############ Delete Person  ##############");

      try
      {
         PersonInfo[] pi = port.delete(name);

         for (int i = 0; i < pi.length; i++)
            System.out.println("Person [" + i + "] = " + pi[i].getName());
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }

   /* Modify */
   public void modPerson(AddressBookIF port, String name)
   {
      Address ad = new Address();

      ad.setAddr("SungNam");
      ad.setStreet("BunDang");
      ad.setZipcode("428-221");

      System.out.println("############ Modify Person  ##############");

      try
      {
         PersonInfo pi = port.view(name);
         pi.setAddress(ad);
         pi.setPhoneNumber("016-770-6666");

         PersonInfo[] par = port.modify(pi);

         for (int i = 0; i < par.length; i++)
            System.out.println("Person [" + i + "] = " + par[i].getName() + " @ " + par[i].getPhoneNumber());
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }
}
