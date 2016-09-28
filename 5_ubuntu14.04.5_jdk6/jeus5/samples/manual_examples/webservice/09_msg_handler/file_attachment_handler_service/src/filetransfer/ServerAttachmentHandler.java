package filetransfer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.util.Iterator;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.rpc.JAXRPCException;
import javax.xml.rpc.handler.GenericHandler;
import javax.xml.rpc.handler.HandlerInfo;
import javax.xml.rpc.handler.MessageContext;
import javax.xml.rpc.handler.soap.SOAPMessageContext;
import javax.xml.soap.AttachmentPart;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;


public final class ServerAttachmentHandler extends GenericHandler
{
   private File dir;
   private final String DIR_PROP = "directory";

   public void init(HandlerInfo info)
   {
      super.init(info);

      System.out.println("## INFO : " + info);

      Map m = info.getHandlerConfig();

      System.out.println("## map : " + m);

      String dirName = (String)m.get(DIR_PROP);

      if (dirName == null)
      {
         throw new JAXRPCException("Property named: " + DIR_PROP + " was not found");
      }

      dir = new File(dirName);

      if (!dir.exists())
      {
         if (!dir.mkdirs())
         {
            throw new JAXRPCException("Unable to create directory: " + dirName);
         }
      }

      if (!dir.canWrite())
      {
         throw new JAXRPCException("Don't have write permission for " + dirName);
      }
   }

   private String getFileName(SOAPMessage request) throws SOAPException
   {
      SOAPBody body = request.getSOAPPart().getEnvelope().getBody();

      Object obj = body.getChildElements().next();
      SOAPElement opElem = (SOAPElement)obj;

      SOAPElement paramElem = (SOAPElement)opElem.getChildElements().next();

      return paramElem.getValue();
   }

   private void copyFile(InputStream is, OutputStream os) throws IOException
   {
      byte[] b = new byte[8192];
      int nr;

      while ((nr = is.read(b)) != -1)
      {
         os.write(b, 0, nr);
      }
   }

   public boolean handleRequest(MessageContext mc)
   {
      SOAPMessageContext ctx = (SOAPMessageContext)mc;

      SOAPMessage request = ctx.getMessage();

      if (request.countAttachments() == 0)
      {
         throw new JAXRPCException("** Expected attachments");
      }

      try
      {
         Iterator it = request.getAttachments();

         while (it.hasNext())
         {
            AttachmentPart part = (AttachmentPart)it.next();

            String fileName = getFileName(request);

            System.out.println("Received file named: " + fileName);

            File outFile = new File(dir, fileName);

            System.out.println("File Path : " + outFile.getAbsolutePath());

            OutputStream os = null;
            InputStream is = null;

            try
            {
               os = new FileOutputStream(outFile);
               is = part.getDataHandler().getInputStream();

               copyFile(is, os);
            }
            catch (IOException ioe)
            {
               ioe.printStackTrace();
               throw new JAXRPCException("Exception writing file " + fileName, ioe);
            }
            finally
            {
               try
               {
                  if (is != null)
                  {
                     is.close();
                  }
               }
               catch (IOException ignore)
               {
               }

               try
               {
                  if (os != null)
                  {
                     os.close();
                  }
               }
               catch (IOException ignore)
               {
               }
            }
         }
      }
      catch (SOAPException e)
      {
         e.printStackTrace();
         throw new JAXRPCException(e);
      }

      return true;
   }

   public QName[] getHeaders()
   {
      // TODO Auto-generated method stub
      return null;
   }
}
