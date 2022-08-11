<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold Game</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
<div class="container">
	<div class="row align-items-center, justify-content-around">
    	<div class="col-3">
      	Farm<br>
      	<p>(earn 10-20 gold)</p>
      	<form action="/gold" method="post"><input class="button" type="submit" name="farm" value="Find Gold!"/></form>
    	</div>
    	<div class="col-3">
      	Cave<br>
      	<p>(earn 10-20 gold)</p>
      	<form action="/gold" method="post"><input class="button" type="submit" name="cave" value="Find Gold!"/></form>
    	</div>
    	<div class="col-3">
     	House<br>
      	<p>(earn 0-10 gold)</p>
      	<form action="/gold" method="post"><input class="button" type="submit" name="House" value="Find Gold!"/></form>
    	</div>
    	<div class="col-3">
     	Quest<br>
      	<p>(earn/takes 0-50 gold)</p>
      	<form action="/gold" method="post"><input class="button" type="submit" name="quest" value="Find Gold!"/></form>
    	</div>
  	</div>
  </div>
  <div class="container2">
  	<h3>Activities:</h3>
  	<c:forEach var="activity" items=${activities}>
  	<p><c:out value="${activity}"></c:out></p>
  	</c:forEach>
  </div>
</body>
</html>