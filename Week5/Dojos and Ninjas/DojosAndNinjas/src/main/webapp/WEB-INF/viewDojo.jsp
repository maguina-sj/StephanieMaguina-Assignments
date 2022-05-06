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
<h1>View ${dojo.name} Dojo</h1>
<table class="table table-striped">
<thead>
	<tr>
	  <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Age</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items = "${oneDojo.ninjas}" var = "ninja">
    <tr>
      <td><c:out value="${ninja.firstName}"></c:out></td>
      <td><c:out value="${ninja.lastName}"></c:out></td>
      <td><c:out value="${ninja.age}"></c:out></td>
    </tr>
    </c:forEach>
    
    </tbody>
    
</table>
<a href="/ninja/new">Add Ninja</a>
</body>
</html>