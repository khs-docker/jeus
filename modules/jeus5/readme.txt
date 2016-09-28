********************************************************************************
*                        Tmax Soft JEUS 5 릴리즈 정보                          *
*                                                                              *
*                             2005년 5월 20일                                  *
********************************************************************************

                                목     차

                     I.......: 들어가며
                     II......: 설치
                     III.....: 지원 환경
                     IV......: 새 기능과 변경 사항
                     V.......: QuickStart 실행하기
                     VI......: JEUS 실행
                     VII.....: 버전 업그레이드
                     VIII....: 연락처




I. 들어가며

 TmaxSoft JEUS 5에 오신 것을 환영합니다.

 이 파일은 J2EE 1.4 인증을 받은, TmaxSoft사의 고성능 JEUS 5 어플리케이션 서버의
 릴리즈 정보 파일입니다. JEUS 5는 기존 버전에서 검증된 성능 및 안정성, 가용성에
 J2EE 1.4의 기능 및 편리한 기능 추가로 이전 버전보다 편리하게 사용할 수 있게
 되었습니다.

 이 파일은 JEUS 5의 기본 정보를 담고 있으므로, 반드시 정독해 주시기 바랍니다.



II. 설치

JEUS 5의 설치 파일은 다음 사이트에서 구할 수 있습니다.

   http://technet.tmax.co.kr

라이선스 파일 역시 동일한 사이트에서 구할 수 있습니다.

JEUS 5에서는 하나의 인스톨러에서 여러 플랫폼과 비트를 지원합니다.
인스톨러는 크게 Windows용과 Unix용으로 되어 있습니다.

   jeus5-XXX.[bin|exe]

확장자가 .bin이면 Unix용, .exe이면 Windows용 인스톨러입니다.

JEUS의 인스톨 방법은 두 가지가 있습니다.

 A. GUI 방식 설치(Unix/Windows)
    다음처럼 실행하면 GUI 형태로 설치됩니다.

    > jeus5-XXX.bin 또는 jeus5-XXX.bin

 B. Console 방식 설치(Unix/Linux 용)
    다음처럼 실행하면 Console 형태로 설치됩니다.

    > jeus5-XXX.bin -i console


JEUS의 라이선스 파일은 기존 JEUS 4.x 버전의 라이선스 파일을 사용하거나,
TmaxSoft Technical Network(http://technet.tmax.co.kr)에서 데모 라이선스를
신청해서 사용하시면 됩니다.



III. 지원 환경

JEUS 5에서는 다음과 같은 환경을 지원합니다.

   OS     Solaris, HP-UX, AIX, Windows 2000/XP/2003, Linux(Redhat 7 이상)
   CPU    Intel x86 및 호환, Sun Sparc, PA-RISC, IBM PowerPC
   RAM    최소 256MB의 여유 메모리
   DISK   최소 500MB의 여유 공간
   Java   1.4, 5.0 지원



IV. 새 기능 및 변경 사항

 A. 지원 Specification

   JEUS 5는 J2EE 1.4를 완벽 지원하고 있습니다. 대표적인 Specification은 다음과
   같습니다. 보다 자세한 사항은 JEUS릴리즈노트를 참고하시기 바랍니다.

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

   이외에 WebService를 위한 다음과 같은 Specification도 지원합니다.
   - WS-Security 1.0
   - WS-Basic Profile 1.0
   - Universal Description, Discovery and Integration 2.0/3.0

 B. 성능 향상

   - NonBlocking I/O 사용
     NonBlocking I/O(이하 NBIO)를 사용함으로써 I/O 작업에 필요한 쓰래드의 개수를
     획기적으로 줄였습니다. 이로써 대용량의 Request를 훨씬 원활하게 처리할 수
     있게 되었습니다.

   - appcompiler의 성능 향상
     기존의 ejbcompiler가 EJB 뿐만 아니라 Web Service도 지원하게되면서, 이름이
     변경되었습니다. 또한 새로운 Source Generating&Compiling 기술을 도입함으로써
     이전 버전 보다 월등한 성능을 냅니다.

   - JMS의 I/O 처리 성능 향상
     NBIO channel과 Channel recovery를 사용해서 I/O처리가 훨씬 원활해졌습니다.

   - JMS의 메시지 처리 성능 향상
     Message의 압축과 패킷 구조의 최적화, DUP_OK_ACK의 구현을 통해서 메시지 처리
     능력이 향상되었습니다.

   - JMS 메시지 신뢰성 향상
     Store&Forward를 통해서 JMS 메시지의 신뢰성이 향상되었습니다.

   - Message-driven Beans의 성능 향상
     Pipelined Serial Executor과 Thread Pool의 최적화로 Message-driven Beans의
     성능이 향상되었습니다.


 C. 관리 기능 향상

   - 새로운 WebManager 제공
     완전히 새롭게 디자인된 WebManager를 제공함으로써 훨씬 사용과 관리가 편리해
     졌습니다.

   - Java Management Specification 지원
     Java Management Specification의 지원으로 JEUS의 모든 관리 및 모니터링을
     사용자가 직접 프로그래밍 할 수 있습니다.

   - 새로운 Logging 시스템 도입
     로그를 화면, 파일, 소켓, SNMP등 여러 형태로 출력할 수 있으며, 필요에 따라서
     다양하게 로그 핸들러를 구성할 수 있습니다.

   - Virtual Host 개념 도입
     노드명과 JEUS BasePort를 조합한 Virtual Host 개념을 도입했습니다. 이로써
     하나의 머신에서 JEUS 클러스터링을 생성할 수 있게 되었으며, 노드 관리의
     편리성을 높였습니다.

   - 향상된 보안 기능
     보안 서비스를 위한 SPI(Service Provider Interface), API(Application
     Provider Interface)를 제공함으로써 커스텀 보안 서비스를 개발할 수 있습니다.
     그리고 Security Domain의 도입으로 보다 다양한 보안 서비스를 제공합니다.

   - 단일화된 WS(Web Server)엔진 관리
     JEUSWebServer를 위해서 별도의 설정 파일(*.m)을 만들 필요없이 JEUS에서 설정
     하는 것만으로 JEUSWebServer의 설정 파일을 생성 및 컴파일이 가능합니다.
     그리고, 이 설정을 WebManager에서 할 수 있기 때문에 JEUSWebServer의 환경
     설정 파일에 대해서 모르는 사람도 쉽게 설정할 수 있습니다.


D. 사용성 향상
   - 새롭게 통합된 Deploy 방식
     EJB, Servlet, EAR 등의 Application을 Packaging하고 Deploy하는 방식이
     단일화되었습니다.
     또한 모든 Application에 대해 공통으로 Directory에 클래스를 풀어놓은
     형태(Exploded)나 JAR 파일 형식으로 Deploy할 수 있으므로, 편리하게 개발할
     수 있습니다.

   - Deploy를 위한 디렉토리 간소화
     기존의 ejb_home, servlet_home이 app_home으로 통합되었습니다.
     그래서 EJB, Servlet, J2EE Application을 모두 app_home에서 Deploy할 수
     있습니다.

   - Class Loading 방식 변경
     기존의 JAR 모드에서 제공하던 EJB의 SHARED Class Loading 방식 이외에
     J2EE의 Packaging Specification을 준수하는 ISOLATED Class Loading 방식을
     지원합니다. ISOLATED 방식은 더욱 직관적인 방식이고,  SHARED에서 발생할 수
     있는 Class Dependency로 생기는 문제와 EJB deploy/undeploy시에 생기는
     Servlet Reloading을 피할 수 있습니다.

   - JEUSBuilder GUI 툴 제공
     JEUSBuilder를 통해서, .jar, .war, .ear 형태의 어플리케이션을 쉽게 패키징할
     수 있습니다.

   - appcompiler를 이용한 모듈 컴파일링
     appcompiler를 사용해서 .jar, .ear과 같이 패키징된 형태에서도 컴파일이 가능
     해졌습니다.

   - 여러 개의 Windows Service 등록
     하나의 JEUS를 사용해서 여러 개의 Windows Service를 등록하고, 쉽게 삭제할 수
     있습니다. 자세한 것은 svcinstall.exe와 svcremove.exe를 참조하시기 바랍니다.

   - WebService의 기능 강화
     J2EE 1.4의 WebService 외에 OASIS의 다양한 Specification을 지원합니다.
     이와 더불어 성능도 많이 향상되었습니다.


E. 가용성(High Availability&Failover)
   - 클러스터링의 Failover 정확성 향상
     노드 클러스터링의 감시 체계를 Mesh방식으로 전환하여, 노드간의 Failover 정확
     성이 높아졌습니다.

   - 분산식 세션 서버
     완전 분산식 구조와 Non-Blocking I/O 기술을 도입한 새로운 세션 클러스터링
     방식을 제공하여 가용성 및 성능을 향상시켰습니다.

   - JMS Destination Clustering
     여러 JMS Server의 Destination을 클러스터링으로 묶어 사용할 수 있습니다.
     이 기능으로 Message의 전송과 오류 처리 능력을 높였습니다.

   - Persistent Timer Service
     EJB 2.1부터 지원하는 Timer 서비스의 Persistent 기능을 제공합니다.
     그러므로, 갑작스런 JEUS의 장애가 발생하더라도, JEUS가 정상적인 동작을
     회복하면 기존의 Timer 서비스도 복구되어 정상 동작함을 보장합니다.


 기능 추가 및 변경 사항에 대한 보다 자세한 내용은
 매뉴얼을 참고하시기 바랍니다.

 매뉴얼은 JEUS_HOME/docs/manual에 있습니다.



V. QuickStart 실행하기

JEUS 5에서는 JEUS 5를 간단하게 사용할 수 있도록 QuickStart를 제공합니다.
Windows 플랫폼에서는 JEUS의 설치가 끝남과 동시에 QuickStart GUI 프로그램이
실행됩니다.

QuickStart GUI 프로그램 이외에서 QuickStart를 실행하려면 다음과 같이 실행합니다.

 > starthsqldb          : HSQL 구동
 > jeus-quickstart      : QuickStart 예제에 맞춰 JEUS 구동


주의: QuickStart 예제가 구동되는 데는 Adventure Builder가 deploy되므로
일정 시간이 소요됩니다.

WebManager를 사용하려면 웹 브라우저를 이용해서 다음과 같이 URL을 넣습니다.

  http://localhost:23008/webadmin

Adventure Builder의 동작 화면은 다음 URL로 확인할 수 있습니다.

  http://localhost:8088/consumerwebsite/

QuickStart의 Example 동작 화면은 다음 URL로 확인할 수 있습니다.

  http://localhost:8088/samples/ko/index.htm



VI. JEUS 실행

JEUS 5의 스크립트는 이전 버전과 사용법은 동일합니다. 그러나 다양한 환경을 지원
하기 위해서 jeus.properties(Windows 환경에서는 jeus.properties.cmd)파일의 기능이
보강되었습니다.

 A. JEUS의 기동
   1. JEUS를 실행하려면 jeus.properties 파일의 다음 항목이 제대로 설정되었나
      확인합니다.

      JEUS_HOME, JEUS_BASEPORT, JAVA_HOME

   2. Virtual Node를 사용할 것인지 정합니다.
      JEUS_HOME/config/vhost.xml에서 <enable> 태그의 값을 지정합니다.
      <enable> 태그의 값이 true이면 현재 노드명과 JEUS_BASEPORT의 값을 조합해서
      VirtualNode를 생성합니다.

      예) 다음과 같이 설정되어 있을 경우
      <host>
        <name>tmaxsoft:2100</name>
        <virtual-name>example</virtual-name>
      </host>

      tmaxsoft라는 노드의 머신에서 JEUS_BASEPORT 2100으로 부팅하면 VirtualNode가
      example로 됩니다. 이후에는 example을 노드명으로 사용하게 됩니다.
      jeusadmin도 다음과 같이 실행합니다.

      > jeusadmin example

   3. 프롬프트에서 jeus를 입력합니다.
      > jeus

   4. jeusadmin으로 접속해서 boot 합니다.
      > jeusadmin node_name
      node_name> boot

  Tip:
    jeus.properties의 환경 변수에서 USERNAME, PASSWORD 값을 입력하면 jeus를 입력
    하는 것으로 One-step boot을 진행합니다.


 B. WebManager 접속
   WebManger는 이전 버전과 동일하게 접속합니다.
   URL은 다음과 같습니다.

   http://<IP-address>:<JEUS_BASEPORT + 8>/webadmin

 C. Example Server의 Boot/Shutdown
   Example Server는 JEUS 5의 VirtualNode 기능을 사용해서 샘플을 실행시킬 수 있는
   환경을 제공하는 JEUS를 일컫습니다.

   구동은 다음과 같이 합니다.

   1. Windows의 경우
      시작 메뉴에서 TmaxSoft->JEUS5->Example Server->Boot Example Server를
      실행합니다.
      또는 JEUS_HOME\bin\startexampleserver.cmd를 실행합니다.

   2. Unix/Linux
      JEUS_HOME/bin/startexampleserver를 실행합니다.

   이렇게 Example Server가 Boot되면 JEUS_HOME/samples 디렉토리에 있는 예제를
   실행시킬 수 있습니다.

   예)
     > cd samples/ejb/basic/statelessSession  ; 샘플 디렉토리로 이동
     > jant                                   ; EJB deploy
     > jant run                               ; 클라이언트 프로그램 실행
     > jant undeploy                          ; EJB undeploy
     > jant clean                             ; 생성된 파일 삭제

   Example Server를 Shutdown하려면 다음과 같이 합니다.

   1. Windows의 경우
      시작 메뉴에서 TmaxSoft->JEUS5->Example Server->Down Example Server를
      실행합니다.
      또는 JEUS_HOME\bin\stopexampleserver.cmd를 실행합니다.

   2. Unix/Linux
      JEUS_HOME/bin/stopexampleserver를 실행합니다.



VII. 버전 업그레이드

  버전 마이그레이션은 JEUS 4.X에서만 가능합니다.
  마이그레이션은 xmlconverter 콘솔 툴을 이용해서 진행합니다.

  우선 xmlconverter를 사용하기 위해서는 JEUS4_HOME이라는 환경 변수를 세팅해야만
  합니다. 그렇지 않으면 다음과 같은 메시지가 출력됩니다.

  You must set jeus4.home as the home directory for
  JEUS version 4 that you want to convert from.


  다음과 같이 환경 변수를 정의해 줍니다.

  (Windows)
  > SET JEUS4_HOME=<JEUS 4.X의 JEUS HOME>

  (Unix/Linux의 Borne Shell)
  > export JEUS4_HOME=<JEUS 4.X의 JEUS HOME>


  xmlconverter의 사용법은 JEUS 4.x와 동일합니다. 여기에
  몇가지 옵션이 추가되었습니다.

  ear, ejb, servlet, client 옵션을 사용하면, .ear, .jar, .war로 묶여 있는
  어플리케이션의 DD파일도 변경시킬 수 있습니다.

  자세한 것은 JEUS릴리즈노트를 참고하십시오.



VIII. 연락처

제품에 대한 문의사항은 홈 페이지에 문의하시거나, E-mail로 연락을 바랍니다.

  홈페이지: www.tmax.co.kr
  TechNet : technet.tmaxsoft.com
  E-mail  : info@tmax.co.kr


  Copyright 2005, TmaxSoft Co., Ltd. All Rights Reserved.
