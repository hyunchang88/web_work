<%@page import="test.users.dao.UsersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dto" class="test.users.dto.UsersDto"/>
<jsp:setProperty property="*" name="dto"/>
<%
	//UsersDao 객체를 이용해서 아이디 비밀번호가 유효한 정보인지 확인한다.
	boolean isValid=UsersDao.getInstance().isValid(dto);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>users/signin.jsp</title>
</head>
<body>
<%if(isValid){ 
	session.setAttribute("id", dto.getId());%>
	<p> <strong><%=dto.getId() %></strong> 님 로그인 되었습니다.</p>
<%}else{ %>
	<p> 아이디 혹은 비밀번호가 틀려요.</p>
	<a href="signin_form.jsp">로그인 페이지로 가기</a>
<%} %>
</body>
</html>