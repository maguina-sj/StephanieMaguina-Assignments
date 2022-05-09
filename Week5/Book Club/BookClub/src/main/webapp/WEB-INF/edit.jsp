<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Book</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	<h1>Edit Book</h1>
	<form:form method="put" action="/book/update/${editBook.id}" modelAttribute="editBook">
		<div class = "form-group">
		<form:label path="title">Title:</form:label>
    	<form:input path="title" class="form-control"/>
    	<form:errors class ="text-danger" path="title"/>
		</div>
		<div class = "form-group">
		<form:label path="author">Author:</form:label>
    	<form:input path="author" class="form-control"/>
    	<form:errors class ="text-danger" path="author"/>
		</div>
		<div class = "form-group">
		<form:label path="thoughts">My Thoughts:</form:label>
    	<form:input path="thoughts" class="form-control"/>
    	<form:errors class ="text-danger" path="thoughts"/>
		</div>
		<!-- hidden input of user_id -->
    	<form:input type="hidden" value="${loggedInUser.id}" path="user" />
		<br/>
		<button class ="btn-primary">Edit This Book</button>
	</form:form>
	</div>
</body>
</html>