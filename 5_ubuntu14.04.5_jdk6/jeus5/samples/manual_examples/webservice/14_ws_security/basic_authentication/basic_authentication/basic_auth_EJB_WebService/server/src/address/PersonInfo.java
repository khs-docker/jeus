package address;

public class PersonInfo implements java.io.Serializable
{
   private Address address;
   private java.lang.String name;
   private java.lang.String phoneNumber;

   public PersonInfo()
   {
   }

   public Address getAddress()
   {
      return address;
   }

   public void setAddress(Address address)
   {
      this.address = address;
   }

   public java.lang.String getName()
   {
      return name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getPhoneNumber()
   {
      return phoneNumber;
   }

   public void setPhoneNumber(java.lang.String phoneNumber)
   {
      this.phoneNumber = phoneNumber;
   }
}
