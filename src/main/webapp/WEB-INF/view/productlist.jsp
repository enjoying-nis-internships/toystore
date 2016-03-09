<%@ page language="java" contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
  <head>
    <title>Sample Application</title>
  </head>
  <body>
	<h1>Product List</h1>
 
 	<div id="productListingContainer">
	 	<div id="productListing">
		<c:forEach items="${productList}" var="product">
		<a href="<c:url value="/product/${product.id}"/>">
			<div class="productContainer" >
				<div class="productName">
					${product.name}
				</div>
				<div class="productImage">
					<c:if test="${not empty product.pictureUrl}">
						<img src="<c:url value='${product.pictureUrl}' />" />
					</c:if>
				</div>
				<div class="productPrice">
					<spring:message code="productlist.price"/>${product.price}
					<button id="btnCart" type="button" class="btn btn-success">Add to cart</button> 
			 	</div>
			</div>
			</a>
		</c:forEach>
		</div>
	</div>
	<div class="clearfix"></div>
  </body>
</html>