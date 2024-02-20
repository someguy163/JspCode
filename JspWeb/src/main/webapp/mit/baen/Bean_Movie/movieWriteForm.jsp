<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="movieWrite.jsp">
		<center>
			<table>
				<tr>
					<td>제목</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>가격</td>
					<td><input type="text" name="price" /></td>
				</tr>
				<tr>
					<td>감독</td>
					<td><input type="text" name="director" /></td>
				</tr>
				<tr>
					<td>출연배우</td>
					<td><input type="text" name="actor" /></td>
				</tr>
				<tr>
					<td>시놉시스</td>
					<td><textarea cols="30" rows="10" name="synopsis"></textarea></td>
				</tr>
				<tr>
					<td>장르</td>
					<td><select name="genre" id="">
							<option value="액션">액션</option>
							<option value="멜로">멜로</option>
							<option value="코미디">코미디</option>
					</select></td>
				</tr>

			</table>
			<input type="submit" value="전송" /> <input type="reset" value="취소" />
		</center>
	</form>

</body>
</html>