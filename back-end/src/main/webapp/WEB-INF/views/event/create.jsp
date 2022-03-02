<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<title>N분의 1로</title>
	</head>
	<body>
 		<h1>N분의 1 : EVENT를 입력받아보자</h1>
  		<form:form method="POST">
   			<p>이름 : <input type="text" value="EventName" /></p>
   			<p>참석자 : <input type="text" path="Participant" /></p>
   			<p>결제자 : <input type="text" path="Payer" /></p>
   			<p>날짜 : <input type="text" path="EventDate" /></p>
   			<p>가격 : <input type="text" path="Price" /></p>
   			<p><input type="submit" value="Save" /></p>
  		</form:form>
	</body>
</html>