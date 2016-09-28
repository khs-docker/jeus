********************************************************************************
*                              Web Service 예제 정보                           *
********************************************************************************

I. 예제 실행 방법
   본 예제들은 기본적으로 Ant를 사용해서 컴파일하고 실행하도록 되어 있습니다.
   그리고, Example Server를 사용해서 동작합니다. Example Server는 JEUS_HOME에
   있는 readme.txt 파일의 VI. JEUS 실행 부분을 참고하십시오.

   * Build 및 Deploy
    > jant

   * 클라이언트 실행
    > jant run

   * Undeploy
     > jant undeploy

   * 생성된 디렉토리 및 파일 삭제
     > jant clean

   * Build, Deploy, Client run, Undeploy
     (예제에 따라서 4가지를 한꺼번에 실행하는 경우도 있다.)
     > jant

   참고: jant는 JEUS_HOME/bin 디렉토리에 있으며, JEUS_HOME/lib/etc/ant에 있는
   Ant를 실행시켜 줍니다.

   이외에 별도의 Compile 및 Deploy 과정이 필요한 경우에는 각 모듈 디렉토리에
   있는 readme.txt 파일을 참고하십시오.

II. 예제 설명

  * 05_javabean_webservice
      style_doclit : Document/Literal 웹서비스 예제
      style_rpcenc : Rpc/Encoded 웹서비스 예제

  * 06_ejb_webservice
      ejb_address : EJB 웹서비스 예제
      addressbook_client : EJB 웹서비스 Client 예제

  * 07_j2seclient
      j2seClient_DII : Rpc/Encoded 웹서비스 J2SE Client 예제
      j2seClient_proxy : Document/Literal 웹서비스 J2SE Client 예제

  * 08_j2eeclient
      j2eeClient_with_wsdl : Document/Literal 웹서비스 J2EE Client 예제
      j2eeClient_without_wsdl : Rpc/Encoded 웹서비스 J2EE Client 예제

  * 09_msg_handler
      file_attachment_client : SAAJ 웹서비스 Client 예제
      file_attachment_handler_service : SAAJ 웹서비스 예제

  * 10_uddi
      client : JEUS UDDI Client 예제

  * 13_data_type
      Calculator1_usingValueType : Calculator 예제
      Calculator2_usingStandardHolderType : Calculator 서비스 예제
      Calculator3_usingGeneratedHolderType : Calculator 서비스 예제
      Calculator4_usingExceptionAsSOAPFault : Calculator 서비스 예제
      dataHandlerOnly : wsdl2java의 dataHandlerOnly 속성 예제
      noDataBinding : wsdl2java의 noDataBinding 속성 예제

  * 14_ws_security
      basic_authentication
        basic_auth_WEB_WebService/client 
              : 자바 클래스 웹서비스 접근 제어 Client 예제
        basic_auth_WEB_WebService/server 
              : 자바 클래스 웹서비스 접근 제어 예제
        basic_authentication/basic_auth_EJB_WebService/client
              : EJB 웹서비스 접근 제어 Client 예제
        basic_authentication/basic_auth_EJB_WebService/server
              : EJB 웹서비스 접근 제어 예제

      message_level_security/J2EEClient_PingSecurityService
              : 웹서비스 보안 J2EE Client 예제
      message_level_security/J2EEClient_PingSecurityService_using_API
              : 웹서비스 보안 API를 이용한 웹서비스 J2EE Client 예제
      message_level_security/PingSecurityService
              : 웹서비스 보안 서비스 예제

      trasport_level_security/J2SEClient_PingSSLSecurityService
              : SSL을 이용한 웹서비스 보안 서비스 J2EE Client예제
      trasport_level_security/PingSSLSecurityService
              : SSL을 이용한 웹서비스 보안 서비스 예제
