<%@page import="test.board.dto.BoardDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/views/border/list.jsp</title>
</head>
<body>
<%
	//request에 담긴 모델을 얻어온다
	List<BoardDto> list=(List<BoardDto>)request.getAttribute("list");
%>
<h3>게시판 목록입니다.</h3>
<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>작성일</th>
		</tr>
	</thead>
	
	<tbody>
	<%for(BoardDto tmp:list){ %>
		<tr>
			<td><%=tmp.getNum() %></td>
			<td><%=tmp.getWriter() %></td>
			<td><%=tmp.getTitle() %></td>
			<td><%=tmp.getRegdate() %></td>
		</tr>
	<%} %>
	</tbody>

</table>
</body>
</html>