<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>La Home Pagina</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>The Home Page</h1>
		<a href="/product/new">New Product</a> <a href="category/new">New
			Category</a>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Products</th>
					<th>Categories</th>
				</tr>
					<tr>
						<td>
						<ul>
						<c:forEach items="${products}" var="product">
						<li><a href="/product/details/${product.id}">${product.name}</a></li>
						</c:forEach>
						</ul>
						</td>
						<td>
						<ul>
						<c:forEach items="${categories}" var="category">
						<li><a href="/categories/details/${category.id}">${category.name}</a></li>
						</c:forEach>
						</ul>
						</td>
					</tr>
			</thead>
		</table>
	</div>
</body>
</html>