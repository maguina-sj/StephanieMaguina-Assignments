<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h1>Welcome <c:out value="${loggedinUser.name}"/></h1>
<a href="/book/new">+Add to my shelf!</a>
<a href="/logout">Logout</a>
<p>Books from everyone's shelves:</p>
<table class="table table-striped">
<thead>
<tr>
<th>ID</th>
<th>Title</th>
<th>Author Name</th>
<th>Posted By</th>
</tr>
</thead>
<c:forEach items="${books}" var="book">
	<tr>
		<td><a href="/book/details/${book.id}">${book.title}</a></td>
		<td>${book.author}</td>
		<td>${book.user.name}</td>
	</tr>	
	</c:forEach>
</table>
</div>

</body>
</html>