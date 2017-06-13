<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ page isELIgnored="false" %>
<title>User Login</title>
</head>
<body>
	<h2>Login</h2>
	<form action="loginvalidation" method="post">
			${errmsg}<br>
			Email<input type="email" name="email" required>
			Password<input type="password" name="password" required>
			<input type="submit" value="Login">
			<button formaction="userregistration">Register</button>
	</form>
</body>
</html>