<%@ page language="java" contentType="text/html"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Sample Application</title>
</head>
<body>
	<div class="detailsContainer">
		<div id="itemPic">
			<img id="itemImg" src="<c:url value='${productDetails.pictureUrl}' />" />
		</div>
		<div id="descriptionBox">
			<div id="itemDesc">${productDetails.description}</div>
			<div id="priceContainer">
				<spring:message code="productlist.price" />${productDetails.price}
				<button id="btnCart" type="button" onclick="addToCart(${productDetails.id})" class="btn-success">Add to cart</button>
			</div>
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