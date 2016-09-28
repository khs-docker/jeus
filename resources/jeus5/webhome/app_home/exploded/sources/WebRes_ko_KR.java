
import java.util.*;

// recover Res.java
public class WebRes_ko_KR extends WebRes {
	
  private static final Object[][] contents = new String[][]{
        { "CALC", "�� ������ stateless session bean�� ���� ���Դϴ�.<br>" +
			    "������ ����Ͻ� ������ ��ȭ �� ������, ����� " +
			    "�Ź� �����ϱ� ���� ���� <br>0���� �ʱ�ȭ �մϴ�.<br>" +
			    "���� ����� Ư�� ����(���⼭�� ���� ���)�� ������ �ʿ䰡 �����Ƿ�, stateless session bean���� �����ϱ� �����մϴ�.<br>" +
			    "�� EJB�� +,-,*,/�� �װ��� ������ �����ϰ� �ֽ��ϴ�.<br><br>" },        
    	{ "COUNTER", "�� ������ stateful session bean�� ���� ���Դϴ�.<br>" +
			    "counter�� ����Ͻ� ������ ��ȭ �� ������ counter�� �Ϸ��� ī��Ʈ ��.���������� <br>" +
			    "ī��Ʈ�� �����ϰ� �־�� �մϴ�.<br>" +
			    "���� stateful session bean���� �����ϱ� �����մϴ�.<br>" +
			    "���������� �ΰ��� counter�� counter1, counter2�� ���ǰ� �ִµ�, �Ϸ��� ���� ���� ��������<br>" +
			    "counterEJB�� ������ ī��Ʈ�� ����Ͽ� ��Ȯ�� ī��Ʈ�� �����ְ� �ֽ��ϴ�.<br><br>" },
        { "PRODUCT", "�� ������ bean managed persistence EJB (BMP)�� ���� ���Դϴ�.<br>" +
			    "container managed persistence EJB(CMP)�� �޸� , EJB�� BMP�� ������ ���,<br>" +
			    "�����ڰ� ���� persistence ������ �����ؾ� �մϴ�.<br>" +
			    "�� �������� view source link���� ��ü �ҽ��� Ȯ���Ͻñ� �ٶ��ϴ�." +
			    "<br><br>" },
        { "CMP11", "�� ������ container managed bean 1.1 (CMP 1.1)�� ���� ���Դϴ�.<br>" +
			    "JEUS�� CMP 1.1�� CMP 2.0 �� �� �����մϴ�.<br>" +
			    "�׷���, CMP2.0�� �������� �鿡�� �����Ǿ��� ������,( local interface ���, CMR, EJBQL ���� ���..) " +
			    "CMP 1.1��� CMP2.0���� ������ ���� ��õ�մϴ�.<br>" +
			    "�� ������ CMP1.1�� ���ߵ� BookEJB�� å�� ����(���,����,����)�ϴ� bean�Դϴ�.<br><br>"},
        { "CMP20", "�� ������ container managed bean 2.0 (CMP 2.0)�� ���� ���Դϴ�.<br>" +
			    "JEUS�� CMP 1.1�� CMP 2.0 �� �� �����մϴ�.<br>" +
			    "�׷���, CMP2.0�� �������� �鿡�� �����Ǿ��� ������,( local interface ���, CMR, EJBQL ���� ���..) " +
			    "CMP 1.1��� CMP2.0���� ������ ���� ��õ�մϴ�.<br>" +
			    "�� ������ CMP2.0�� ���ߵ� BookEJB�� å�� ����(���,����,����)�ϴ� bean�Դϴ�.<br><br>"},
        { "OTM", "�� ������ EJB Spec 2.0���� ���� ���Ե� container managed relatinship�� ���� ���Դϴ�.<br>" +
			    "CMR�� RDB���� table�� join�ϴ� �Ͱ� ���� ȿ���� �����ϴ�.<br>" +
			    "�� ������ ���� relationship�� �ϴ�� ����μ� " +
			    "��(shipEJB)�� �ټ��� ��������(cruiseEJB)�� ��������, �ϳ��� ���������� �� �ϳ��� �迡 ���մϴ�.<br>" +
			    "CMR������ ejb-jar.xml�� relationship�� ������ �ָ�, �ϵ� �ڵ�����,<br>" +
			    "cruiseEJB�� ���� shipEJB������, shipEJB�� ���� cruiseEJB ������ ������ �� �ֽ��ϴ�. <br>" +
			    "relationship�� ejb-jar.xml�� relationships element tag���� ����մϴ�.<br><br>" },
        { "EJBQL", "�� ������ JEUS�� EJBQL Ȯ�忡 ���� ���Դϴ�.<br>" +
			    "JEUS�� ������ ���� EJBQL�� Ȯ���ϰ� �ֽ��ϴ�. <br>" +
			    "-- JEUS EJBQL extension Keyword such as ORDER BY, ASC, ORACLEHINT, GROUP BY .. <br>" +
			    "-- JEUS EJBQL extension Subquery <br>" +
			    "-- JEUS EJBQL extension aggregate functions such as MIN, MAX, AVG, SUM, COUNT ..<br>" +
			    "-- JEUS EJBQL extension additional functions such as CONCAT, SUBSTRING, ABS, SQRT .. <br>" +
			    "���� ������ JEUS  Enterprise Java Beans ���̵� �޴��� 11.4�忡�� Ȯ���Ͻ� �� �ֽ��ϴ�.<br>" +
			    "�� �������� BookEJB�� ���� �Լ��� ����ϰ� �ֽ��ϴ�.<br><br>" },
        { "MDB",     "�� ������ J2EE spec 1.4�� ���� �߰��� message driven bean(MDB)�� ���� ���Դϴ�.<br>" +
			    "���� MDB�� ���� ���� �ý��ۿ� ������ �����ϴ� ���Դϴ�.<br>" +
			    "�Ʒ� text box�� �Է��� ������ JMS �޽����� ����ǰ�," +
			    "MDB�� �޽����� �����Ͽ�, �޽��� ������ ������ Ư�� ������ �̸� ������ ��ο� �����մϴ�.<br>" +
			    "�ش� ������ %JEUS_HOME%\\samples\\{hostname}.txt �Դϴ�. <br>" +
				"�޽����� �ۼ��ϰ�, ��� �� �ش� ������ �����Ǿ����� Ȯ���� �ֽʽÿ�. <br><br>" +
				"MDB�� �ۼ��ϱ� ����, JMS Ȩ���丮�� �־�� �ϰ�, ���丮 ���� JMSMain.xml�̶�� ���������� �����ؾ� �մϴ�.<br>" +
				"�Ϲ������� JMS Ȩ���丮�� %JEUS_HOME%\\config\\{hostname}\\{hostname}_jms_{jmsenginename}�Դϴ�. <br>" +
				"ejb-jar.xml, jeus-ejb-dd_{modulename}.xml �׸��� JMSMain.xml ������ �ݵ�� ���� ���ñ� �ٶ��ϴ�.<br>" +
				"{xxx}�� ���� �ý����� xxx ������ �����ϼž� �մϴ�.<br><br>" },		
		{"WARN", "���! ���� �̸� samples�� deploy�Ǿ� ���� �ʴٸ�, EJB������ ����� �������� �ʽ��ϴ�.!"},
		{"MORE_EXAM","�� ���� EJB ������ %JEUS_HOME%\\samples ���丮��, <br>" + 
		             "&nbsp;&nbsp;&nbsp;&nbsp;�� ���� Servlet�� JSP ������ %JEUS_HOME%\\webhome\\servlet_home\\webapps\\examples ���丮�� �����Ͻʽÿ�."},
        { "CHARSET", "EUC-KR" }};

  public Object[][] getContents() {
    return contents;
  }
}

