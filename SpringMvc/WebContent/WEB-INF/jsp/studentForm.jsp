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
<form:form modelAttribute="student" action="processForm2">
	Enter first name:<br>
	<form:input path="firstName"/><br>
	Enter last name:<br>
	<form:input path="lastName"/><br>
	Enter age:<br>
	<form:input path="age"/><br>
	<input type="submit" value="enter">
</form:form>
	

</body>
</html>