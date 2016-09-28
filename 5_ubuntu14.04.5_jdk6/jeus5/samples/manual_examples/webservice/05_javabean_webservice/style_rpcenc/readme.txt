1. 개요

Client로 부터 받은 문자열을 그대로 클라이언트에게 보내는 Echo Service이다.
(참고 : rpc/encoded 서비스)

2. 빌드 및 디플로이 한다.
jant를 이용하여 빌드한다.
$>jant
결과물은 ./build/EchoRpcEnc.ear 파일이 생겼다면 성공적으로 빌드된 것이고, 디플로이 결과는 JEUS를 시작한 콘솔 화면에서
확인 할 수 있다.  

3. 실행

이 예제에 대한 Client는 J2SE Client와 J2EE Client 두 가지가 있다.

하나는 %JEUS_HOME%\samples\manual_examples\webservice\07_j2seclient\j2seClient_DII 디렉토리에 있다.
이곳에서 jant를 실행하면된다.

두번째는
%JEUS_HOME%\samples\manual_examples\webservice\08_j2eeclient\j2eeClient_without_wsdl 디렉토리에서 빌드를 하고
빌드된 EchoJspClient2.ear 파일을 배치 완료 했다면
http://localhost:8088/EchoJspClient2/helloClient.jsp로 접속해서 확인을 할 수 있다.
