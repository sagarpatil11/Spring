<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Employee</title>
</head>
<body>
	 <c:forEach items="${list}" var="employee">
		<form action="Update_Employee" method="post">
			<table border="2 solid black">
				<h2>Employee Registration</h2>
				<tr>
					<th>Employee ID</th>
					<td><input type="text" name="eid" value="${employee.eid}" readonly="readonly" required></td>
				</tr>
				<tr>
					<th>Employee Name</th>
					<td><input type="text" name="empname" value="${employee.empname}" required></td>
				</tr>
				<tr>
					<th>Employee Address</th>
					<td><input type="text" name="address" value="${employee.address}" required></td>
				</tr>
				<tr>
					<th>Employee mobile</th>
					<td><input type="number" name="mobile" value="${employee.mobile}" required></td>
				</tr>
				<tr>
					<th>Employee Salary</th>
					<td><input type="number" name="salary" value="${employee.salary}" required></td>
				</tr>
				<tr>
					<td><td> <input type="submit" value="Submit">
					 <button formaction="Employee_List">Cancel</button>
				</tr>
			</table>
	</form>
	</c:forEach>
</body>
</html>