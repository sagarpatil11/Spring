<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Registration</title>
</head>
<body>
	<form action="register" method="post">
		<h2>Registration form</h2><br>
		Name<input type="text" name="name" required><br>
		Email<input type="email" name="email" required><br>
		Password<input type="password" name="password" required><br>
		<input type="submit" value="register"><br>
		<button formaction="login">Login</button>
	</form>
</body>
</html>