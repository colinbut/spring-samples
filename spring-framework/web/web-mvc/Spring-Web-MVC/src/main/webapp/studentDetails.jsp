<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Information</title>
</head>
<body>
	<h2>Student Details</h2>
	
	<table>
		<tr>
			<td>Student Id:</td>
			<td>${student.studentId}</td>
		</tr>
		<tr>
			<td>Surname:</td>
			<td>${student.surname}</td>
		</tr>
		<tr>
			<td>Middlenames:</td>
			<td>${student.middlenames}</td>
		</tr>
		<tr>
			<td>Forename:</td>
			<td>${student.forename}</td>
		</tr>
		<tr>
			<td>Age:</td>
			<td>${student.age}</td>
		</tr>
		<tr>
			<td>Year Of Study:</td>
			<td>${student.yearOfStudy}</td>
		</tr>
		<tr>
			<td>Address:</td>
			<td>${student.address}</td>
		</tr>
	</table>
	
	<table>
		<thead>
			<tr>
				<th>Class</th>
				<th>Semester</th>
			</tr>
		</thead>
		<c:forEach var="clazz" items="${student.classes}">
			<tr>
				<td>${clazz.name}</td>
				<td>${clazz.semester}</td>
			</tr>
		</c:forEach>
	</table>
	
	
</body>
</html>