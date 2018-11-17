<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  
"http://www.w3.org/TR/html4/loose.dtd">  
    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div><tiles:insertAttribute name="header"></tiles:insertAttribute></div>
<div  style="float:left;padding:10px;width:15%;">
	<tiles:insertAttribute name="menu"></tiles:insertAttribute>
</div>
<div>
	<tiles:insertAttribute name="body"></tiles:insertAttribute>
</div>

<div style="clear:both">
	<tiles:insertAttribute name="footer"></tiles:insertAttribute>
</div>
</body>
</html>