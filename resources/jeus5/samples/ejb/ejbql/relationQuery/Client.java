package ejb.ejbql.relationQuery;

import ejb.ejbql.relationQuery.*;

import java.rmi.RemoteException;

import java.util.*;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.rmi.PortableRemoteObject;


public class Client
{
   public static void main(String[] args)
   {
      try
      {
         InitialContext initial = new InitialContext();
         Object objref = initial.lookup("ejb.ejbql.relationQuery");
         CustomerHome customerHome = (CustomerHome)PortableRemoteObject.narrow(objref, CustomerHome.class);
         objref = initial.lookup("reservation");

         ReservationHome reservationHome = (ReservationHome)PortableRemoteObject.narrow(objref, ReservationHome.class);

         int number = 10;
         Customer[] customers = new Customer[number];
         Reservation[] reservations = new Reservation[number];

         for (int i = 0; i < number; i++)
         {
            System.out.println("Creating customer_" + i);
            customers[i] = customerHome.create(new Integer(i), "customer_" + i);
         }

         Collection col = customerHome.findAll();
         System.out.println("Creating reservation_10");

         Reservation reservation = reservationHome.create(new Integer(10), 1000.00, "20020830");
         reservation.setCustomerInfos(col);

         for (int i = 0; i < number; i++)
         {
            System.out.println("Creating reservation_" + i);

            Vector col_temp = new Vector();

            for (int j = 0; j < i; j++)
            {
               col_temp.add(customers[i]);
            }

            reservations[i] = reservationHome.create(new Integer(i), 500 + (100 * i), "2002091" + i);
            reservations[i].setCustomerInfos(col_temp);
         }

         col = reservationHome.findAll();

         Iterator it = col.iterator();

         while (it.hasNext())
         {
            Reservation rsv = (Reservation)it.next();
            System.out.println(rsv.getId() + ", " + rsv.getPayAmount() + ", " + rsv.getReservedDate());

            Collection col_2 = rsv.getCustomerIDs();
            Iterator it_2 = col_2.iterator();
            System.out.println("Customer infos..");

            while (it_2.hasNext())
            {
               Customer custom_temp = customerHome.findByPrimaryKey((Integer)it_2.next());
               System.out.println("    " + custom_temp.getId() + ", " + custom_temp.getName());
            }
         }

         customerHome.test();
         reservationHome.test();

         for (int i = 0; i < number; i++)
         {
            customers[i].remove();
         }

         for (int i = 0; i < number; i++)
         {
            reservations[i].remove();
         }

         reservation.remove();
      }
      catch (Exception e)
      {
         System.out.println("Error caught : " + e.getMessage());
         e.printStackTrace();
      }
   }
}
