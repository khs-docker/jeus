import jeus.uddi.v2.api.response.AuthToken;
import jeus.uddi.v2.api.response.BusinessDetail;
import jeus.uddi.v2.api.response.DispositionReport;
import jeus.uddi.v2.api.response.ErrInfo;
import jeus.uddi.v2.api.response.Result;

import jeus.uddi.v2.client.UDDIClient;
import jeus.uddi.v2.client.UDDIException;

import jeus.uddi.v2.datatype.Name;
import jeus.uddi.v2.datatype.business.BusinessEntity;

import java.util.Vector;


/*
 * @(#)SaveBusinessSample.java                2004. 6. 14. ¿ÀÈÄ 3:36:53
 * Version 1.0
 *
 * The source code contained herein is licensed under the Tmax Soft License
 * Copyright (C) 2004, Tmax Soft Co., Ltd.
 * All Rights Reserved.
 */

/**
 * @author mssung
 */
public class SaveBusinessSample
{
   public static void main(String[] args) throws Exception
   {
      SaveBusinessSample sample = new SaveBusinessSample();

      System.out.println("\n##### Running SaveBusinessSample #####");
      sample.run();
      System.out.println("\n##### Done #####");
   }

   private void run()
   {
      UDDIClient client = new UDDIClient();

      try
      {
         client.setInquiryURL("http://localhost:8088/uddi/inquiry");
         client.setPublishURL("http://localhost:8088/uddi/publish");

         // execute a GetAuthToken request
         AuthToken authToken = client.get_authToken("jeus", "password");

         // generate a BusinessEntity
         BusinessEntity businessEntity = new BusinessEntity();
         businessEntity.setBusinessKey("");
         businessEntity.addName(new Name("test_Biz", "en"));

         // generate a BusinessEntity Vector
         Vector businessVector = new Vector();
         businessVector.add(businessEntity);

         // execute the SaveBusiness request
         BusinessDetail detail = client.save_business(authToken.getAuthInfoString(), businessVector);

         Vector businessEntityVector = detail.getBusinessEntityVector();

         if ((businessEntityVector != null) && !businessEntityVector.isEmpty())
         {
            for (int i = 0; i < businessEntityVector.size(); i++)
            {
               BusinessEntity savedBusiness = (BusinessEntity)businessEntityVector.elementAt(i);
               System.out.println("Published Business Key: " + savedBusiness.getBusinessKey());

               Vector nameVector = savedBusiness.getNameVector();

               for (int j = 0; j < nameVector.size(); j++)
               {
                  Name name = (Name)nameVector.elementAt(j);
                  System.out.println("Published Business name: " + name.getValue());
               }
            }
         }
         else
         {
            System.out.println("No Published Business(es)");
         }
      }
      catch (UDDIException ex)
      {
         DispositionReport dispReport = ex.getDispositionReport();

         if (dispReport != null)
         {
            Vector resultVector = dispReport.getResultVector();

            if (resultVector != null)
            {
               Result result = (Result)resultVector.elementAt(0);
               System.out.println("Errno:   " + result.getErrno());

               ErrInfo errInfo = result.getErrInfo();

               if (errInfo != null)
               {
                  System.out.println("ErrCode:  " + errInfo.getErrCode());
                  System.out.println("ErrValue:  " + errInfo.getValue());
               }
            }
         }
         else
         {
            ex.printStackTrace();
         }
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }
}
