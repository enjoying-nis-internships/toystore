<!DOCTYPE HTML>
<%@ include file="/WEB-INF/template/includes.jsp" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<html>
	<head>
		<title><tiles:insertAttribute name="title" ignore="true"/></title>
		<meta name="description" content="<tiles:insertAttribute name="page_description" ignore="true"/>">
		<link href="<c:url value="/resources/css/template.css"/>" rel="stylesheet" type="text/css"/>
		<c:url var="cssURL" value="/resources/css/main.css"/>
		<link href="${cssURL}" rel="stylesheet" type="text/css"/>
		<link href="<c:url value="/resources/css/header.css"/>" rel="stylesheet" type="text/css"/>
		<link href="<c:url value="/resources/css/home.css"/>" rel="stylesheet" type="text/css"/>
		<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css"/>
		<link href="<c:url value="/resources/css/productList.css"/>"rel="stylesheet" type="text/css"/>
		<meta charset="utf-8">
		
	</head>
    <body>
    	<div id="banner">
			<tiles:insertAttribute name="header" />
		</div>
		<div></div>
		<tiles:insertAttribute name="navigation_bar" />
		<div></div>
		<div id="page">
			<tiles:insertAttribute name="content" />
		</div>
		<div></div>
		<div id="footer_wrapper">
			<tiles:insertAttribute name="footer" />
		</div>
		
		<script src="<c:url value="/resources/js/jquery/jquery-1.11.3.js"/>"></script>
    	<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
    	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    	<script src="<c:url value="/resources/js/ie10-viewport-bug-workaround.js"/>"></script>
    	<script src="<c:url value="/resources/js/holder.min.js"/>"></script>
	</body>
</html>