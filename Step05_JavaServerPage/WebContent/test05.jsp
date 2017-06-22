<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test05.jsp</title>
</head>
<body>
<%-- 여기는 주석 입니다. jsp 페이지가 해석하지 않아요 --%>

<%-- 조건부로 특정 내용을 출력하기 --%>

<%
	boolean isRun=false;
%>

<%if(isRun){ %>
	<p style="color:blue">달려요~!</p>
<%}else{ %>
	<p style="color:red">달리지 않아요!</p>
<%} %>
</body>
</html>