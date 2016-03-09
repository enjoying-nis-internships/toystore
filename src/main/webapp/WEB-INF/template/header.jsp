<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
<!--<spring:message code="title.test"/> *my account-->

<div class="container">

      <!-- Static navbar -->
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only"><spring:message code="header.label.toggle_navigation"/></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
          </div>
          <a class="nav navbar-nav" href="<c:url value="/home"/>">
          		<img id="logo" src="<c:url value="/resources/images/logo.jpg"/>" alt="Logo">
          </a>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
              <li class="active"><a href="<c:url value="/account/user"/>"><spring:message code="header.label.myAccount"/> <span class="sr-only">(current)</span></a></li>
              <li><a href="<c:url value="/cart"/>"><spring:message code="header.label.cart"/></a></li>
              <li><a href="<c:url value="/login"/>"><spring:message code="header.label.login"/></a></li>
              <li><a href="<c:url value="/logout"/>"><spring:message code="header.label.logout"/></a></li>
              <li><a href="<c:url value="/registration"/>"><spring:message code="header.label.registration"/></a></li>
              <li><p id="welcome_user"><spring:message code="header.label.welcome"/> ${name}</p></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
        <li data-target="#myCarousel" data-slide-to="3"></li>
      </ol>
      <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img class="slide_image first-slide" src="<c:url value="/resources/images/banners/banners_image1.jpg"/>" alt="<spring:message code="header.alt.banner_first_image"/>">
        </div>
        <div class="item">
          <img class="slide_image second-slide" src="<c:url value="/resources/images/banners/banners_image2.jpg"/>" alt="<spring:message code="header.alt.banner_second_image"/>">
        </div>
        <div class="item">
          <img class="slide_image third-slide" src="<c:url value="/resources/images/banners/banners_image3.jpg"/>" alt="<spring:message code="header.alt.banner_third_image"/>">
        </div>
        <div class="item">
          <img class="slide_image fourth-slide" src="<c:url value="/resources/images/banners/banners_image4.jpg"/>" alt="<spring:message code="header.alt.banner_fourth_image"/>">
        </div>
      </div>
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      </a>
    </div><!-- /.carousel -->
      </nav>
      
      
    </div> <!-- /container -->


</div>