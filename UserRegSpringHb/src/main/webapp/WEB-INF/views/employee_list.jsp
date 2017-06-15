
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee List</title>
</head>
<body>
	
	<h2>Employee List</h2>
	<table border="2 solid black">
			<tr>
				<th>Employee Id</th>
				<th>Employee Name</th>
				<th>Address</th>
				<th>Mobile No.</th>
				<th>Salary</th>
				<th>Update/Delete</th>
			</tr>
			 <c:forEach items="${emplist}" var="employee">
   			<tr>
    			<td><c:out value="${employee.eid}"/></td>
    			<td><c:out value="${employee.empname}"/></td>
   				<td><c:out value="${employee.address}"/></td>
  			  	<td><c:out value="${employee.mobile}"/></td>
  			  	<td><c:out value="${employee.salary}"/></td>
  			  	 <td align="center"><a href="update?id=${employee.eid}">Edit</a> /
  			  	  <a href="delete?id=${employee.eid}">Delete</a></td>
   			</tr>
  			</c:forEach>
	</table>
	<br>
	<a href="Employee_Reg">Employee Registration</a><br>
	<a href="Logout">Logout</a>
</body>
</html>