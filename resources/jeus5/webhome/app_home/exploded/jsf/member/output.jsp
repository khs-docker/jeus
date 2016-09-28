<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<%@ include file="../../upper.jsp"%>

<f:view>
    <h:form>
	 <h:graphicImage url="/images/hello.jpg" /><br>
	 <b><h:outputText id="hello" value="Hello~~~! " />
	 <font color="blue"><l><h:outputText id="last" value="#{memberBean.firstName} " />
	 <h:outputText id="first" value=" #{memberBean.lastName}" /></l></font></b><br><br>
	 <h:commandButton value="restart" action="restart"/>
	</h:form>
</f:view>

<%@ include file="../../footer.html"%>