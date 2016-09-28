package filetransfer;

public class FileTransfer implements FileTransferIF
{
   public String receiveFile(String s)
   {
      return "Received file named: " + s;
   }
}
