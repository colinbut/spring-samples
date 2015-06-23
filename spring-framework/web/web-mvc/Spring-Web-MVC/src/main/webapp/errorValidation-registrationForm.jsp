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
		<table>
			<tr>
				<td>Username:</td>
				<td>
					<form:input path="username"/>
				</td>
				<td>
					<font color="red">
						<form:errors path="username" />
					</font>
				</td>
			</tr>
			<tr>
				<td>Password:</td>
				<td>
					<form:password path="password"/>
				</td>
				<td>
					<font color="red">
						<form:errors path="password" />
					</font>
				</td>
			</tr>
			<tr>
				<td>First Name:</td>
				<td>
					<form:input path="firstName"/>
				</td>
				<td>
					<font color="red">
						<form:errors path="firstName" />
					</font>
				</td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td>
					<form:input path="lastName"/>
				</td>
				<td>
					<font color="red">
						<form:errors path="lastName" />
					</font>
				</td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td>
					<form:radiobutton path="gender" value="Male"/> Male
					<br />
					<form:radiobutton path="gender" value="Female"/> Female
				</td>
				<td>
					<font color="red">
						<form:errors path="gender" />
					</font>
				</td>
			</tr>
			<tr>
				<td>Country:</td>
				<td>
					<form:select path="country">
						<form:option value="UK">United Kingdom</form:option>
						<form:option value="USA">USA</form:option>
						<form:option value="Australia">Australia</form:option>
						<form:option value="China">China</form:option>
						<form:option value="France">France</form:option>
					</form:select>
				</td>
			</tr>
			<tr>
				<td>Address:</td>
				<td>
					<form:textarea path="address"/>
				</td>
				<td>
					<font color="red">
						<form:errors path="address" />
					</font>
				</td>
			</tr>
			<tr>
				<td>Select any:</td>
				<td>
					<form:checkbox path="cb" value="checkbox1"/>
					Checkbox1
					<br />
					<form:checkbox path="cb" value="checkbox2"/>
					Checkbox2
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register"/></td>
			</tr>
		</table>
		
	</form:form>
	
</body>
</html>