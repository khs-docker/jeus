********************************************************************************
*                                  SNMP 예제 정보                              *
********************************************************************************

I. 예제 실행 방법
   본 예제들은 기본적으로 Ant를 사용해서 컴파일하고 실행하도록 되어 있습니다.
   그리고, Example Server를 사용해서 동작합니다. Example Server는 JEUS_HOME에
   있는 readme.txt 파일의 VI. JEUS 실행 부분을 참고하십시오.

   * 알아두어야 할 사항
   JEUS5Fix7부터는 dynamic 방식으로 엔진이 바뀌면서 클라이언트 예제를 바꿔야 합니다.
   허나, 이전의 방식을 사용할 필요성이 있기 때문에 이전 방식을 지원합니다.
   jeus 스크립트에 아래의 설정을 추가하면 됩니다.
   -Djeus.management.snmp.dynamic=false

   * Build
    > jant

   * 클라이언트 실행
    > jant run

   * 생성된 디렉토리 및 파일 삭제
     > jant clean

   참고: jant는 JEUS_HOME/bin 디렉토리에 있으며, JEUS_HOME/lib/etc/ant에 있는
   Ant를 실행시켜 줍니다.

   이외에 별도의 Compile 및 Deploy 과정이 필요한 경우에는 각 모듈 디렉토리에
   있는 readme.txt 파일을 참고하십시오.


II. 예제 설명
   * ejb : SNMP로 OID를 이용해 JVM MBean에 대해 모니터링하는 기본 예제
 
   * 제공된 예제를 이용해 프로그램을 응용, 확장하는 방법

	SNMP Sample 예제에서는 기본적으로 JVM에 해당하는 MBean의 목록에 대한
	정보를 가져오도록 OID가 세팅이 되어 있으며, 각종 다른 정보를 가져오기
	위해서는 $JEUS_HOME/lib/system/TMAX-JEUS5.0-MIB.mib 파일을 참조해서 
	TestClient.java에서 OID 리스트에 추가, 수정을 해주면 됩니다.
	그리고, build.xml에서 46라인에 아래와 같은 태그가 있는데 상황에 따른 
	수정이 필요합니다.
		...
		<arg line="9999 127.0.0.1 all"/>
		...

	위의 태그에서 3개의 Argument에 대해 설명을 하자면,
		1. 9999 : JEUSMain.xml에 설정된 SNMP설정
		2. 127.0.0.1 : 서버 IP
		3. all : OID가 들어가며, OID를 입력하면 해당 OID에서만 정보를
			 가져오며, all을 입력하면 SnmpClient.java에 정의한 
			 모든 OID의 리스트에서 정보를 가져온다.

