<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Home</title>
</head>
<body>
<h1>Employee Database</h1>
<h2>Add an Employee</h2>
<form action ="addEmployeeServlet"method="post"> 
Name <input type ="text"name ="name"> 

Department <input type ="text"name ="department">

Hours <input type ="text"name ="hours">

Pay per hour <input type ="text"name ="payperhour">

<input type ="submit"value="Add Name">
</form>
<br />
<p><a href ="viewAllEmployeesServlet">View the complete list of employees</a></p>
<p><a href ="add-department.jsp">Add Department</a></p>
</body>
</html>