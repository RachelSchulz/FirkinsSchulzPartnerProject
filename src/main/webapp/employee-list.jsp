<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix= "c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>
<h2>All Employees</h2>
<form method = "post" action="navigationServlet">
<table>
<c:forEach items= "${requestScope.allEmployees}" var= "currentitem">
<tr>
<td><input type="radio"name="id"value="${currentitem.id}"></td>
<td>Employee: ${currentitem.name}|</td>
<td>Department: ${currentitem.department.departmentName}|</td>
<td>Hours: ${currentitem.hours2}|</td>
<td>Pay Rate: ${currentitem.payperhour2}</td>
</tr>
</c:forEach>
</table>
<input type ="submit"value ="edit"name="doThisToEmployee">
<input type ="submit"value ="delete"name="doThisToEmployee">
	<p><a href="index.jsp">Home - Add Employees</a></p>
	<p><a href="add-department.jsp">Add Another Department</a></p>
	<p><a href="edit-department.jsp">Edit A Department</a></p>
</form>
</body>
</html>