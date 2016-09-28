package address.impl;

import address.*;

import java.util.HashMap;


public class AddressBookImpl
{
   private static HashMap map = new HashMap();

   static
   {
      Address addr = new Address();

      addr.setAddr("Seoul City");
      addr.setStreet("Kang-Nam");
      addr.setZipcode("123");

      PersonInfo pi = new PersonInfo();

      pi.setName("default_user");
      pi.setPhoneNumber("011-123-1234");
      pi.setAddress(addr);

      map.put(pi.getName(), pi);
   }

   public AddressBookImpl()
   {
   }

   public PersonInfo[] add(PersonInfo pi)
   {
      map.put(pi.getName(), pi);

      return listAll();
   }

   public PersonInfo[] delete(String name)
   {
      map.remove(name);

      return listAll();
   }

   public PersonInfo[] modify(PersonInfo pi)
   {
      map.put(pi.getName(), pi);

      return listAll();
   }

   public PersonInfo view(String name)
   {
      return (PersonInfo)map.get(name);
   }

   public PersonInfo[] listAll()
   {
      PersonInfo[] pilist = new PersonInfo[map.size()];
      Object[] keyList = map.keySet().toArray();

      for (int i = 0; i < keyList.length; i++)
      {
         pilist[i] = (PersonInfo)map.get(keyList[i]);
      }

      return pilist;
   }
}
