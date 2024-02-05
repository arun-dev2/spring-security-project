<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
</head>
<body>

	<h1 align="center">Create your profile</h1>
	<hr>
	<div align="center">
		<form:form action="process-signup" method="Post"
			modelAttribute="signUpDto">
	Username : <form:input path="username" />
			<br>
	Password : <form:password path="password" />
			<br>
	Role : <form:input path="role" />
			<br>
			<input type="submit" value="sign up">

		</form:form>

	</div>


</body>
</html>