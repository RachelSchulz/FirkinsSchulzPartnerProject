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
<form method = "post" action="navigationServlet">
<table>
<c:forEach items= "${requestScope.allEmployees}" var= "currentitem">
<tr>
<td><input type="radio"name="id"value="${currentitem.id}"></td>
<td>${currentitem.name}</td>
<td>${currentitem.department}</td>
<td>${currentitem.hours}</td>
<td>${currentitem.payperhour}</td>
</tr>
</c:forEach>
</table>
<input type ="submit"value ="edit"name="doThisToEmployee">
<input type ="submit"value ="delete"name="doThisToEmployee">
<input type="submit"value ="add"name ="doThisToEmployee">
</form>
</body>
</html>