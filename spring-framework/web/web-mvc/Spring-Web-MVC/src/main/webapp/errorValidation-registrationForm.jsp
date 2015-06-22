<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Form Registration</title>
</head>
<body>
	
	<h1>Form Registration</h1>
	
	<form:form action="register" commandName="registration" method="POST">
		Username: <form:input path="username"/>
		<font color="red">
			<form:errors path="username" />
		</font>
		<br />
		
		Password: <form:password path="password"/>
		<font color="red">
			<form:errors path="password" />
		</font>
		<br />
		
		First Name: <form:input path="firstName"/>
		<br /> 
		
		Last Name: <form:input path="lastName"/>
		<br />
		
		Gender: <form:radiobutton path="gender" value="Male"/> Male
				<form:radiobutton path="gender" value="Female"/> Female
		<br />
		
		Country: 
		<form:select path="country">
			<form:option value="India">India</form:option>
			<form:option value="USA">USA</form:option>
			<form:option value="Australia">Australia</form:option>
		</form:select>
		<br />
		
		Address:
		<form:textarea path="address"/>
		<br />
		
		Select any:
		<form:checkbox path="cb" value="checkbox1"/>
		Checkbox1
		<form:checkbox path="cb" value="checkbox2"/>
		Checkbox2		
		
		<input type="submit" value="Register"/>
		
	</form:form>
	
</body>
</html>