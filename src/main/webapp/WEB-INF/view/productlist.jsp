<%@ page language="java" contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
  <head>
    <title>Sample Application</title>
  </head>
  <body>
	<h1>Hello, ${name}!</h1>
	<h1>Product List</h1>
 
	<c:forEach items="${productList}" var="product">
		${product.name} ${product.description}: ${product.price}
		<br />
	</c:forEach>
  </body>
</html>