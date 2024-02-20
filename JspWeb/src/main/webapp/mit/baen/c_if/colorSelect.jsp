<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 첫번쨰 방법 -->
 <c:set var="color"
		value='<%= request.getParameter("color")%>' />
<c:if test="${color==1}">
		<p style="color: red;">빨강</p>
	</c:if>
	<c:if test="${color==2}">
		<p style="color: blue;">파랑</p>
	</c:if>
	<c:if test="${color==3}">
		<p style="color: green;">초록</p>
	</c:if> 
	
<!-- 두번째 방법 -->
<%-- 	<c:if test="${param.color==1}">
		<p style="color: red;">빨강</p>
	</c:if>
	<c:if test="${param.color==2}">
		<p style="color: blue;">파랑</p>
	</c:if>
	<c:if test="${param.color==3}">
		<p style="color: green;">초록</p>
	</c:if> --%>

</body>
</html>