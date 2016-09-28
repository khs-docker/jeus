<%@ include file="../../upper.jsp" %>

<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<html>
<body>

<f:view>

<fieldset>
<legend><b>&lt;h:commandButton value="PUSH" action="nextPage"/&gt;</b></legend>
<h:commandButton value="PUSH" action="nextPage"/>
</fieldset>
<br>

<fieldset>
<legend><b>&lt;h:graphicImage id="image"   alt="jsf-sun"   url="/images/home.gif"/&gt;</b></legend>
<h:graphicImage id="image"   alt="jsf-sun"   url="/images/home.gif"/>
</fieldset>
<br>

</f:view>


</body>
</html>
<%@ include file="../../footer.html" %>