<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ page isErrorPage="true" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dojo</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<h1>New Dojo</h1>
<form:form action="/dojo/new" method="post" modelAttribute="newDojo" class="form-group">
	<form:label path="name">Dojo Name:</form:label>
    <form:input path="name" class="form-control"/>
    <form:errors class ="text-danger" path="name"/>
    <button>Create Dojo</button>
</form:form>
<table class="table table-striped">
	<thead>
	<tr>
	  <th scope="col">Name</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items = "${allDojos}" var = "dojos">
	<tr>
		 <td><a href="/dojo/view/${dojos.id}"><c:out value="${dojos.name}"></c:out></a></td>
	</tr>
    </c:forEach>
</table>
<a href="/ninja/new">Add Ninja</a>
</body>
</html>