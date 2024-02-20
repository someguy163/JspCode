<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="mit.bean.MovieBean" %>    
<% MovieBean movie = new MovieBean(); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int price = Integer.parseInt(request.getParameter("price"));
movie.setName(request.getParameter("name"));
movie.setPrice(price);
movie.setDirector(request.getParameter("director"));
movie.setActor(request.getParameter("actor"));
movie.setSynopsis(request.getParameter("synopsis"));
movie.setGnere(request.getParameter("genre"));
%>
<h1>입력 완료된 정보</h1>
<table>
		<tr>
			<td>제목</td>
			<td><%=movie.getName() %></td>
		</tr>
		<tr>
			<td>가격</td>
			<td><%=movie.getPrice() %></td>
		</tr>
		<tr>
			<td>감독</td>
			<td><%=movie.getDirector() %></td>
		</tr>
		<tr>
			<td>출연배우</td>
			<td><%=movie.getActor() %></td>
		</tr>
		<tr>
			<td>시놉시스</td>
			<td><%=movie.getSynopsis() %></td>
		</tr>
		<tr>
			<td>장르</td>
			<td><%=movie.getGnere() %></td>
		</tr>

	</table>

</body>
</html>