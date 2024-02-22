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

<c:fortokens var="city" items="서울.인천,대구.부산" delims=",">
${city} <br />
</c:fortokens>

<c:fortokens var="city2" items="서울.인천,대구.부산" delims=",.">
${city} <br />
</c:fortokens>
</body>
</html>