package filetransfer;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;

import javax.xml.namespace.QName;
import javax.xml.rpc.JAXRPCException;
import javax.xml.rpc.handler.GenericHandler;
import javax.xml.rpc.handler.MessageContext;
import javax.xml.rpc.handler.soap.SOAPMessageContext;
import javax.xml.soap.AttachmentPart;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;


public final class ClientAttachmentHandler extends GenericHandler
{
   private String getFileName(SOAPMessage request) throws SOAPException
   {
      SOAPBody body = request.getSOAPPart().getEnvelope().getBody();

      SOAPElement opElem = (SOAPElement)body.getChildElements().next();

      SOAPElement paramElem = (SOAPElement)opElem.getChildElements().next();

      return paramElem.getValue();
   }

   public boolean handleRequest(MessageContext mc)
   {
      System.out.println("-- client handler called --");

      SOAPMessageContext ctx = (SOAPMessageContext)mc;

      SOAPMessage request = ctx.getMessage();

      try
      {
         String fileName = getFileName(request);

         System.out.println("create");

         AttachmentPart part = request.createAttachmentPart();

         System.out.println("part:" + part);

         part.setContentType("application/x-zip-compressed");

         FileDataSource fds = new FileDataSource(fileName);

         part.setDataHandler(new DataHandler(fds));

         request.addAttachmentPart(part);
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
