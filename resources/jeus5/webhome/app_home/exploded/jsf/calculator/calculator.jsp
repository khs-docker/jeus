<%@ include file="../../upper.jsp" %>

<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<f:view>
	<h:form id="form_0">
		<h2><h:outputText value="Simple Calculator Test" /></h2><br>
		<h:panelGrid columns="3" border="0" cellpadding="0" cellspacing="0" id="panel">
			<h:outputText id="fristLabel" value="fristNumber" />
			<h:inputText id="firstInput" value="#{CalcBean.fristNumber}" />
			<h:message for="firstInput" id="firstMessage" errorStyle="color:red" />
			<h:outputText id="secondLabel" value="secondNumber" />
			<h:inputText id="secondInput" value="#{CalcBean.secondNumber}" />
			<h:message for="secondInput" id="secondMessage" errorStyle="color:red"/>
		</h:panelGrid><br><br>		
			<h:commandButton value="add" id="commandAdd" action="#{CalcBean.add}" />
			<h:commandButton value="Multiply" id="commandMultiply"	action="#{CalcBean.multiply}" />
	</h:form>
</f:view>

<%@ include file="../../footer.html" %>