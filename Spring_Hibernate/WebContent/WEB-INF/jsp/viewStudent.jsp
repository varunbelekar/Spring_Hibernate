<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="border">
	<tr>
		<td>ID</td>
		<td>NAME</td>
		<td>AGE</td>
		<td>USERNAME</td>
		<td>UPDATE</td>
		<td>DELETE</td>
	</tr>
	<c:forEach var="i" items="${list}">
		<tr>
			<td>${i.id}</td>
			<td>${i.name}</td>
			<td>${i.age}</td>
			<td>${i.username}</td>
			<td><a href="update">Update</a></td>
			<td><a href="delete/${i.id}">Delete</a></td>
		</tr>
	</c:forEach>
</table>
<a href="home">Home</a>
</body>
</html>