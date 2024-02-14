<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form action="/JspWeb/Method" method="get">
		<input type="submit" value="get방식으로 호출" />
	</form>
	<br />
	<br />
	<form action="/JspWeb/Method" method="post">
		<input type="submit" value="post방식으로 호출" />
	</form>
</body>
</html>