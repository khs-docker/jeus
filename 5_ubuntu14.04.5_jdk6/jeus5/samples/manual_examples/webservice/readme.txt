********************************************************************************
*                              Web Service ���� ����                           *
********************************************************************************

I. ���� ���� ���
   �� �������� �⺻������ Ant�� ����ؼ� �������ϰ� �����ϵ��� �Ǿ� �ֽ��ϴ�.
   �׸���, Example Server�� ����ؼ� �����մϴ�. Example Server�� JEUS_HOME��
   �ִ� readme.txt ������ VI. JEUS ���� �κ��� �����Ͻʽÿ�.

   * Build �� Deploy
    > jant

   * Ŭ���̾�Ʈ ����
    > jant run

   * Undeploy
     > jant undeploy

   * ������ ���丮 �� ���� ����
     > jant clean

   * Build, Deploy, Client run, Undeploy
     (������ ���� 4������ �Ѳ����� �����ϴ� ��쵵 �ִ�.)
     > jant

   ����: jant�� JEUS_HOME/bin ���丮�� ������, JEUS_HOME/lib/etc/ant�� �ִ�
   Ant�� ������� �ݴϴ�.

   �̿ܿ� ������ Compile �� Deploy ������ �ʿ��� ��쿡�� �� ��� ���丮��
   �ִ� readme.txt ������ �����Ͻʽÿ�.

II. ���� ����

  * 05_javabean_webservice
      style_doclit : Document/Literal ������ ����
      style_rpcenc : Rpc/Encoded ������ ����

  * 06_ejb_webservice
      ejb_address : EJB ������ ����
      addressbook_client : EJB ������ Client ����

  * 07_j2seclient
      j2seClient_DII : Rpc/Encoded ������ J2SE Client ����
      j2seClient_proxy : Document/Literal ������ J2SE Client ����

  * 08_j2eeclient
      j2eeClient_with_wsdl : Document/Literal ������ J2EE Client ����
      j2eeClient_without_wsdl : Rpc/Encoded ������ J2EE Client ����

  * 09_msg_handler
      file_attachment_client : SAAJ ������ Client ����
      file_attachment_handler_service : SAAJ ������ ����

  * 10_uddi
      client : JEUS UDDI Client ����

  * 13_data_type
      Calculator1_usingValueType : Calculator ����
      Calculator2_usingStandardHolderType : Calculator ���� ����
      Calculator3_usingGeneratedHolderType : Calculator ���� ����
      Calculator4_usingExceptionAsSOAPFault : Calculator ���� ����
      dataHandlerOnly : wsdl2java�� dataHandlerOnly �Ӽ� ����
      noDataBinding : wsdl2java�� noDataBinding �Ӽ� ����

  * 14_ws_security
      basic_authentication
        basic_auth_WEB_WebService/client 
              : �ڹ� Ŭ���� ������ ���� ���� Client ����
        basic_auth_WEB_WebService/server 
              : �ڹ� Ŭ���� ������ ���� ���� ����
        basic_authentication/basic_auth_EJB_WebService/client
              : EJB ������ ���� ���� Client ����
        basic_authentication/basic_auth_EJB_WebService/server
              : EJB ������ ���� ���� ����

      message_level_security/J2EEClient_PingSecurityService
              : ������ ���� J2EE Client ����
      message_level_security/J2EEClient_PingSecurityService_using_API
              : ������ ���� API�� �̿��� ������ J2EE Client ����
      message_level_security/PingSecurityService
              : ������ ���� ���� ����

      trasport_level_security/J2SEClient_PingSSLSecurityService
              : SSL�� �̿��� ������ ���� ���� J2EE Client����
      trasport_level_security/PingSSLSecurityService
              : SSL�� �̿��� ������ ���� ���� ����
