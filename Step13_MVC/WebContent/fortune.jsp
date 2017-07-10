<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/fortune.jsp</title>
</head>
<body>
<%
	// 오늘의 운세를 얻어오는 비즈니스 로직을 수행한다고 가정
	String fortuneToday="발코니에 갇히게 될거에요!";
%>
<p> 오늘의 운세 : <strong><%=fortuneToday %></strong></p>
</body>
</html>