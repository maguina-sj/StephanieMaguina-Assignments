<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nuevo Producto</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h1>New Product</h1>
<a href="/">Home</a>
<form:form method="POST" action="/product/create" modelAttribute="newProduct">
		<div class = "form-group">
		<form:label path="name">Name:</form:label>
    	<form:input path="name" class="form-control"/>
    	<form:errors class ="text-danger" path="name"/>
		</div>
		<div class = "form-group">
		<form:label path="description">Description:</form:label>
    	<form:input path="description" class="form-control"/>
    	<form:errors class ="text-danger" path="description"/>
		</div>
		<div class = "form-group">
		<form:label path="price">Price:</form:label>
    	<form:input type="number" step="0.01" path="price" class="form-control"/>
    	<form:errors class ="text-danger" path="price"/>
		</div>
		<br/>
		<button class ="btn-primary">Add This Product</button>
	</form:form>
</div>
</body>
</html>