
import java.util.*;

// recover Res.java
public class WebRes extends java.util.ListResourceBundle {
  private static final Object[][] contents = new String[][]{
        { "CALC", "This is an example of stateless session bean.<br>" +
			    "this is a sort of modeling for a calculator.<br>" +
			    "a calculator must be initialized with 0.0 before every operation.<br>" +
			    "so the calculator is proper for stateless session bean because of no needs for keeping the calculated result.<br>" +
			    "this EJB has four business methods. those are add, subtract, multifly, and divide.<br><br>" },        
    	{ "COUNTER", "This is an example of stateful session bean.<br>" +
			    "this is a sort of modeling for a counter.<br>" +
			    "a counter must keep the count value before every operation.<br>" +
			    "if it doesn't, you can't expect the right value during sequential operations.<br>" +
			    "so the counter is proper for stateful session bean because it must keep the count value.<br>" +
			    "you can see two counters, counter1 and counter2.<br>" +
			    "during sequential increasing and decreasing operations, <br>" +
			    "CounterEJB gets the count value considering the former value.<br><br>" },
        { "PRODUCT", "This is an example of bean managed persistence EJB (BMP).<br>" +
			    "contrast to container managed persistence EJB(CMP), in case of developing an EJB as BMP,<br>" +
			    "you have to write the persistence logic by yourself.<br>" +
			    "you can see the full source by clicking the view source link of this page.<br>" +
			    "<br>" },
        { "CMP11", "Hhis is an example of container managed bean 1.1 (CMP 1.1).<br>" +
			    "JEUS supports both CMP 1.1 and CMP 2.0.<br>" +
			    "but CMP 2.0 has improved in many ways ( local interface, CMR, EJBQL etc..).<br>" +
			    "we recommend CMP 2.0 instead of CMP 1.1.<br>" +
			    "this sample is to manage books using the BookEJB complied with CMP 1.1.<br><br>"},
        { "CMP20", "This is an example of container managed bean 2.0 (CMP 2.0).<br>" +
			    "JEUS supports both CMP 1.1 and CMP 2.0.<br>" +
			    "but CMP 2.0 has improved in many ways ( local interface, CMR, EJBQL etc..).<br>" +
			    "we recommends CMP 2.0 instead of CMP 1.1.<br>" +
			    "this sample is to manage books using the BookEJB complied with CMP 2.0.<br><br>" },
        { "OTM", "This is an example of container managed relatinship which is newly entered in EJB Spec 2.0.<br>" +
			    "it is similar to joining tables in the RDB.<br>" +
			    "the relationship used this example is simply described as follows.<br>" +
			    "a ship has many cruises but a cruise is only included in a ship.<br>" +
			    "that is a typical one to many relationship.<br>" +
			    "you can select the cruises information from a ShipEJB. also can select the ship information from a CruiseEJB <br>" +
			    "without any hard coding only but stating the relationship in ejb-jar.xml.<br>" +
			    "the relationship must be clearly described within an relationship element tag in ejb-jar.xml.<br><br>" },
        { "EJBQL", "This is an example of JEUS EJBQL extension.<br>" +
			    "JEUS added various extensions as followings. <br>" +
			    "-- JEUS EJBQL extension Keyword such as ORDER BY, ASC, ORACLEHINT, GROUP BY .. <br>" +
			    "-- JEUS EJBQL extension Subquery <br>" +
			    "-- JEUS EJBQL extension aggregate functions such as MIN, MAX, AVG, SUM, COUNT ..<br>" +
			    "-- JEUS EJBQL extension additional functions such as CONCAT, SUBSTRING, ABS, SQRT .. <br>" +
			    "you can see the detailed information in 11.4 chapter of JEUS Enterprise Java Beans Guide manual.<br>" +
			    "in this sample, BookEJB uses aggregate functions.<br><br>" },
        { "MDB",     "This is an example of message driven bean which is one of new features in the J2EE Spec 1.4.<br>" +
			    "this sample is to make a file in your local file system.<br>" +
			    "the words you entered below the text box are wrapped into a JMS Message.<br>" +
			    "and your message driven bean captures the message and makes the file including your message.<br>" +
			    "the file path is %JEUS_HOME%\\samples\\{hostname}.txt <br>" +
				"Write the message and see whether the file is created in the right path ! <br><br>" +
				"Make sure that JMS Home directry already exists and in that directory, JMSMain.xml exists.<br>" +
				"generally JMS Home directory is located in %JEUS_HOME%\\config\\{hostname}\\{hostname}_jms_{enginename}. <br>" +
				"please refer to ejb-jar.xml, jeus-ejb-dd_{modulename}.xml and JMSMain.xml.<br>" +
				"{xxx} is replaced with your real xxx name.<br><br>" },
		{"WARN", "Warining!! if you didn't deploy samples, EJB samples are not showed up right!"},
		{"MORE_EXAM","More EJB samples in %JEUS_HOME%\\samples directory. <br>" +
		             "&nbsp;&nbsp;&nbsp;&nbsp;More Servlet and JSP samples in %JEUS_HOME%\\webhome\\servlet_home\\webapps\\examples"},
        { "CHARSET", "UTF-8" }};

  public Object[][] getContents() {
    return contents;
  }
}
