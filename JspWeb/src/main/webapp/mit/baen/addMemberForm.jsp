<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

</style>
</head>
<body>



<h1>회원의 정보 입력 폼</h1>
<form action="addMember.jsp">
<label for="">이름 : </label><input type="text" name="name" style="margin-left: 50px;"/>
<br />
<label for="">아이디 : </label><input type="text" name="userid" style="margin-left: 34px;"/>
<br />
<label for="">별병 : </label> <input type="text" name="nickname" style="margin-left: 50px;"/>
<br />
<label for="">비밀번호 : </label><input type="password" name="pwd" style="margin-left: 18px;"/>
<br />
<label for="">이메일 : </label><input type="email" name="email" style="margin-left: 34px;"/>
<br />
<label for="">전화번호 : </label><input type="text" name="phone" style="margin-left: 18px;"/>
<br />
<div style="padding: 10px;">
<input type="submit" value="전송" /> <input type="reset" value="취소" style="margin-left: 20px;"/>
</div>
</form>

</body>
</html>