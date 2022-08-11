<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current visit count</title>
</head>
<body>
<p>You have visited <a href="/"><c:out value="${page}"></c:out></a> <c:out value="${count}"></c:out></p>
<p><a href="/">Test another visit?</a></p>
<p><a href="/double-counter">Add 2 visits</a></p>
<p><a href="/reset counter">Reset counter</a></p>
</body>
</html>