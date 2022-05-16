<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nueva Categoria</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h1>New Category</h1>
<a href="/">Home</a>
<form:form method="POST" action="/category/create" modelAttribute="newCategory">
		<div class = "form-group">
		<form:label path="name">Name:</form:label>
    	<form:input path="name" class="form-control"/>
    	<form:errors class ="text-danger" path="name"/>
		</div>
		<br/>
		<button class ="btn-primary">Add This Category</button>
	</form:form>
</div>
</body>
</html>