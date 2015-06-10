<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Upload multiple files</title>
</head>
<body>
	<form method="POST" action="uploadMultiple" enctype="multipart/form-data">
		File 1: <input type="file" name="file" /> <br />
		Name 1: <input type="text" name="name" /> <br />
		File 2: <input type="file" name="file" /> <br />
		Name 2: <input type="text" name="name" /> <br />
		<input type="submit" value="Upload" /> Press here to upload multiple files!
	</form>
</body>
</html>