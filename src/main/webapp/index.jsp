<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Animal</title>
</head>
<body>
<form action ="addEmployeesServlet"method="post"> 
Name <input type ="text"name ="name"> 

Department <input type ="text"name ="department">

Hours <input type ="text"name ="hours">

Pay per hour <input type ="text"name ="payperhour">

<input type ="submit"value="Add Name">
</form>
<br />
<a href ="viewAllEmployeesServlet">View the complete list</a>
</body>
</html>