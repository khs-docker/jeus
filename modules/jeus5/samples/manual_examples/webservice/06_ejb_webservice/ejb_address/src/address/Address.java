package address;

public class Address implements java.io.Serializable
{
   private java.lang.String addr;
   private java.lang.String street;
   private java.lang.String zipcode;

   public Address()
   {
   }

   public java.lang.String getAddr()
   {
      return addr;
   }

   public void setAddr(java.lang.String addr)
   {
      this.addr = addr;
   }

   public java.lang.String getStreet()
   {
      return street;
   }

   public void setStreet(java.lang.String street)
   {
      this.street = street;
   }

   public java.lang.String getZipcode()
   {
      return zipcode;
   }

   public void setZipcode(java.lang.String zipcode)
   {
      this.zipcode = zipcode;
   }
}
