1. 개요

SAAJ를 이용하여 File_send.txt 파일을 전송하는 예제이다.

2. 빌드 및 디플로이

%JEUS_HOME%\samples\manual_examples\webservice\09_msg_handler\file_attachment_handler_service 디렉토리로 이동한다.
jant를 수행하면 .ear 파일이 빌드되고, 디플로이 된다.

$>jant

디플로이 결과는 JEUS를 시작한 콘솔화면에서 확인할 수 있다.

3. 실행
이 예제에 대한 Client는 
%JEUS_HOME%\samples\manual_examples\webservice\09_msg_handler\file_attachment_client 디렉토리에 있다.
이곳에서 jant를 실행하면된다.

아래와 같이 File_send.txt 를 전송했다고 나올 것이다.

     [java] -- client handler called --
     [java] create
     [java] part:com.tmax.axis.attachments.AttachmentPart@1385660
     [java] ** File transfer result: Received file named: File_send.txt
     
4. *****    주의 사항     *****
이 예제에서는 /tmp 라는 디렉토리가 있다는 가정 하에 파일을 전송하는 것이므로
windows의 경우 C:\tmp 라는 디렉토리가 있어야 하고
Unix 계열의 경우 /tmp 디렉토리가 쓰기권한이 설정된 상태로 존재해야 된다.

만약 이 디렉토리를 변경하려면 
%JEUS_HOME%\samples\manual_examples\webservice\09_msg_handler\file_attachment_handler_service\conf\webservices.xml 파일의 
<param-value> 값을 변경해야 한다.

            <handler>
                <handler-name>ServerAttachmentHandler</handler-name>    
                <handler-class>filetransfer.ServerAttachmentHandler</handler-class>
                <init-param>
                    <param-name>directory</param-name>
                    <param-value>/tmp</param-value>
                </init-param>
            </handler> 
            
