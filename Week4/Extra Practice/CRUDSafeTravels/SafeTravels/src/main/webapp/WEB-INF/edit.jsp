<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Expense</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<h1>Edit Expense</h1>
<form:form action="/update/${editExpense.id}" method="put" modelAttribute="editExpense" class="form-group">
<form:label path="expense">Expense Name:</form:label>
    <form:input path="expense" class="form-control" />
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

	<button>Update Expense</button>
</form:form>
<a href="/">Go Back</a>
</body>
</html>