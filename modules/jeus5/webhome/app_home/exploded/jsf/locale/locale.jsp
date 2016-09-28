<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<%@ include file="../../upper.jsp"%>
<f:loadBundle basename="jsf.locale.bundle.Resource" var="bundle"/>
<f:view>
	<h:form id="memberForm">
		<h2><h:outputText value="#{bundle.title}" /></h2>
		<h:outputText value="#{bundle.keyword}" /><br><hr><br><br>
		<h:outputText value="#{bundle.message}" /><br><br>

		<h:commandButton id="English" action="changelocale" value="English" actionListener="#{changeLocale.chooseLocale}" />
		<h:commandButton id="France" action="changelocale" value="France" actionListener="#{changeLocale.chooseLocale}" />
		<h:commandButton id="Korea" action="changelocale" value="Korean" actionListener="#{changeLocale.chooseLocale}" />
		<h:commandButton id="Japan" action="changelocale" value="Japanese" actionListener="#{changeLocale.chooseLocale}" />
		<h:commandButton id="China" action="changelocale" value="China" actionListener="#{changeLocale.chooseLocale}" />
		<h:commandButton id="German" action="changelocale" value="German" actionListener="#{changeLocale.chooseLocale}" />
	</h:form>
</f:view>

<%@ include file="../../footer.html"%>