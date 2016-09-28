<%@ include file="../../upper.jsp" %>

<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<f:view>
	<h:form id="form_0">
		<h2><h:outputText value="Result" /></h2><br>	
		<h:outputText id="firstLabel" value="FristNumber : " />
		<h:outputText id="firstInput" value="#{CalcBean.fristNumber}" />
		<br>
		<h:outputText id="secondLabel" value="SecondNumber : " />
		<h:outputText id="secondInput" value="#{CalcBean.secondNumber}" />
		<br><br><h:outputText id="resultLabel" value="Result : " />
		<h:outputLabel for="resultInput" value="#{CalcBean.result}" />
		<br><br><h:commandButton value="back" action="back" />
	</h:form>
</f:view>

<%@ include file="../../footer.html" %>