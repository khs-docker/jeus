<%@ include file="../../upper.jsp" %>

<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<html>
<body>

<f:view>
<fieldset>
<legend><b>&lt;h:outputText value="http://www.tmaxsoft.com"/&gt;</b></legend>
<h:outputText value="http://www.tmaxsoft.com"/>
</fieldset>
<br>
<fieldset>
<legend><b><b>&lt;h:outputLink value="http://www.tmaxsoft.com"&gt;...</b></legend>
<h:outputLink value="http://www.tmaxsoft.com">  <h:outputText value="http://www.tmaxsoft.com"/> </h:outputLink>
</fieldset>
<br>
<fieldset>
<legend><b>&lt;h:outputFormat value="http://www.{0}.com"&gt;  &lt;f:param value="tmaxsoft"/&gt;...</b></legend>
<h:outputFormat value="http://www.{0}.com">  <f:param value="tmaxsoft"/> </h:outputFormat> 
</fieldset>

</f:view>

</body>
</html>
<%@ include file="../../footer.html" %>