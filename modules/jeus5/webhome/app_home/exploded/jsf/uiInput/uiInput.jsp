<%@ include file="../../upper.jsp" %>

<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ page contentType="text/html; charset=euc-kr"%>

<html>
<body>

<f:view>
<fieldset>
<legend><b>&lt;h:inputText id="product" value="JEUS" /&gt;</b></legend>
<h:inputText id="product" value="JEUS" />
</fieldset>
<br>
<fieldset>
<legend><b>&lt;h:inputSecret  value="credential" /&gt;</b></legend>
<h:inputSecret  value="credential" />
</fieldset>
<br>
<fieldset>
<legend><b>&lt;h:inputTextarea id="textArea"   rows="4" cols="7"   value="Java Enterprise User Solution. JEUS"/&gt;</b></legend>
<h:inputTextarea id="textArea"   rows="4" cols="50"   value="Java Enterprise User Solution. JEUS"/>
</fieldset>
<br>

</f:view>

</body>
</html>
<%@ include file="../../footer.html" %>