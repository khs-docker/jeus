********************************************************************************
*                        Tmax Soft JEUS 5 예제 정보                            *
********************************************************************************

I. 예제 실행 방법
   본 예제들은 기본적으로 Ant를 사용해서 컴파일하고 실행하도록 되어 있습니다.
   그리고, Example Server를 사용해서 동작합니다. Example Server는 JEUS_HOME에
   있는 readme.txt 파일의 VI. JEUS 실행 부분을 참고하십시오.

   각 예제별로 차이는 있지만, 일반적으로 다음과 같이 예제를 실행시킵니다.

   * Build 및 Deploy
    > jant

   * 클라이언트 실행
    > jant run

   * Undeploy
     > jant undeploy

   * 생성된 디렉토리 및 파일 삭제
     > jant clean

   참고: jant는 JEUS_HOME/bin 디렉토리에 있으며, JEUS_HOME/lib/etc/ant에 있는
   Ant를 실행시켜 줍니다.

   이외에 별도의 Compile 및 Deploy 과정이 필요한 경우에는 각 모듈 디렉토리에
   있는 readme.txt 파일을 참고하십시오.


II. 디렉토리 구성

  예제 디렉토리는 JEUS_HOME/samples 디렉토리를 말하며, 구성은 다음과 같습니다.

  JEUS_HOME/samples
   |
   +- CAS               : Client Access Services 예제
   |
   +- clientContainer   : J2EE Client Container 예제
   |
   +- ejb               : Enterprise JavaBeans 예제
   |
   +- J2COM             : Java To COM 예제
   |
   +- jms               : JMS 예제
   |
   +- Scheduler         : JEUS Scheduler 예제
   |
   +- snmp              : SNMP 예제
   |
   +- transaction       : Transaction 예제
   |
   +- WebService        : Java WebService 예제
   |
   +- quickstart        : Quick Start configuration(Adventure Builder 포함)
   |
   +- manual_examples   : 매뉴얼에서 소개한 예제
   |
   +- common.xml        : 예제를 컴파일하기 위한 Ant의 공통 build 파일
   |
   +- readme.txt        : 본 파일
   |
   +- sample.properties : Ant의 build.xml 파일에서 사용하기 위한 기본 설정 파일

