<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${welcomeMessage}

<a href="/Spring_Internationalization/init?lang=en">English</a>
<a href="/Spring_Internationalization/init?lang=fr">French</a>
<%-- <h4><spring:message code="welcome.message"></spring:message></h4> --%>
</body>
</html>