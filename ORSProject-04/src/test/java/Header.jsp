<%@page import="in.co.rays.proj4.controller.ORSView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Hi, Guest</h3>
	<a href="<%=ORSView.ROLE_CTL%>"><b>Add Role</b></a>
	<b>|</b>
	<a href="<%=ORSView.USER_CTL%>"><b>Add User</b></a>
	<b>|</b>
	<hr>
</body>
</html>