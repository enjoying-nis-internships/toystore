<%@ include file="/WEB-INF/template/includes.jsp" %>
<c:if test="${1 == 1}">

hello user
</c:if>

<c:if test="${1 == 2}"> 
bbbb
</c:if>
<div class="firstclass"><spring:message code="title.test"/></div>
<c:url value="/resources/images/product/130559.jpg" var="ttt"/><img src="${ttt}"/>