<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<p> POST 방식 전송
<form action="student" method="post">
	POST Student ID : <input type="text" name="id"> </br>
	POST Student PW : <input type="text" name="pw"> </br>
	<input type="submit" value="전송">
</form>

<p> GET 방식 전송
<form action="student" method="get">
	GET Student ID : <input type="text" name="id"> </br>
	GET Student PW : <input type="text" name="pw"> </br>
	<input type="submit" value="전송">
</form>


</body>
</html>