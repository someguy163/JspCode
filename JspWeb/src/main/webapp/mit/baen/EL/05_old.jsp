<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
자바코드 <br />
== 연산자 사용 결과 : 
<%=request.getParameter("id") =="abcd" %>
<br />
equals 사용결과
<%=request.getParameter("id").equals("abcd") %>

EL 사용식 <br />
== 연산자 사용 결과 : ${param.id=="abcd"} <br />
</body>
</html>