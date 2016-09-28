package filetransfer;

import FileAttachmentService_pkg.*;

import java.io.File;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.Stub;
import javax.xml.rpc.handler.HandlerInfo;
import javax.xml.rpc.handler.HandlerRegistry;


public final class Client
{
   public static void main(String[] args) throws Exception
   {
      Service svc = new FileAttachmentService_Impl();

      HandlerRegistry registry = svc.getHandlerRegistry();

      List list = new ArrayList();
      list.add(new HandlerInfo(ClientAttachmentHandler.class, null, null));

      QName portName = new QName("", "FileTransferIFPort");

      registry.setHandlerChain(portName, list);

      FileTransferIF port = ((FileAttachmentService_Impl)svc).getFileTransferIFPort();

      String result = port.receiveFile("File_send.txt");

      System.out.println("** File transfer result: " + result);
   }
}
