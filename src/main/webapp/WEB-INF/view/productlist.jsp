<%@ page language="java" contentType="text/html"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<title>Sample Application</title>
</head>
<body>
	<h2>Product List</h2>
	<div class="container">
		<div class="row">
			<c:forEach items="${productList}" var="product">
				<div class="col-sm-6 col-md-4 col-lg-4">
				<div id="product_name">
					<a href="<c:url value='#' />">${product.name}</a>
					</div>
					 <br />
					  <img class="" src="<c:url value='${product.pictureUrl}' />" /> 
						<br />
					<h3>
						\$${product.price}
						<button type="button" class="btn btn-success">
							<spring:message code="productlist.label.addToCart"></spring:message>
						</button>
					</h3>
				</div>
			</c:forEach>
		</div>
	</div>
	<div class="clearfix"></div>
</body>
</html>