<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign in</title>
</head>
<body>
	<c:if test="${param.error != null}">
		<i style="color: red">Invalid credentials..</i>
	</c:if>
	<form:form align="center">
		<h1>Sign in Page</h1>
		<br>
		UserName : <input type="text" name="username">
		<br>
		Password : <input type="password" name="password">
		<br>
		<input type="submit" value="Login">
	</form:form>
</body>
</html>