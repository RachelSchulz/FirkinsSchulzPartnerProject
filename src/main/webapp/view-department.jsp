<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix= "c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Departments</title>
</head>
<body>
	<h2>All Departments</h2>
	<table>
		<c:forEach items="${requestScope.allItems}" var="currentdepartment">
			<tr>
				<td>Department: ${currentdepartment.departmentName}|</td>
				<td>Manager: ${currentdepartment.dptManagerName} </td>
			</tr>
		</c:forEach>
	</table>
	<p><a href="index.jsp">Home - Add Employees</a></p>
	<p><a href="add-department.jsp">Add Another Department</a></p>
	<p><a href="edit-department.jsp">Edit A Department</a></p>
</body>
</html>