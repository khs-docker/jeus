<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<%@ include file="../../upper.jsp"%>
<f:view>
	<h:form id="memberForm">
		<h:outputText value="Please fill your information" /><br><br>
		<h:panelGrid columns="2" cellpadding="0" border="0">
			<h:outputText value="* First Name   " />
			<h:inputText id="firstname"  size="10" required="true" value="#{memberBean.firstName}">
				<f:validateLength minimum="0" maximum="10" />
			</h:inputText>
			<b><h:message for="firstname" errorStyle="color:red"/>
			<h:outputText value="* Last Name   "  />
			<h:inputText id="lastname"  size="10" required="true" value="#{memberBean.lastName}">
				<f:validateLength minimum="0" maximum="10" />
			</h:inputText>
			<b><h:message for="lastname" errorStyle="color:red"/>
			<h:outputText value="ID" />
			<h:inputText id="userid" size="10" maxlength="10" value="#{memberBean.userID}">
			</h:inputText>
			<h:outputText value="password " />
			<h:inputSecret id="userpw"  size="8" maxlength="8">
			</h:inputSecret>
			<h:outputText value="Sex" />
			<h:selectOneRadio id="sex" value="#{memberBean.sex}">
				<f:selectItem itemValue="1" itemLabel="male" />
				<f:selectItem itemValue="2" itemLabel="female" />
			</h:selectOneRadio>
			<h:outputText value="E-mail" />
			<h:panelGroup>
				<h:inputText id="email1"  size="10" maxlength="10" value="#{memberBean.email}" />
				<h:outputText value=" @ " />
				<h:selectOneMenu id="email2">
					<f:selectItem itemLabel="naver.com" />
					<f:selectItem itemLabel="hanmail.net" />
					<f:selectItem itemLabel="hotmail.com" />
					<f:selectItem itemLabel="nate.com" />
					<f:selectItem itemLabel="korea.com" />
				</h:selectOneMenu>
			</h:panelGroup>
			<h:outputText value="Zip-Code" />
			<h:inputText id="zipcode" size="6" maxlength="6" value="#{memberBean.zipCode}"/>	
			<h:outputText value="Address" />
			<h:inputText id="address" size="50"  value="#{memberBean.address}" />	
			<h:outputText value="Memo" />
			<h:inputTextarea id="memo" rows="5" value="#{memberBean.memo}"/>
		</h:panelGrid>
		<br><br>
		<h:commandButton value="submit" action="success"/>
		<h:commandButton value="reset" action="#{memberBean.resetAction}" />
	</h:form>
</f:view>

<%@ include file="../../footer.html"%>