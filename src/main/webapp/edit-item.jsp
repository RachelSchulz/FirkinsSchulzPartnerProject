<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix= "c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employees</title>
</head>
<body>
<h2>Edit Employees</h2>
<form action="editEmployeesServlet"method="post">
Name: <input type ="text"name ="name"value="${itemToEdit.name}">
Department: <input type ="text"name ="department"value="${itemToEdit.department.departmentName}">
Hours: <input type ="text"name ="hours"value="${itemToEdit.hours2}">
Pay Per Hour: <input type ="text"name ="payperhour"value="${itemToEdit.payperhour2}">
<input type ="hidden"name ="id"value="${itemToEdit.id}">
<input type ="submit"value="Save Edited Employees">
</form>
</body>
</html>