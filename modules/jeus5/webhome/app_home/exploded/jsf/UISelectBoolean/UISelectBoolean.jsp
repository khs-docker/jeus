<%@ include file="../../upper.jsp" %>

<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
<body>

<f:view>

<fieldset>
<legend><b>&lt;h:selectOneListbox id="products" value="#{productBean.currentProduct}"&gt;...</b></legend>
<h:selectOneListbox id="pickCar" value="#{productBean.currentProduct}">
	<f:selectItems value="#{productBean.productList}" />
</h:selectOneListbox> 
</fieldset>


<fieldset>
<legend><b>&lt;h:selectOneMenu id="selectProduct" value="#{productBean.currentProduct}"&gt;...</b></legend>
<h:selectOneMenu id="selectProduct" value="#{productBean.currentProduct}"><f:selectItems value="#{productBean.productList}" />
</h:selectOneMenu>
</fieldset>



<fieldset>
<legend><b>UIPanel</b></legend>
<h:panelGrid columns="4" footerClass="subtitle" headerClass="subtitlebig" styleClass="medium"  columnClasses="subtitle,medium">
  <f:facet name="header">
    <h:outputText value="Table with numbers"/>
  </f:facet>
  <h:outputText value="1" />
  <h:outputText value="2" />
  <h:outputText value="3" />
  <h:outputText value="4" />
  <h:outputText value="5" />
  <h:outputText value="6" />
  <h:outputText value="7" />
  <h:outputText value="8" />
  <f:facet name="footer">
    <h:panelGroup>
      <h:outputText value="one row"  />
      <h:outputText value=" "  />
      <h:outputText value="grouped with panelGroup" />
    </h:panelGroup>
  </f:facet>
</h:panelGrid> 
</fieldset>


<fieldset>
<legend><b>UIColumn and UIData</b></legend>
<h:dataTable id="books" columnClasses="list-column-center, list-column-right, list-column-center, list-column-right" headerClass="list-header" rowClasses="list-row" styleClass="list-background" value="#{BookStore.items}" var="store">   
  <h:column>
    <f:facet name="header">
      <h:outputText  value="#{msg.storeNameLabel}"/>
    </f:facet>
     <h:outputText value="#{store.name}"/>
  </h:column>
  <h:column>
    <f:facet name="header">
     <Subject>
    </f:facet>
     <h:outputText value="#{store.subject}"/>
  </h:column>
  <h:column>
    <f:facet name="header">
      <h:outputText  value="#{msg.storePriceLabel}"/>
    </f:facet>
     <h:outputText value="#{store.price}"/>
  </h:column>
</h:dataTable>
</fieldset>



</f:view>


</body>
</html>
<%@ include file="../../footer.html" %>