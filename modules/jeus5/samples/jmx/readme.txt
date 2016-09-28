********************************************************************************
*                                   JMX 예제 정보                              *
********************************************************************************

I. 예제 실행 방법
   본 예제들은 기본적으로 Ant를 사용해서 컴파일하고 실행하도록 되어 있습니다.
   그리고, Example Server를 사용해서 동작합니다. Example Server는 JEUS_HOME에
   있는 readme.txt 파일의 VI. JEUS 실행 부분을 참고하십시오.

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
   * ejb : JMX로 JVM MBean에 대해 모니터링하는 기본 예제
 
   * 제공된 예제를 이용해 프로그램을 응용, 확장하는 방법

	현재 JMX Sample 예제에서는 기본적으로 JVM에 해당하는 MBean의 목록에 대한
	정보만을 가져오도록 세팅이 되어 있으며, 각종 다른 정보를 가져오기 위해서
	는 $JEUS_HOME/docs/jmxdoc을 참조하여 MBean JMXTest.java에서 MBean 리스트
	에 추가를 해주면 됩니다.
	그리고, build.xml에서 47라인에 가보면 아래와 같은 태그가 있는데 상황에 
	따른 수정이 필요합니다.
		...
		<arg line="example jeus jeus true all"/>
		...

	위의 태그에서 5개의 Argument에 대해 설명을 하자면,
		1. example : 제우스가 구동하는 호스트나 가상호스트
		2. jeus : Admin 계정
		3. jeus : Admin 계정의 패스워드
		4. true : 가져오고자 하는 MBean의 상위 객체가 노드일 경우 true, 
			  컨테이너일 경우 false로 설정한다.
		 - 예를 들어 JVM정보라면 true, false 둘다 가져올수 있다.
		5. JVM : 가져오고자 하는 객체에 해당하는 MBean 이름 

