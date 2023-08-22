<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is Help Page</title>
</head>
<body>
	<h1>My name is Shazam!</h1>
	<%
	String name = (String) request.getAttribute("name");
	Integer rollNumber = (Integer) request.getAttribute("rollNumber");
	LocalDateTime localDateTime = (LocalDateTime) request.getAttribute("time");
	%>
	<h1>
		Hello my name is
		<%=name%>
	</h1>
	<h1>This is help page</h1>
	<h1>
		My roll number is
		<%=rollNumber%>
	</h1>
	<h1>Date and Time</h1>
	<h1>
		<%=localDateTime.toString()%>
	</h1>
	<hr>
	<h1>Hello my name is ${name}</h1>
	<h1>This is help page</h1>
	<h1>My roll number is ${rollNumber}</h1>
	<h1>Date and Time ${time}</h1>
	<h1>Marks list=${marks}</h1>
		
	<h1>Traversing list using JSTL</h1>
	<c:forEach var="item" items="${marks}">
	<h1>${item}</h1>
<%-- 	<h1><c:out value="${item}"></c:out></h1> --%>
	</c:forEach>
	

</body>
</html>