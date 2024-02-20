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
MemberBean member2 = new MemberBean();
%>

자바 빈 객체 생성후 저장된 정보 출력하기 <br /> <br />
이름 : <%=member2.getName() %> <br />
아이디 : <%= member2.getUserid() %>

<hr />
정보 변경 후 출력하기 <br /> <br />
<% member2.setName("박주형"); 
   member2.setUserid("asdf");%>

이름 : <%= member2.getName() %> <br />
아이디 : <%= member2.getUserid() %>   
</body>
</html>