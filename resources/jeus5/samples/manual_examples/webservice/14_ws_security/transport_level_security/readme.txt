0. �� ������ �����ϱ� ���� �ؾ� �� �ϵ�.

��. ���� ����

 (1) WebTOB �� �������Ͽ� SSL ȯ�� ���� �߰� �� ���� ������ ��ġ
 (2) Servlet ���������� WebTOB Listener �� ������.
 (3) Web���� ���� �κ��� �������� ���� 

��. private key ����
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

��. webtob ���������� wsconfig.m ���� ����

1. ����

�� ���α׷��� SSL�� ���Ͽ� Client�� ���� ���� ���ڿ��� �״�� Ŭ���̾�Ʈ���� ������ Ping Service�̴�.(SSL�� �̿��� Echo Service�̴�.)

2. ���� �� ���÷���

jant�� �̿��Ͽ� �����Ѵ�.
��. PingSSLSecurityService ���丮�� �̵��Ͽ� ������ ����� �����ϰ� ���÷��� �Ѵ�.

$>jant

jeus�� ������ �ܼ�ȭ�鿡�� deploy message�� Ȯ���� �� �ִ�.


3. ����
  ��. ���� ���� ���־�� �� �͵�.
      %JEUS_HOME%/bin/jant ��ũ��Ʈ�� ANT_OPTS �� "-Djavax.net.ssl.trustStore=.\mytruststore -Djavax.net.ssl.trustStorePassword=test123" �� �߰��� �ش�.
  ��. ������ �������� import�Ͽ� Ŭ���̾�Ʈ�� truststore�� ����.
      ��) https://localhost:8443/PingSSLSecurity/PingSSLSecurityService ���񽺸� ����ϴ� ���� ����
      1). ���ͳ� �ͽ��÷η��� https://localhost:8443/PingSSLSecurity/PingSSLSecurityService?wsdl �������� ����.
      2). WSDL�� ���̸� ���� �ϴ��� "�ڹ���" ��ư�� Ŭ���Ѵ�.
      3). "������" ���̾�α� -> "�ڼ���" �� -> "���Ͽ� ����" ��ư�� Ŭ�� : ����� ������ 
          "DER�� ���ڵ�� X.509 ���̳ʸ�(.CER)"�� �����Ѵ�.(myssl.cer�� �����ߴٰ� ����)
      4). trust key store�� ���� �������� import �Ѵ�.(myssl.cer ������ ������ ���丮�� �̵��� �Ŀ� ������ �����Ѵ�.)
          keytool -import -file myssl.cer -keystore mytruststore -storepass test123

      myssl.cer ������ ���� ���丮�� mytruststore��� keystore�� import�Ѵ�. 
      ���� ���丮�� mytruststore ��� ������ ������ ���� �����Ѵ�. 
      trust store�� �����ϴ� password�� "test123"�� ����Ѵ�.
      

J2SEClient_PingSSLSecurityService ���丮�� �̵��Ͽ� jant�� �����ϸ�
SSL�� ���� wsdl2java�� �����ϰ�, run�� �����Ѵ�.
�Ʒ��� ���� �޽����� Ȯ�� �ߴٸ�, ���������� ����� ���̴�.

[java] You've got message:test message

