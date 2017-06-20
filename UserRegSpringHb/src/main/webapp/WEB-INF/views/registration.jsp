<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Registration</title>
</head>
<body>
	<form:form action="register" method="post" commandName="user">
		<h2>Registration form</h2><br>
		<table>
		<tr>
			<th>Name</th>
			<td><form:input path="name"/></td>
			<td><form:errors path="name"></form:errors></td>
		</tr>
		<tr>
			<th>Email</th>
			<td><form:input path="email"/></td>
			<td><form:errors path="email"></form:errors></td>
		</tr>
		<tr>	
			<th>Password</th>
			<td><form:input type="password" path="password"/></td>
			<td><form:errors path="password"></form:errors></td>
		</tr>
		<tr>	
			<td></td>
			<td><input type="submit" value="SignUp"><br></td>
		</tr>	
		</table>
		<br>
		<a href="login">Login</a>
	</form:form>
</body>
</html>