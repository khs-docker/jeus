1. ����

SAAJ�� �̿��Ͽ� File_send.txt ������ �����ϴ� �����̴�.

2. ���� �� ���÷���

%JEUS_HOME%\samples\manual_examples\webservice\09_msg_handler\file_attachment_handler_service ���丮�� �̵��Ѵ�.
jant�� �����ϸ� .ear ������ ����ǰ�, ���÷��� �ȴ�.

$>jant

���÷��� ����� JEUS�� ������ �ܼ�ȭ�鿡�� Ȯ���� �� �ִ�.

3. ����
�� ������ ���� Client�� 
%JEUS_HOME%\samples\manual_examples\webservice\09_msg_handler\file_attachment_client ���丮�� �ִ�.
�̰����� jant�� �����ϸ�ȴ�.

�Ʒ��� ���� File_send.txt �� �����ߴٰ� ���� ���̴�.

     [java] -- client handler called --
     [java] create
     [java] part:com.tmax.axis.attachments.AttachmentPart@1385660
     [java] ** File transfer result: Received file named: File_send.txt
     
4. *****    ���� ����     *****
�� ���������� /tmp ��� ���丮�� �ִٴ� ���� �Ͽ� ������ �����ϴ� ���̹Ƿ�
windows�� ��� C:\tmp ��� ���丮�� �־�� �ϰ�
Unix �迭�� ��� /tmp ���丮�� ��������� ������ ���·� �����ؾ� �ȴ�.

���� �� ���丮�� �����Ϸ��� 
%JEUS_HOME%\samples\manual_examples\webservice\09_msg_handler\file_attachment_handler_service\conf\webservices.xml ������ 
<param-value> ���� �����ؾ� �Ѵ�.

            <handler>
                <handler-name>ServerAttachmentHandler</handler-name>    
                <handler-class>filetransfer.ServerAttachmentHandler</handler-class>
                <init-param>
                    <param-name>directory</param-name>
                    <param-value>/tmp</param-value>
                </init-param>
            </handler> 
            
