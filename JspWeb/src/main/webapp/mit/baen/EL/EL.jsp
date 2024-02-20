<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- EL -->
${"hello"} <br />
<!-- 스크립트컷 --> 
<%= "hello" %> <br />
<!-- 표현식 (Expression) -->
<%out.print("hello"); %>
<br />
정수형 : ${10} <br />
실수형 : ${5.6} <br />
문자열형 : ${"박주형"} <br />
논리형 : ${true} <br />
null : ${null} <br />
사직연산 : ${10+20} <br />
사직연산 : ${10 - 20} <br />
사직연산 : ${10 / 20} <br />
사직연산 : ${10 * 20} <br />
논리연산 : ${ (5>2) || (1<2)} <br />
논리연산 : ${ (5<2)} <br />
3항연산 :  ${(5>2) ? 5 : 2 } <br />

<% String input =null; %>
\${empty input} : ${empty input} <br />

 
</body>
</html>