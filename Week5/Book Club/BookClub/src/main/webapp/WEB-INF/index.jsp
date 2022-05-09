<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Club Registration</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class = "container">
<h1>Book Club</h1>
<p>A place for friends to share thoughts on books</p>
	<div class="row">
	<div class= "col">
		<h1>Register User</h1>
		<form:form method="POST" action="/registration" modelAttribute="newUser">
		<div class = "form-group">
		<form:label path="name">Name:</form:label>
    	<form:input path="name" class="form-control"/>
    	<form:errors class ="text-danger" path="name"/>
		</div>
		<div class = "form-group">
		<form:label path="email">Email:</form:label>
    	<form:input path="email" class="form-control"/>
    	<form:errors class ="text-danger" path="email"/>
		</div>
		<div class = "form-group">
		<form:label path="password">Password:</form:label>
    	<form:password path="password" class="form-control"/>
    	<form:errors class ="text-danger" path="password"/>
		</div>
		<div class = "form-group">
		<form:label path="confirm">Confirm Password:</form:label>
    	<form:password path="confirm" class="form-control"/>
    	<form:errors class ="text-danger" path="confirm"/>
		</div>
		<br/>
		<button class ="btn-primary">Register</button>
		</form:form>
	</div>
 	<div class="col">
 	<h1>Login</h1>
 	<form:form action="/login" modelAttribute="newLogin">
 	<div class="form-row">
 		<form:errors class ="text-danger" path="email"/>
 		<form:label path="email">Email:</form:label>
    	<form:input path="email" class="form-control"/>	
 	</div>
 	<div class="form-row">
 		<form:errors class ="text-danger" path="password"/>
 		<form:label path="password">Password:</form:label>
    	<form:password path="password" class="form-control"/>	
 	</div>
 	<br/>
		<button class ="btn-primary">Login</button>
 	</form:form>
	</div>
	</div>


</div>

</body>
</html>