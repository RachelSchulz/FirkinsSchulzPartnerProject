<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Departments</title>
</head>
<body>
	All Departments:
	<table>
		<c:forEach items="$requestScope.allItems" var="currentdepartment">
			<tr>
				<td>${currentdepartment.departmentName} |</td>
				<td>${currentdepartment.dptManagerName} </td>
			</tr>
		</c:forEach>
	</table>
	<p><a href="index.jsp">Home</a></p>
	<p><a href="add-department.jsp">Add Another Department</a></p>
	<p><a href="edit-department.jsp">Edit A Department</a></p>
</body>
</html>