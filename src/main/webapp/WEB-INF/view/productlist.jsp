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
		
			<div class="productContainer" >
				<a href="<c:url value='/product/${product.id}' />">
					<div class="productName">
						${product.name}
					</div>
				</a>
				<div class="productImage">
					<c:if test="${not empty product.pictureUrl}">
						<img src="<c:url value='${product.pictureUrl}' />" />
					</c:if>
				</div>
				<div class="productPrice">
					<spring:message code="productlist.price"/>${product.price}
					<button id="btnCart" type="submit" class="btn btn-success" onclick="addToCart(${product.id});">Add to cart</button>
			 	</div>
			</div>
			
		</c:forEach>
		</div>
	</div>
	<div class="clearfix"></div>
	<script>
		function addToCart(pId) {
			var data = {}
			data["productId"] = pId;
			data["quantity"] = 1;
			
			$.ajax({
				type : "POST",
				url : "<c:url value='/cart/add' />",
				data : data,
				timeout : 100000,
				success : function(data) {
					console.log("SUCCESS: ", data);
					alert("Successfully added to cart!");
				},
				error : function(e) {
					console.log("ERROR: ", e);
				}
			});
		}
	</script>
  </body>
</html>