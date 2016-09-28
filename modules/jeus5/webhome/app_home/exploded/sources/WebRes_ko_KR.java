
import java.util.*;

// recover Res.java
public class WebRes_ko_KR extends WebRes {
	
  private static final Object[][] contents = new String[][]{
        { "CALC", "이 예제는 stateless session bean에 관한 것입니다.<br>" +
			    "계산기의 비즈니스 로직을 모델화 한 것으로, 계산기는 " +
			    "매번 연산하기 전에 값을 <br>0으로 초기화 합니다.<br>" +
			    "따라서 계산기는 특정 상태(여기서는 계산된 결과)를 저장할 필요가 없으므로, stateless session bean으로 구현하기 적당합니다.<br>" +
			    "이 EJB는 +,-,*,/의 네가지 연산을 정의하고 있습니다.<br><br>" },        
    	{ "COUNTER", "이 예제는 stateful session bean에 관한 것입니다.<br>" +
			    "counter의 비즈니스 로직을 모델화 한 것으로 counter는 일련의 카운트 증.감과정에서 <br>" +
			    "카운트를 유지하고 있어야 합니다.<br>" +
			    "따라서 stateful session bean으로 구현하기 적당합니다.<br>" +
			    "예제에서는 두개의 counter인 counter1, counter2가 사용되고 있는데, 일련의 증감 연산 과정에서<br>" +
			    "counterEJB는 직전의 카운트를 고려하여 정확한 카운트를 보여주고 있습니다.<br><br>" },
        { "PRODUCT", "이 예제는 bean managed persistence EJB (BMP)에 관한 것입니다.<br>" +
			    "container managed persistence EJB(CMP)와 달리 , EJB를 BMP로 개발할 경우,<br>" +
			    "개발자가 직접 persistence 로직을 구현해야 합니다.<br>" +
			    "이 페이지의 view source link에서 전체 소스를 확인하시기 바랍니다." +
			    "<br><br>" },
        { "CMP11", "이 예제는 container managed bean 1.1 (CMP 1.1)에 관한 것입니다.<br>" +
			    "JEUS는 CMP 1.1과 CMP 2.0 둘 다 지원합니다.<br>" +
			    "그러나, CMP2.0이 여러가지 면에서 개선되었기 때문에,( local interface 사용, CMR, EJBQL 도입 등등..) " +
			    "CMP 1.1대신 CMP2.0으로 개발할 것을 추천합니다.<br>" +
			    "이 예제는 CMP1.1로 개발된 BookEJB로 책을 관리(등록,수정,삭제)하는 bean입니다.<br><br>"},
        { "CMP20", "이 예제는 container managed bean 2.0 (CMP 2.0)에 관한 것입니다.<br>" +
			    "JEUS는 CMP 1.1과 CMP 2.0 둘 다 지원합니다.<br>" +
			    "그러나, CMP2.0이 여러가지 면에서 개선되었기 때문에,( local interface 사용, CMR, EJBQL 도입 등등..) " +
			    "CMP 1.1대신 CMP2.0으로 개발할 것을 추천합니다.<br>" +
			    "이 예제는 CMP2.0로 개발된 BookEJB로 책을 관리(등록,수정,삭제)하는 bean입니다.<br><br>"},
        { "OTM", "이 예제는 EJB Spec 2.0에서 새로 도입된 container managed relatinship에 관한 것입니다.<br>" +
			    "CMR은 RDB에서 table을 join하는 것과 같은 효과를 가집니다.<br>" +
			    "이 예제에 사용된 relationship은 일대다 관계로서 " +
			    "배(shipEJB)는 다수의 유람일정(cruiseEJB)을 가지지만, 하나의 유람일정은 단 하나의 배에 속합니다.<br>" +
			    "CMR에서는 ejb-jar.xml에 relationship을 정의해 주면, 하드 코딩없이,<br>" +
			    "cruiseEJB을 통해 shipEJB정보를, shipEJB를 통해 cruiseEJB 정보를 가져올 수 있습니다. <br>" +
			    "relationship은 ejb-jar.xml에 relationships element tag내에 기술합니다.<br><br>" },
        { "EJBQL", "이 예제는 JEUS의 EJBQL 확장에 대한 것입니다.<br>" +
			    "JEUS는 다음과 같이 EJBQL을 확장하고 있습니다. <br>" +
			    "-- JEUS EJBQL extension Keyword such as ORDER BY, ASC, ORACLEHINT, GROUP BY .. <br>" +
			    "-- JEUS EJBQL extension Subquery <br>" +
			    "-- JEUS EJBQL extension aggregate functions such as MIN, MAX, AVG, SUM, COUNT ..<br>" +
			    "-- JEUS EJBQL extension additional functions such as CONCAT, SUBSTRING, ABS, SQRT .. <br>" +
			    "상세한 내용은 JEUS  Enterprise Java Beans 가이드 메뉴얼 11.4장에서 확인하실 수 있습니다.<br>" +
			    "이 예제에서 BookEJB는 집합 함수를 사용하고 있습니다.<br><br>" },
        { "MDB",     "이 예제는 J2EE spec 1.4에 새로 추가된 message driven bean(MDB)에 관한 것입니다.<br>" +
			    "사용된 MDB는 로컬 파일 시스템에 파일을 생성하는 것입니다.<br>" +
			    "아래 text box에 입력한 내용은 JMS 메시지로 포장되고," +
			    "MDB는 메시지를 포착하여, 메시지 내용을 쓰여진 특정 파일을 미리 정해진 경로에 생성합니다.<br>" +
			    "해당 파일은 %JEUS_HOME%\\samples\\{hostname}.txt 입니다. <br>" +
				"메시지를 작성하고, 잠시 후 해당 파일이 생성되었는지 확인해 주십시오. <br><br>" +
				"MDB를 작성하기 전에, JMS 홈디렉토리가 있어야 하고, 디렉토리 내에 JMSMain.xml이라는 설정파일이 존재해야 합니다.<br>" +
				"일반적으로 JMS 홈디렉토리는 %JEUS_HOME%\\config\\{hostname}\\{hostname}_jms_{jmsenginename}입니다. <br>" +
				"ejb-jar.xml, jeus-ejb-dd_{modulename}.xml 그리고 JMSMain.xml 내용을 반드시 살펴 보시기 바랍니다.<br>" +
				"{xxx}는 실제 시스템의 xxx 값으로 변경하셔야 합니다.<br><br>" },		
		{"WARN", "경고! 만약 미리 samples가 deploy되어 있지 않다면, EJB예제는 제대로 보여지지 않습니다.!"},
		{"MORE_EXAM","더 많은 EJB 예제는 %JEUS_HOME%\\samples 디렉토리를, <br>" + 
		             "&nbsp;&nbsp;&nbsp;&nbsp;더 많은 Servlet과 JSP 예제는 %JEUS_HOME%\\webhome\\servlet_home\\webapps\\examples 디렉토리를 참고하십시요."},
        { "CHARSET", "EUC-KR" }};

  public Object[][] getContents() {
    return contents;
  }
}

