0. 이 예제를 수행하기 전에 해야 할 일들.

ㄱ. 서버 설정

 (1) WebTOB 의 설정파일에 SSL 환경 관련 추가 및 서버 인증서 설치
 (2) Servlet 엔진에서는 WebTOB Listener 를 설정함.
 (3) Web서비스 개발 부분은 변동사항 없음 

ㄴ. private key 생성
 %JEUS_HOME%/webserver/bin/ca.exe (or CA)

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
$>./CA -newcert
Generating a 1024 bit RSA private key
...................++++++
.......................................++++++
writing new private key to 'newcert.pem'
Enter PEM pass phrase:
Verifying - Enter PEM pass phrase:
-----
You are about to be asked to enter information that will be incorporated
into your certificate request.
What you are about to enter is what is called a Distinguished Name or a DN.
There are quite a few fields but you can leave some blank
For some fields there will be a default value,
If you enter '.', the field will be left blank.
-----
Country Name (2 letter code) [KR]:
State or Province Name (full name) []:Seoul
Locality Name (eg, city) []:Seoul
Organization Name (eg, company) [Tmax Ltd]:Tmax
Organizational Unit Name (eg, section) []:QA
Common Name (eg, YOUR name) []:localhost
Email Address []:test123@tmax.co.kr
Certificate (and private key) is in newreq.pem

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

ㄷ. webtob 설정파일은 wsconfig.m 파일 참조

1. 개요

이 프로그램은 SSL을 통하여 Client로 부터 받은 문자열을 그대로 클라이언트에게 보내는 Ping Service이다.(SSL을 이용한 Echo Service이다.)

2. 빌드 및 디플로이

jant를 이용하여 빌드한다.
ㄱ. PingSSLSecurityService 디렉토리로 이동하여 서비스할 모듈을 빌드하고 디플로이 한다.

$>jant

jeus를 시작한 콘솔화면에서 deploy message를 확인할 수 있다.


3. 실행
  ㄱ. 실행 전에 해주어야 할 것들.
      %JEUS_HOME%/bin/jant 스크립트의 ANT_OPTS 에 "-Djavax.net.ssl.trustStore=.\mytruststore -Djavax.net.ssl.trustStorePassword=test123" 를 추가해 준다.
  ㄴ. 서버의 인증서를 import하여 클라이언트에 truststore를 만듦.
      예) https://localhost:8443/PingSSLSecurity/PingSSLSecurityService 서비스를 사용하는 경우로 가정
      1). 인터넷 익스플로러로 https://localhost:8443/PingSSLSecurity/PingSSLSecurityService?wsdl 페이지를 연다.
      2). WSDL이 보이면 우측 하단의 "자물쇠" 버튼을 클릭한다.
      3). "인증서" 다이얼로그 -> "자세히" 탭 -> "파일에 복사" 버튼을 클릭 : 사용할 형식은 
          "DER로 인코드된 X.509 바이너리(.CER)"를 선택한다.(myssl.cer로 저장했다고 가정)
      4). trust key store에 서버 인증서를 import 한다.(myssl.cer 파일을 저장한 디렉토리로 이동한 후에 다음을 수행한다.)
          keytool -import -file myssl.cer -keystore mytruststore -storepass test123

      myssl.cer 파일을 현재 디렉토리의 mytruststore라는 keystore에 import한다. 
      현재 디렉토리에 mytruststore 라는 파일이 없으면 새로 생성한다. 
      trust store에 저장하는 password를 "test123"을 사용한다.
      

J2SEClient_PingSSLSecurityService 디렉토리로 이동하여 jant를 실행하면
SSL을 통한 wsdl2java를 수행하고, run을 수행한다.
아래와 같은 메시지를 확인 했다면, 성공적으로 수행된 것이다.

[java] You've got message:test message

