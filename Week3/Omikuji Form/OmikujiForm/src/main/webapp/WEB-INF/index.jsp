<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Noice!libs</title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
	<form action="/processresults" method="post">
		<label>Adjective: </label>
		<input type="text" name="first" placeholder="tall" />
		<label>Adjective: </label>
		<input type="text" name="adj2" placeholder="nice" class="name" required />
		<label>Adjective: </label>
		<input type="text" name ="adj3" placeholder="nice" class="name" required />
		<label>A Name: </label>
		<input type="text" name="name" placeholder="Mr. Smith" class="name" required />
		<label>Noun: </label>
		<input type="text" name="noun" placeholder="cat food" class="name" required />
    	<input type="submit" class="btn" type="submit" value="Send" />
	</form>
</body>
</html>