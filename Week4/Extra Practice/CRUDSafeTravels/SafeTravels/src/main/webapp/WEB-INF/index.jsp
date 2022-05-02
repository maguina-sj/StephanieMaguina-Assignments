<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Travels</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<h1>Save Travels</h1>
<table class="table table-striped">
<thead>
	<tr>
	  <th scope="col">Expense</th>
      <th scope="col">Vendor</th>
      <th scope="col">Amount</th>
      <th scope="col">Action</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items = "${allTravels}" var = "travels">
    <tr>
      <td><a href="/view/${travels.id}"><c:out value="${travels.expense}"></c:out></a></td>
      <td><c:out value="${travels.vendor}"></c:out></td>
      <td><c:out value="${travels.amount}"></c:out></td>
      <td><a href="/edit/${travels.id}">Edit</a>
      <form:form action="/delete/${travels.id}" method="delete">
      <button>Delete</button>
      </form:form>
      </td>
    </tr>
    </c:forEach>
    
    </tbody>
</table>
<h2>Add an Expense</h2>
<form:form action="/create" method="post" modelAttribute="newCost" class="form-group">
<form:label path="expense">Expense Name:</form:label>
    <form:input path="expense" class="form-control"/>
    <form:errors class ="text-danger" path="expense"/>
    
    <form:label path="vendor">Vendor:</form:label>
    <form:input path="vendor" class="form-control"/>
    <form:errors class ="text-danger" path="vendor"/>
    
    <form:label path="amount">Amount:</form:label>
    <form:input path="amount" class="form-control"/>
    <form:errors class ="text-danger" path="amount"/>
    
    <form:label	path="description">Description:</form:label>
    <form:input path="description" class="form-control"/>
    <form:errors class ="text-danger" path="description"/>

	<button>Create Expense</button>
</form:form>
</body>
</html>