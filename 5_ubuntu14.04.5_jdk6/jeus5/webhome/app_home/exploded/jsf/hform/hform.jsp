<%@ include file="../../upper.jsp" %>

<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<html>
<body>

<f:view>
    <h:form>
        <h:inputText value="aaaaaaaaa"/>
    </h:form>

<h:outputLink value="http://www.tmaxsoft.com">
    <h:outputText value="www.tmaxsoft.com"/>
</h:outputLink>
<br><br><br>
<h:outputLabel for="userId">
    <h:outputText id="userId" value="TMAXSOFT"/>
</h:outputLabel>
<br><br><br>

<h:inputTextarea value="TMAXSOFT"/>
<br><br><br>

<h:commandButton value="TMAXSOFT-PUSH"  action="/examples/"/>
<br><br><br>





</f:view>

</body>
</html>
<%@ include file="../../footer.html" %>