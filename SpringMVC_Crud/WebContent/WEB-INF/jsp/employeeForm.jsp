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
<h2>Employee form</h2>
<form:form action="processForm">
	Enter name:<br>
	<form:input path="name"/><br>
	Enter age:<br>
	<form:input path="age"/><br>
	Enter designation:<br>
	<form:input path="designation"/><br>
	
	<input type="submit" value="submit">
</form:form>
</body>
</html>