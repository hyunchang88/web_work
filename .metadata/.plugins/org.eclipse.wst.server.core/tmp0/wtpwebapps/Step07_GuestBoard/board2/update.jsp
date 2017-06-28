<%@page import="test.board.dao.BoardDao"%>
<%@page import="test.board.dto.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dto" class="test.board.dto.BoardDto"/>
<jsp:setProperty property="*" name="dto"/>
<%
	//3. BoardDao 객체를 이용해서 수정반영하고
	boolean isSuccess = BoardDao.getInstance().update(dto);
	//4. 응답한다.
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/board/update.jsp</title>
</head>
<body>
<% if(isSuccess){ %>
	<script>
		alert("수정했습니다.");
		location.href="list.jsp";
	</script>
<%}else{ %>
	<script>
		laert("수정 실패!");
		location.href="list.jsp";
	</script>
<%} %>
</body>
</html>