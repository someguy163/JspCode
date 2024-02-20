<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
String id = "asdf";
String pwd = "1234";
String name ="박주형";

request.setCharacterEncoding("UTF-8");

if(id.equals(request.getParameter("userid")) && pwd.equals(request.getParameter("userpwd"))){
	response.sendRedirect("LogiMain.jsp?name=" + URLEncoder.encode(name,"UTF-8"));
}
else{
	response.sendRedirect("LoginForm.jsp");
}
%>
</body>
</html>