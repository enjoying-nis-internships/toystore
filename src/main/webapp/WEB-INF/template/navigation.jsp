<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
	<!--  <ul>
		<li>link 1</li>
		<li>link 2</li>
		<li>link 3</li>
		<li>link 4</li>
	</ul>-->
	
	 <nav>
          <ul class="nav nav-pills nav-justified">
            <li id="first_category"><a href="<c:url value='/product/list/4' />"><spring:message code="navigation.link.actionFigures&Playsets"/></a></li>
            <li id="second_category" ><a href="<c:url value='/product/list/1' />"><spring:message code="navigation.link.baby"/></a></li>
            <li id="third_category" ><a href="<c:url value='/product/list/6' />"><spring:message code="navigation.link.construction&Cars"/></a></li>
            <li id="fourth_category" ><a href="<c:url value='/product/list/9' />"><spring:message code="navigation.link.FashionDolls"/></a></li>
            <li id="fifth_category" ><a href="<c:url value='/product/list/10' />"><spring:message code="navigation.lnk.GamesPuzzelsBooks"/></a></li>
          
          </ul>
     </nav>
</div>