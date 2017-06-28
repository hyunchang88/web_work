<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/requestScope/showdate.jsp</title>
</head>
<body>
<%
	//request 영역에 담긴 내용 얻어오기
	Map<String, String> map=
		(Map<String, String>)request.getAttribute("map");
%>
<p> 이름 : <strong><%=map.get("name") %></strong></p>
<p> 주소 : <strong><%=map.get("addr") %></strong></p>
</body>
</html>