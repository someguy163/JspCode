<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="addMember.jsp" method="post">
		<h1>회원의 정보 입력 폼</h1>
		이름 : <input type="text" name="name" /> <br />
		아이디 : <input type="text" name="userid" /> <br />
		비밀번호 : <input type="text" name="userpwd" /> <br />
		이메일 : <input type="text" name="email" /> <br />
		전화번호 : <input type="text" name="phone" /> <br />
		등급 : <input type="radio" value="1" name="admin"/>관리자 <input type="radio" value="2" name="admin" />일반회원
		<input type="submit" />
	</form>

</body>
</html>