<%@page import="test.users.dao.UsersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id=(String)session.getAttribute("id");
	// DB 에서 회원정보를 삭제한다.
	UsersDao.getInstance().delete(id);
	//세션에서 로그인 정보도 삭제
	session.invalidate();
	// 응답한다.
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/users/private/delete.jsp</title>
</head>
<body>
<p> <strong><%=id %></strong> 회원님 탈퇴 처리 되었습니다.</p>
<a href="<%=request.getContextPath() %>">인덱스로 이동</a>
</body>
</html>