<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Register Page</title>
</head>
<body bgcolor=#EEEEEE>
<center>
<h2> <font> Enter Employee Details</font></h2><br>
<form action="RegisterEmployee" method="post">
<table border="0px">
<tr>
	<td> Name: </td>
	<td> <input type="text" name="empname" placeholder="Employee  Name"> </td>
</tr>
<tr>
	<td> Emp Id: </td>
	<td> <input type="text" name="empid" placeholder="Id to use as password"> </td>
</tr>
<tr>
	<td> Designation: </td>
	<td> <input type="text" name="designation" placeholder="designation"> </td>
</tr>

<tr>
	<td> Salary: </td>
	<td> <input type="text" name="salary" placeholder="Salary"> </td>
</tr>

</table>
<br>
<input type="submit"/>
</form>
</center>
</body>
</html>