<%@page import="test.board.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//파라미터로 전달되는 삭제할 글번호를 읽어온다.
	int num=Integer.parseInt(request.getParameter("num"));
	//BoardDao 객체를 이용해서 글 삭제하기
	boolean isSuccess=BoardDao.getInstance().delete(num);
	//응답하기
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/board/delete.jsp</title>
</head>
<body>
<%if(isSuccess){ %>
	<p><%=num %> 번 글을 삭제 했습니다.</p>
	<a href="list.jsp">글목록 보기</a>
<%}else{ %>
	<p>글 삭제 실패!</p>
	<a href="list.jsp">글목록 보기</a>
<%} %>
</body>
</html>