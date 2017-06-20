<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Registration</title>
</head>
<body>
	<form action="Employee_Registration" method="post">
		<table border="2 solid black">
				<h2>Employee Registration</h2>
				<tr>
					<th>Employee Name</th>
					<td><input type="text" name="empname" required></td>
				</tr>
				<tr>
					<th>Employee Address</th>
					<td><input type="text" name="address" required></td>
				</tr>
				<tr>
					<th>Employee mobile</th>
					<td><input type="number" name="mobile" required></td>
				</tr>
				<tr>
					<th>Employee Salary</th>
					<td><input type="number" name="salary" required></td>
				</tr>
				<tr>
					<td><td> <input type="submit" value="Submit">
					 <input type="reset" value="Reset"></td></td>
				</tr>
		</table>
	</form>
	<br>
	<a href="Employee_List">Employee List</a><br>
	<a href="Logout">Logout</a>
	
</body>
</html>