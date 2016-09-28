import jeus.uddi.v2.api.response.DispositionReport;
import jeus.uddi.v2.api.response.ErrInfo;
import jeus.uddi.v2.api.response.Result;
import jeus.uddi.v2.api.response.TModelInfo;
import jeus.uddi.v2.api.response.TModelInfos;
import jeus.uddi.v2.api.response.TModelList;

import jeus.uddi.v2.client.UDDIClient;
import jeus.uddi.v2.client.UDDIException;

import java.util.Vector;


/*
 * @(#)FindTModelSample.java                2004. 6. 14. ¿ÀÈÄ 3:45:29
 * Version 1.0
 *
 * The source code contained herein is licensed under the Tmax Soft License
 * Copyright (C) 2004, Tmax Soft Co., Ltd.
 * All Rights Reserved.
 */

/**
 * @author mssung
 */
public class FindTModelSample
{
   public static void main(String[] args)
   {
      FindTModelSample sample = new FindTModelSample();

      System.out.println("\n##### Running FindTModelSample #####");
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

         TModelList tModelList = client.find_tModel(null, "uddi", null, null, 0);
         TModelInfos tModelInfos = tModelList.getTModelInfos();

         Vector tModelInfoVector = tModelInfos.getTModelInfoVector();

         if ((tModelInfoVector != null) && !tModelInfoVector.isEmpty())
         {
            for (int i = 0; i < tModelInfoVector.size(); i++)
            {
               TModelInfo tModelInfo = (TModelInfo)tModelInfoVector.elementAt(i);
               System.out.println("Found TModel name: " + tModelInfo.getNameString());
            }
         }
         else
         {
            System.out.println("No Found TModel(es)");
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
