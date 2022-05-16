<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mira el Producto</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>
			<c:out value="${viewProduct.name}"></c:out>
		</h1>
		<a href="/">Home</a>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Categories</th>
				</tr>
				<tr>
					<td>
						<ul>
							<c:forEach items="${assignedCategories}" var="category">
								<li>${category.name}</li>
							</c:forEach>
						</ul>
					</td>
				</tr>
			</thead>
		</table>
		<hr>
<form action="/product/details/${id}" method="post">
	<h4>Add Category:</h4>				
	<select name="categoryId" id="categoryId" class="input">
	    <c:forEach var="category" items="${unassignedCategories}">
	    	<option value="${category.id}">${category.name}</option>
	    </c:forEach>
	</select>
	<input class="input" class="button" type="submit" value="Add"/>
</form>
	</div>
</body>
</html>