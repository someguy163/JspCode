<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="mit.bean.MemberBean" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

span{
    font-weight: bolder;
   	
}
</style>
</head>
<body>
<% MemberBean member = new MemberBean();

member.setName(request.getParameter("name"));
member.setUserid(request.getParameter("userid"));
member.setNickname(request.getParameter("nickname"));
member.setPwd(request.getParameter("pwd"));
member.setEmail(request.getParameter("email"));
member.setPhone(request.getParameter("phone"));
%>    

<h1>입력 완료된 회원 정보</h1>
이름 : <span style="margin-left: 50px;"><%=member.getName() %></span>
<br />
아이디 : <span style="margin-left: 34px;"><%=member.getUserid() %></span>
<br />
별명 : <span style="margin-left: 50px;"><%=member.getNickname() %></span>
<br />
비밀번호 : <span style="margin-left: 18px;"><%=member.getPwd() %></span>
<br />
이메일 : <span style="margin-left: 34px;"><%=member.getEmail() %></span>
<br />
전화번호 : <span style="margin-left: 18px;"><%=member.getPhone() %></span>
<br />

</body>
</html>