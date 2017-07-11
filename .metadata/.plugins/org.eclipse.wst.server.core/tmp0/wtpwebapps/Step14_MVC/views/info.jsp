<%@page import="test.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/views/infoList.jsp</title>
</head>
<body>
<%
	// request 에 담긴 내용을 읽어온다.
	MemberDto dto=(MemberDto)request.getAttribute("dto");
%>
<h3>회원 정보 입니다.</h3>
<p> 번호 : <strong><%=dto.getNum() %></strong></p>
<p> 이름 : <strong><%=dto.getName() %></strong></p>
<p> 주소 : <strong><%=dto.getAddr() %></strong></p>
</body>
</html>