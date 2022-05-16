<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mira la Categoria</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h1><c:out value="${category.name}"></c:out></h1>
<a href="/">Home</a>
<hr>

<h3>Products:</h3>
<ul>
	<c:forEach var="product" items="${assignedProducts}">
		<li><c:out value="${product.name}"></c:out></li>
	</c:forEach>
</ul>
<hr>
<form action="/categories/details/${id}" method="post">
	<h4>Add Product:</h4>				
	<select name="productId" id="productId" class="input">
	    <c:forEach var="product" items="${unassignedProducts}">
	    	<option value="${product.id}">${product.name}</option>
	    </c:forEach>
	</select>
	<input class="input" class="button" type="submit" value="Add"/>
</form>
</div>
</body>
</html>