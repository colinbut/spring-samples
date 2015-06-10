<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Locale Example</title>
</head>
<body>

<h1>Internationalization/Localization</h1>

<p>Language: <a href="?language=en">English</a> | <a href="?language=zh_CN">Chinese</a> </p>

<h2>Welcome.SpringMVC : <spring:message code="welcome.springmvc" text="default text" />   </h2> 

<p>Current Locale: ${pageContext.response.locale} </p>

</body>
</html>