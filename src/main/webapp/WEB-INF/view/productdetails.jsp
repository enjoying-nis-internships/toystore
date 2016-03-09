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
				<button id="btnCart" type="button" class="btn btn-success">Add to cart</button>
			</div>
		</div>
	</div>
	<div class="clearfix"></div>
</body>
</html>