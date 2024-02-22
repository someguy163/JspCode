<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>JSTL 종합 예제</h2>

	<hr />
	<h3>set , out</h3>
	<c:set var="product1" value="<h2>애플 아이폰<h2/>" />
	<c:set var="product2" value="삼성샐럭시노트" />
	<%-- <c:set var="intArray" value="${[1,2,3,4,5]}" /> --%>
	<c:forTokens var="city" items="Seoul/Tokyo/New York/Toronto" delims="/"></c:forTokens>


	product1(jstl) :
	<c:out value="${product1}" escapeXml="true" />
	<br /> product1(el) :
	${product1}
	<br /> intArray[2] :
	<c:out value="${intArray[2]}"></c:out>
	<br />
	<hr />
	<h3>for Each 배열 출력</h3>
	<ul>
		<c:forEach var="cnt" begin="0" end="5" items="${intArray}" varStatus="status">
			<li>${status.index} : ${cnt}</li>
		</c:forEach>
	</ul>
	
	<hr />
	<h3>if</h3>
	




</body>
</html>