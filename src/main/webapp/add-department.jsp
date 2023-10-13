<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add A Department</title>
</head>
<body>
<h2>Add A Department</h2>
	<form action="addDepartmentServlet" method="post">
		Department Name: <input type="text" name="name" size="25">
		Manager Name: <input type="text" name="managerName" size="25">
		<input type="submit" value="Submit" />
	</form>
	
	<p><a href="index.jsp">Home - Add Employees</a></p>
	<p><a href="viewAllDepartmentsServlet">View All Departments</a></p>
	<p><a href="viewAllEmployeesServlet">View All Employees</a></p>

</body>
</html>