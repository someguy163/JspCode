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
<c:import url="http://localhost:8080/JspWeb/mit/baen/c_choose/fruitSelectForm.jsp"></c:import>
${data}
<hr />
<c:url value="../media/apple.jpg" var="data"></c:url>
<h3>${data}</h3>
<img src="${data}" alt="" width="150" height="150"/>
<hr />
<c:redirect url="../useBeanCalcForm.html"></c:redirect>
</body>
</html>