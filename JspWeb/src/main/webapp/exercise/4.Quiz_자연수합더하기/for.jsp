<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<%!
int calc(int x){
	int total =0;
	for(int i=1; i<=x; i++){
		total = total + i;
	}
	return total;
}

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>임의 값을 1부터 더하기</h1>

	<%
int number = Integer.parseInt(request.getParameter("num"));
for(int i=1; i<number; i++){
	out.print(i + " + ");
}
out.print( number +" = "+calc(number));
%>



</body>
</html>