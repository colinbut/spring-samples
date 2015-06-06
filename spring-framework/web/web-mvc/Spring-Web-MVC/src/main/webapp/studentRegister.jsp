<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Student</title>
</head>
<body>
	<h2>Register Student Account Information</h2>
	<form:form method="POST" action="registerStudent">
		<table>
			<tr>
				<td><form:label path="forename">Forename</form:label></td>
				<td><form:input path="forename" /></td>
			</tr>
			<tr>
				<td><form:label path="middlenames">Middle name(s)</form:label></td>
				<td><form:input path="middlenames" /></td>
			</tr>
			<tr>
				<td><form:label path="surname">Surname</form:label></td>
				<td><form:input path="surname" /></td>
			</tr>
			<tr>
				<td><form:label path="age">Age</form:label></td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td><form:label path="title">Title</form:label></td>
				<td>
					<form:select path="title">
						<form:option value="NONE" label="-- Select ---"/>
						<form:options items="${titles}"/>
					</form:select>
				</td>
			</tr>
			<tr>
				<td><form:label path="sex">Sex</form:label></td>
				<td><form:radiobuttons path="sex" items="${sexList}"/></td>
			</tr>
			<tr>
				<td><form:label path="marketing">Marketing options</form:label></td>
				<td><form:checkboxes items="${marketingOptions}" path="marketing"/></td>
			</tr>
			<tr>
				<td><form:label path="additionalInfo">Additional Information</form:label></td>
				<td><form:textarea path="additionalInfo"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register" /></td>
			</tr>
			
		</table>
	</form:form>
</body>
</html>