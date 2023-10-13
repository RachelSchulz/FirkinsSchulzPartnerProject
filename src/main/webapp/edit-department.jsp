<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit A Department</title>
</head>
<body>
<h2>Edit Department</h2>
	<form action="editDepartmentServlet" method="post">
		Current Department Name: <input type="text" name="oldName" size="25"/>
		New Dept Name: <input type="text" name="newName" size="25"/>
		Dept Manager Name: <input type="text" name="managerName" size="25"/>
		<input type="submit" value="Update" />
	</form>
	<p><a href="index.jsp">Home - Add Employees</a></p>
	<p><a href="viewAllDepartmentsServlet">View All Departments</a></p>
	<p><a href="viewAllEmployeesServlet">View All Employees</a></p>
</body>
</html>