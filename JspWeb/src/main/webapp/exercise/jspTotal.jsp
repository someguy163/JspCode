<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>종합예제</h2>
	<%!String member[] = { "김길동", "홍길동", "김사랑", "박사랑" };
	int num1 = 10;

	int calc(int num2) {
		return num1 + num2;
	}%>
	<h3>1.jsp 주석</h3>

	<hr />
	<!--  -->
	<h3>2. calc 메소드 실행결과</h3>
	<%=calc(10)%>
	<hr />
	<h3>3. include : hello.jsp</h3>
	<%@ include file="../Hello.jsp"%>
	<h3>스크립트 데이터 출력</h3>
	<ul>
		<%
		for (String name : member) {
		%>
		<li><%=name%></li>
		<%
		}
		%>
	</ul>

</body>
</html>