<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student List</title>
</head>
<body>

	<h1>Student List</h1>
	
	<table>
		<thead>
			<tr>
				<th>Student Id</th>
				<th>Surname</th>
				<th>Middlenames</th>
				<th>Forename</th>
				<th>Age</th>
				<th>Address</th>
				<th>Year Of Study</th>
			</tr>
		</thead>
		<c:forEach var="student" items="${students}">
			<tr>
				<td>${student.studentId}</td>
				<td>${student.surname}</td>
				<td>${student.middlenames}</td>
				<td>${student.forename}</td>
				<td>${student.age}</td>
				<td>${student.yearOfStudy}</td>
				<td>${student.address}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>