<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%boolean status=(Boolean) request.getAttribute("status"); %>
<font color="blue">Status :${status}</font>
<% if(status) {
String username=(String)request.getAttribute("uname");
%>
<h2>Login Sucess</h2>
<font color="green"><h3>Welcome : ${username}</h3></font>
<%}else{ %>
<h2>Login failed</h2>
<font color="red"><h3>Try again </h3></font>
<%} %>
</body>
</html>