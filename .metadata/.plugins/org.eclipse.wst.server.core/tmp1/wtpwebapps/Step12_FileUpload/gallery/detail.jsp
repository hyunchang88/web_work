<%@page import="test.board.dao.ImageDao"%>
<%@page import="test.board.dto.ImageDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/gallery/datail.jsp</title>
</head>
<body>
<%
	// GET 방식 파라미터로 전달되는 이미지의 번호를 읽어와서
	int num=Integer.parseInt(request.getParameter("num"));
	// DB 에서 해당 이미지 정보를 얻어온다.
	ImageDto dto=ImageDao.getInstance().getData(num);
%>
<h3><%=dto.getName() %></h3>
<img src="<%=dto.getImgSrc() %>"/>
<p> 등록일 : <strong><%=dto.getRegdate() %></strong></p>
<a href="list.jsp">목록보기</a>
</body>
</html>