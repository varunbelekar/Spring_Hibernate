<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="border">
<tr>
	<td>Name</td>
	<td>Age</td>
	<td>Designation</td>
	<td>Update</td>
	<td>Delete</td>
</tr>
<c:forEach var="i" items="${list}">
	<tr>
		<td>${i.name}</td>
		<td>${i.age}</td>
		<td>${i.designation}</td>
		<td><a href="edit/${i.name}">Update</a></td>
		<td><a href="delete/${i.name}">Delete</a></td>
	</tr>
</c:forEach>
</table>
</body>
</html>