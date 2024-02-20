<%@page import="mit.bean.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="msg" value="hello"/>
\${msg} : ${msg} <br />
<c:set var="age" value="30"/>
\${age} : ${age}

<c:set var="member" value="<%= new MemberBean() %>"/>
<c:set target="${member}" property="name" value="박주형"/>
<c:set target="${member}" property="userid" value="abcd"/>
\${member} = ${member} <br />
\${member.name} = ${member.name} <br />

<c:set var="add" value="${10+5 }"></c:set>
\${add} = ${add} <br />
<c:set var="flag" value="${10>5}"></c:set>
\${flag} = ${flag} <br />

</body>
</html>