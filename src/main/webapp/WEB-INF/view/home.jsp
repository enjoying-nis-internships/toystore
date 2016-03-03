<%@ page language="java" contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
  <body>
	<div class="row featurette">
        <div class="col-md-4">
          <h2 class="featurette-heading"><spring:message code="home.label.first_picture"/></br><span class="text-muted"><spring:message code="home.label.first_picture_next_row"/></span></h2>
          <p class="lead"><spring:message code="home.label.first_image_third_row"/></p>
        </div>
        <div class="col-md-8">
          <img class="featurette-image img-responsive center-block" src="<c:url value="/resources/images/homepage/homepage_picture1.jpg"/>" alt="<spring:message code="home.alt.banner_first_image"/>">
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-4 col-md-push-8">
          <h2 class="featurette-heading"><spring:message code="home.label.second_picture"/></br><span class="text-muted"><spring:message code="home.label.second_picture_next_row"/></span></h2>
          <p class="lead"><spring:message code="home.label.second_image_third_row"/></p>
        </div>
        <div class="col-md-8 col-md-pull-4">
          <img class="featurette-image img-responsive center-block" src="<c:url value="/resources/images/homepage/homepage_picture2.jpg"/>" alt="<spring:message code="home.alt.banner_second_image"/>">
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-4">
          <h2 class="featurette-heading"><spring:message code="home.label.third_picture"/></br><span class="text-muted"><spring:message code="home.label.third_picture_next_row"/></span></h2>
          <p class="lead"><spring:message code="home.label.third_image_third_row"/></p>
        </div>
        <div class="col-md-8">
          <img class="featurette-image img-responsive center-block" src="<c:url value="/resources/images/homepage/homepage_picture3.jpg"/>" alt="<spring:message code="home.alt.banner_third_image"/>">
        </div>
      </div>
      
  </body>
</html>