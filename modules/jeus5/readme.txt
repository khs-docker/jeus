********************************************************************************
*                        Tmax Soft JEUS 5 ������ ����                          *
*                                                                              *
*                             2005�� 5�� 20��                                  *
********************************************************************************

                                ��     ��

                     I.......: ����
                     II......: ��ġ
                     III.....: ���� ȯ��
                     IV......: �� ��ɰ� ���� ����
                     V.......: QuickStart �����ϱ�
                     VI......: JEUS ����
                     VII.....: ���� ���׷��̵�
                     VIII....: ����ó




I. ����

 TmaxSoft JEUS 5�� ���� ���� ȯ���մϴ�.

 �� ������ J2EE 1.4 ������ ����, TmaxSoft���� ���� JEUS 5 ���ø����̼� ������
 ������ ���� �����Դϴ�. JEUS 5�� ���� �������� ������ ���� �� ������, ���뼺��
 J2EE 1.4�� ��� �� ���� ��� �߰��� ���� �������� ���ϰ� ����� �� �ְ�
 �Ǿ����ϴ�.

 �� ������ JEUS 5�� �⺻ ������ ��� �����Ƿ�, �ݵ�� ������ �ֽñ� �ٶ��ϴ�.



II. ��ġ

JEUS 5�� ��ġ ������ ���� ����Ʈ���� ���� �� �ֽ��ϴ�.

   http://technet.tmax.co.kr

���̼��� ���� ���� ������ ����Ʈ���� ���� �� �ֽ��ϴ�.

JEUS 5������ �ϳ��� �ν��緯���� ���� �÷����� ��Ʈ�� �����մϴ�.
�ν��緯�� ũ�� Windows��� Unix������ �Ǿ� �ֽ��ϴ�.

   jeus5-XXX.[bin|exe]

Ȯ���ڰ� .bin�̸� Unix��, .exe�̸� Windows�� �ν��緯�Դϴ�.

JEUS�� �ν��� ����� �� ������ �ֽ��ϴ�.

 A. GUI ��� ��ġ(Unix/Windows)
    ����ó�� �����ϸ� GUI ���·� ��ġ�˴ϴ�.

    > jeus5-XXX.bin �Ǵ� jeus5-XXX.bin

 B. Console ��� ��ġ(Unix/Linux ��)
    ����ó�� �����ϸ� Console ���·� ��ġ�˴ϴ�.

    > jeus5-XXX.bin -i console


JEUS�� ���̼��� ������ ���� JEUS 4.x ������ ���̼��� ������ ����ϰų�,
TmaxSoft Technical Network(http://technet.tmax.co.kr)���� ���� ���̼�����
��û�ؼ� ����Ͻø� �˴ϴ�.



III. ���� ȯ��

JEUS 5������ ������ ���� ȯ���� �����մϴ�.

   OS     Solaris, HP-UX, AIX, Windows 2000/XP/2003, Linux(Redhat 7 �̻�)
   CPU    Intel x86 �� ȣȯ, Sun Sparc, PA-RISC, IBM PowerPC
   RAM    �ּ� 256MB�� ���� �޸�
   DISK   �ּ� 500MB�� ���� ����
   Java   1.4, 5.0 ����



IV. �� ��� �� ���� ����

 A. ���� Specification

   JEUS 5�� J2EE 1.4�� �Ϻ� �����ϰ� �ֽ��ϴ�. ��ǥ���� Specification�� ������
   �����ϴ�. ���� �ڼ��� ������ JEUS�������Ʈ�� �����Ͻñ� �ٶ��ϴ�.

   - Enterprise JavaBeans 2.1
   - Servlet 2.4
   - Java ServerPages 2.0
   - Java Message Service 1.1
   - Java Database Connectivity 3.0
   - Java Connector Architecture 1.5
   - Java Management 1.0
   - Java Naming&Directory Interface 1.2.1
   - Java Authorization Contract for Containers 1.0
   - Simple Object Access Protocol 1.2
   - Web Service Description Language 1.1

   �̿ܿ� WebService�� ���� ������ ���� Specification�� �����մϴ�.
   - WS-Security 1.0
   - WS-Basic Profile 1.0
   - Universal Description, Discovery and Integration 2.0/3.0

 B. ���� ���

   - NonBlocking I/O ���
     NonBlocking I/O(���� NBIO)�� ��������ν� I/O �۾��� �ʿ��� �������� ������
     ȹ�������� �ٿ����ϴ�. �̷ν� ��뷮�� Request�� �ξ� ��Ȱ�ϰ� ó���� ��
     �ְ� �Ǿ����ϴ�.

   - appcompiler�� ���� ���
     ������ ejbcompiler�� EJB �Ӹ� �ƴ϶� Web Service�� �����ϰԵǸ鼭, �̸���
     ����Ǿ����ϴ�. ���� ���ο� Source Generating&Compiling ����� ���������ν�
     ���� ���� ���� ������ ������ ���ϴ�.

   - JMS�� I/O ó�� ���� ���
     NBIO channel�� Channel recovery�� ����ؼ� I/Oó���� �ξ� ��Ȱ�������ϴ�.

   - JMS�� �޽��� ó�� ���� ���
     Message�� ����� ��Ŷ ������ ����ȭ, DUP_OK_ACK�� ������ ���ؼ� �޽��� ó��
     �ɷ��� ���Ǿ����ϴ�.

   - JMS �޽��� �ŷڼ� ���
     Store&Forward�� ���ؼ� JMS �޽����� �ŷڼ��� ���Ǿ����ϴ�.

   - Message-driven Beans�� ���� ���
     Pipelined Serial Executor�� Thread Pool�� ����ȭ�� Message-driven Beans��
     ������ ���Ǿ����ϴ�.


 C. ���� ��� ���

   - ���ο� WebManager ����
     ������ ���Ӱ� �����ε� WebManager�� ���������ν� �ξ� ���� ������ ����
     �����ϴ�.

   - Java Management Specification ����
     Java Management Specification�� �������� JEUS�� ��� ���� �� ����͸���
     ����ڰ� ���� ���α׷��� �� �� �ֽ��ϴ�.

   - ���ο� Logging �ý��� ����
     �α׸� ȭ��, ����, ����, SNMP�� ���� ���·� ����� �� ������, �ʿ信 ����
     �پ��ϰ� �α� �ڵ鷯�� ������ �� �ֽ��ϴ�.

   - Virtual Host ���� ����
     ����� JEUS BasePort�� ������ Virtual Host ������ �����߽��ϴ�. �̷ν�
     �ϳ��� �ӽſ��� JEUS Ŭ�����͸��� ������ �� �ְ� �Ǿ�����, ��� ������
     ������ �������ϴ�.

   - ���� ���� ���
     ���� ���񽺸� ���� SPI(Service Provider Interface), API(Application
     Provider Interface)�� ���������ν� Ŀ���� ���� ���񽺸� ������ �� �ֽ��ϴ�.
     �׸��� Security Domain�� �������� ���� �پ��� ���� ���񽺸� �����մϴ�.

   - ����ȭ�� WS(Web Server)���� ����
     JEUSWebServer�� ���ؼ� ������ ���� ����(*.m)�� ���� �ʿ���� JEUS���� ����
     �ϴ� �͸����� JEUSWebServer�� ���� ������ ���� �� �������� �����մϴ�.
     �׸���, �� ������ WebManager���� �� �� �ֱ� ������ JEUSWebServer�� ȯ��
     ���� ���Ͽ� ���ؼ� �𸣴� ����� ���� ������ �� �ֽ��ϴ�.


D. ��뼺 ���
   - ���Ӱ� ���յ� Deploy ���
     EJB, Servlet, EAR ���� Application�� Packaging�ϰ� Deploy�ϴ� �����
     ����ȭ�Ǿ����ϴ�.
     ���� ��� Application�� ���� �������� Directory�� Ŭ������ Ǯ�����
     ����(Exploded)�� JAR ���� �������� Deploy�� �� �����Ƿ�, ���ϰ� ������
     �� �ֽ��ϴ�.

   - Deploy�� ���� ���丮 ����ȭ
     ������ ejb_home, servlet_home�� app_home���� ���յǾ����ϴ�.
     �׷��� EJB, Servlet, J2EE Application�� ��� app_home���� Deploy�� ��
     �ֽ��ϴ�.

   - Class Loading ��� ����
     ������ JAR ��忡�� �����ϴ� EJB�� SHARED Class Loading ��� �̿ܿ�
     J2EE�� Packaging Specification�� �ؼ��ϴ� ISOLATED Class Loading �����
     �����մϴ�. ISOLATED ����� ���� �������� ����̰�,  SHARED���� �߻��� ��
     �ִ� Class Dependency�� ����� ������ EJB deploy/undeploy�ÿ� �����
     Servlet Reloading�� ���� �� �ֽ��ϴ�.

   - JEUSBuilder GUI �� ����
     JEUSBuilder�� ���ؼ�, .jar, .war, .ear ������ ���ø����̼��� ���� ��Ű¡��
     �� �ֽ��ϴ�.

   - appcompiler�� �̿��� ��� �����ϸ�
     appcompiler�� ����ؼ� .jar, .ear�� ���� ��Ű¡�� ���¿����� �������� ����
     �������ϴ�.

   - ���� ���� Windows Service ���
     �ϳ��� JEUS�� ����ؼ� ���� ���� Windows Service�� ����ϰ�, ���� ������ ��
     �ֽ��ϴ�. �ڼ��� ���� svcinstall.exe�� svcremove.exe�� �����Ͻñ� �ٶ��ϴ�.

   - WebService�� ��� ��ȭ
     J2EE 1.4�� WebService �ܿ� OASIS�� �پ��� Specification�� �����մϴ�.
     �̿� ���Ҿ� ���ɵ� ���� ���Ǿ����ϴ�.


E. ���뼺(High Availability&Failover)
   - Ŭ�����͸��� Failover ��Ȯ�� ���
     ��� Ŭ�����͸��� ���� ü�踦 Mesh������� ��ȯ�Ͽ�, ��尣�� Failover ��Ȯ
     ���� ���������ϴ�.

   - �л�� ���� ����
     ���� �л�� ������ Non-Blocking I/O ����� ������ ���ο� ���� Ŭ�����͸�
     ����� �����Ͽ� ���뼺 �� ������ �����׽��ϴ�.

   - JMS Destination Clustering
     ���� JMS Server�� Destination�� Ŭ�����͸����� ���� ����� �� �ֽ��ϴ�.
     �� ������� Message�� ���۰� ���� ó�� �ɷ��� �������ϴ�.

   - Persistent Timer Service
     EJB 2.1���� �����ϴ� Timer ������ Persistent ����� �����մϴ�.
     �׷��Ƿ�, ���۽��� JEUS�� ��ְ� �߻��ϴ���, JEUS�� �������� ������
     ȸ���ϸ� ������ Timer ���񽺵� �����Ǿ� ���� �������� �����մϴ�.


 ��� �߰� �� ���� ���׿� ���� ���� �ڼ��� ������
 �Ŵ����� �����Ͻñ� �ٶ��ϴ�.

 �Ŵ����� JEUS_HOME/docs/manual�� �ֽ��ϴ�.



V. QuickStart �����ϱ�

JEUS 5������ JEUS 5�� �����ϰ� ����� �� �ֵ��� QuickStart�� �����մϴ�.
Windows �÷��������� JEUS�� ��ġ�� ������ ���ÿ� QuickStart GUI ���α׷���
����˴ϴ�.

QuickStart GUI ���α׷� �̿ܿ��� QuickStart�� �����Ϸ��� ������ ���� �����մϴ�.

 > starthsqldb          : HSQL ����
 > jeus-quickstart      : QuickStart ������ ���� JEUS ����


����: QuickStart ������ �����Ǵ� ���� Adventure Builder�� deploy�ǹǷ�
���� �ð��� �ҿ�˴ϴ�.

WebManager�� ����Ϸ��� �� �������� �̿��ؼ� ������ ���� URL�� �ֽ��ϴ�.

  http://localhost:23008/webadmin

Adventure Builder�� ���� ȭ���� ���� URL�� Ȯ���� �� �ֽ��ϴ�.

  http://localhost:8088/consumerwebsite/

QuickStart�� Example ���� ȭ���� ���� URL�� Ȯ���� �� �ֽ��ϴ�.

  http://localhost:8088/samples/ko/index.htm



VI. JEUS ����

JEUS 5�� ��ũ��Ʈ�� ���� ������ ������ �����մϴ�. �׷��� �پ��� ȯ���� ����
�ϱ� ���ؼ� jeus.properties(Windows ȯ�濡���� jeus.properties.cmd)������ �����
�����Ǿ����ϴ�.

 A. JEUS�� �⵿
   1. JEUS�� �����Ϸ��� jeus.properties ������ ���� �׸��� ����� �����Ǿ���
      Ȯ���մϴ�.

      JEUS_HOME, JEUS_BASEPORT, JAVA_HOME

   2. Virtual Node�� ����� ������ ���մϴ�.
      JEUS_HOME/config/vhost.xml���� <enable> �±��� ���� �����մϴ�.
      <enable> �±��� ���� true�̸� ���� ����� JEUS_BASEPORT�� ���� �����ؼ�
      VirtualNode�� �����մϴ�.

      ��) ������ ���� �����Ǿ� ���� ���
      <host>
        <name>tmaxsoft:2100</name>
        <virtual-name>example</virtual-name>
      </host>

      tmaxsoft��� ����� �ӽſ��� JEUS_BASEPORT 2100���� �����ϸ� VirtualNode��
      example�� �˴ϴ�. ���Ŀ��� example�� �������� ����ϰ� �˴ϴ�.
      jeusadmin�� ������ ���� �����մϴ�.

      > jeusadmin example

   3. ������Ʈ���� jeus�� �Է��մϴ�.
      > jeus

   4. jeusadmin���� �����ؼ� boot �մϴ�.
      > jeusadmin node_name
      node_name> boot

  Tip:
    jeus.properties�� ȯ�� �������� USERNAME, PASSWORD ���� �Է��ϸ� jeus�� �Է�
    �ϴ� ������ One-step boot�� �����մϴ�.


 B. WebManager ����
   WebManger�� ���� ������ �����ϰ� �����մϴ�.
   URL�� ������ �����ϴ�.

   http://<IP-address>:<JEUS_BASEPORT + 8>/webadmin

 C. Example Server�� Boot/Shutdown
   Example Server�� JEUS 5�� VirtualNode ����� ����ؼ� ������ �����ų �� �ִ�
   ȯ���� �����ϴ� JEUS�� ���½��ϴ�.

   ������ ������ ���� �մϴ�.

   1. Windows�� ���
      ���� �޴����� TmaxSoft->JEUS5->Example Server->Boot Example Server��
      �����մϴ�.
      �Ǵ� JEUS_HOME\bin\startexampleserver.cmd�� �����մϴ�.

   2. Unix/Linux
      JEUS_HOME/bin/startexampleserver�� �����մϴ�.

   �̷��� Example Server�� Boot�Ǹ� JEUS_HOME/samples ���丮�� �ִ� ������
   �����ų �� �ֽ��ϴ�.

   ��)
     > cd samples/ejb/basic/statelessSession  ; ���� ���丮�� �̵�
     > jant                                   ; EJB deploy
     > jant run                               ; Ŭ���̾�Ʈ ���α׷� ����
     > jant undeploy                          ; EJB undeploy
     > jant clean                             ; ������ ���� ����

   Example Server�� Shutdown�Ϸ��� ������ ���� �մϴ�.

   1. Windows�� ���
      ���� �޴����� TmaxSoft->JEUS5->Example Server->Down Example Server��
      �����մϴ�.
      �Ǵ� JEUS_HOME\bin\stopexampleserver.cmd�� �����մϴ�.

   2. Unix/Linux
      JEUS_HOME/bin/stopexampleserver�� �����մϴ�.



VII. ���� ���׷��̵�

  ���� ���̱׷��̼��� JEUS 4.X������ �����մϴ�.
  ���̱׷��̼��� xmlconverter �ܼ� ���� �̿��ؼ� �����մϴ�.

  �켱 xmlconverter�� ����ϱ� ���ؼ��� JEUS4_HOME�̶�� ȯ�� ������ �����ؾ߸�
  �մϴ�. �׷��� ������ ������ ���� �޽����� ��µ˴ϴ�.

  You must set jeus4.home as the home directory for
  JEUS version 4 that you want to convert from.


  ������ ���� ȯ�� ������ ������ �ݴϴ�.

  (Windows)
  > SET JEUS4_HOME=<JEUS 4.X�� JEUS HOME>

  (Unix/Linux�� Borne Shell)
  > export JEUS4_HOME=<JEUS 4.X�� JEUS HOME>


  xmlconverter�� ������ JEUS 4.x�� �����մϴ�. ���⿡
  ��� �ɼ��� �߰��Ǿ����ϴ�.

  ear, ejb, servlet, client �ɼ��� ����ϸ�, .ear, .jar, .war�� ���� �ִ�
  ���ø����̼��� DD���ϵ� �����ų �� �ֽ��ϴ�.

  �ڼ��� ���� JEUS�������Ʈ�� �����Ͻʽÿ�.



VIII. ����ó

��ǰ�� ���� ���ǻ����� Ȩ �������� �����Ͻðų�, E-mail�� ������ �ٶ��ϴ�.

  Ȩ������: www.tmax.co.kr
  TechNet : technet.tmaxsoft.com
  E-mail  : info@tmax.co.kr


  Copyright 2005, TmaxSoft Co., Ltd. All Rights Reserved.
