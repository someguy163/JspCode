<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mit.bean.MemberBean" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
MemberBean member = new MemberBean();
%>
<%member.setName("d"); %>
<%= member.getName() %>
</body>
</html>