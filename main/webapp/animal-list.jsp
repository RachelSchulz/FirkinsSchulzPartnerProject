<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix= "c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method = "post" action="navigationServlet">
<table>
<c:forEach items= "${requestScope.allAnimals}" var= "currentitem">
<tr>
<td><input type="radio"name="id"value="${currentitem.id}"></td>
<td>${currentitem.animal}</td>
<td>${currentitem.name}</td>
</tr>
</c:forEach>
</table>
<input type ="submit"value ="edit"name="doThisToAnimal">
<input type ="submit"value ="delete"name="doThisToAnimal">
<input type="submit"value ="add"name ="doThisToAnimal">
</form>
</body>
</html>