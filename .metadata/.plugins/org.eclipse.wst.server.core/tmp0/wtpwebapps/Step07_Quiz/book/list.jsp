<%@page import="test.board.dto.BoardDto"%>
<%@page import="java.util.List"%>
<%@page import="test.board.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/board/list.jsp</title>
</head>
<body>
<a href="insertform.jsp">새책 추가</a>
<h3>읽은? 책 목록입니다.</h3>
<%
	// 글 목록 보기
	BoardDao dao=BoardDao.getInstance();
	List<BoardDto> list=dao.getList();
%>
<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>책 제목</th>
			<th>저자</th>
			<th>출판사</th>
			<th>등록일</th>
			<th>삭제</th>
		</tr>
	</thead>
	<tbody>
	<%for(BoardDto tmp:list){ %>
		<tr>
			<td><%=tmp.getNum() %></td>
			<td><a href="detail.jsp?num=<%=tmp.getNum()%>"><%=tmp.getTitle() %></a></td>
			<td><%=tmp.getAuthor() %></td>
			<td><%=tmp.getPublisher() %></td>
			<td><%=tmp.getRegdate() %></td>
			<td><a href="delete.jsp?num=<%=tmp.getNum()%>">삭제</a></td>
		</tr>
	<%} %>
	</tbody>
</table>
</body>
</html>