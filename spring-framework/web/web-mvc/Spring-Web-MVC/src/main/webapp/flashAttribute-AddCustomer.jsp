<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Flash Attributes Example - POST/redirect/GET</title>
</head>
<body>

	<h1>Add New Customer</h1>
	<form:form action="addCustomer" method="POST" commandName="customer">
		<table>
			<tbody>
				<tr>
					<td><form:label path="firstname">Firstname</form:label></td>
					<td><form:input path="firstname" type="text" /></td>
				</tr>
				<tr>
					<td><form:label path="lastname">Lastname</form:label></td>
					<td><form:input path="lastname" type="text" /></td>
				</tr>
				<tr>
					<td><form:label path="age">Age</form:label></td>
					<td><form:input path="age" type="text" /></td>
				</tr>
				<tr>
					<td><form:label path="email">Email</form:label></td>
					<td><form:input path="email" type="email" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Add Customer"></td>
				</tr>
			</tbody>	
		</table>
	</form:form>

</body>
</html>