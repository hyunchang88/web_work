<%@page import="test.board.dao.BoardDao"%>
<%@page import="test.board.dto.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 파라미터로 전달되는 글 번호 읽어오기
	int num=Integer.parseInt(request.getParameter("num"));
	// DB 에서 글정보 얻어오기
	BoardDto dto=BoardDao.getInstance().getData(num);
	// 응답하기
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/board/detail.jsp</title>
</head>
<body>
   <h3>글 자세히 보기 페이지</h3>
   글번호 <input type="text" value="<%=dto.getNum() %>"/><br/>
   작성자 <input type="text" value="<%=dto.getWriter() %>"/><br/>
   제목 <input type="text" value="<%=dto.getTitle() %>"/><br/>
   내용<br/>
   <textarea cols="30" rows="10"><%=dto.getContent() %></textarea><br/>
   <a href="list.jsp">목록보기</a>
   <a href="updateform.jsp?num=<%=dto.getNum()%>">수정</a>
</body>
</html>