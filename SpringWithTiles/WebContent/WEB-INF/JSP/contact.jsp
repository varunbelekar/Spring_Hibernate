<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Contact Form:</h2>
<form:form method="post" action="add">
	<table>
	<tr>
		<td><form:label path="firstName">Enter FirstName:</form:label></td>
		<td><form:input path="firstName"/></td>
	</tr>
	<tr>
		<td><form:label path="lastName">Enter LastName:</form:label></td>
		<td><form:input path="lastName"/></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="AddContact">
		</td>
	</tr>
	</table>
</form:form>
</body>
</html>