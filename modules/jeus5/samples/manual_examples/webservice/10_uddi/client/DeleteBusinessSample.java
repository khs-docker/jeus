import jeus.uddi.v2.api.response.AuthToken;
import jeus.uddi.v2.api.response.BusinessInfo;
import jeus.uddi.v2.api.response.BusinessInfos;
import jeus.uddi.v2.api.response.BusinessList;
import jeus.uddi.v2.api.response.DispositionReport;
import jeus.uddi.v2.api.response.ErrInfo;
import jeus.uddi.v2.api.response.Result;

import jeus.uddi.v2.client.UDDIClient;
import jeus.uddi.v2.client.UDDIException;

import jeus.uddi.v2.datatype.Name;

import java.util.Vector;


/*
 * @(#)DeleteBusinessSample.java                2004. 6. 14. ¿ÀÈÄ 3:51:18
 * Version 1.0
 *
 * The source code contained herein is licensed under the Tmax Soft License
 * Copyright (C) 2004, Tmax Soft Co., Ltd.
 * All Rights Reserved.
 */

/**
 * @author mssung
 */
public class DeleteBusinessSample
{
   public static void main(String[] args) throws Exception
   {
      DeleteBusinessSample sample = new DeleteBusinessSample();

      System.out.println("\n##### Running DeleteBusinessSample #####");
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

         Vector inNames = new Vector();
         inNames.add(new Name("test_Biz"));

         BusinessList businessList = client.find_business(null, inNames, null, null, null, null, 0);
         BusinessInfos businessInfos = businessList.getBusinessInfos();

         Vector businessInfoVector = businessInfos.getBusinessInfoVector();

         if ((businessInfoVector != null) && !businessInfoVector.isEmpty())
         {
            for (int i = 0; i < businessInfoVector.size(); i++)
            {
               BusinessInfo businessInfo = (BusinessInfo)businessInfoVector.elementAt(i);
               String businessKey = businessInfo.getBusinessKey();
               System.out.println("Found business key:" + businessKey);

               DispositionReport dispositionReport = client.delete_business(authToken.getAuthInfoString(), businessKey);

               if (dispositionReport != null)
               {
                  if (dispositionReport.isSuccess())
                  {
                     System.out.println("Business( '" + businessKey + "' successfully deleted");
                  }
                  else
                  {
                     Vector resultVector = dispositionReport.getResultVector();

                     for (int j = 0; j < resultVector.size(); j++)
                     {
                        Result result = (Result)resultVector.elementAt(j);
                        System.out.println("Errno:   " + result.getErrno());

                        ErrInfo errInfo = result.getErrInfo();

                        if (errInfo != null)
                        {
                           System.out.println("ErrCode:  " + errInfo.getErrCode());
                           System.out.println("ErrValue:  " + errInfo.getValue());
                        }
                     }
                  }
               }
            }
         }
         else
         {
            System.out.println("No Found Business(es)");
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
