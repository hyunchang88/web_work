<%@page import="test.board.dao.ImageDao"%>
<%@page import="test.board.dto.ImageDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/gallery/list.jsp</title>
<style>
	table img{
		width: 200px;
	}
	
	table img:hover{
		border: 1px solid red;
	}
	
	table a{
		cusor: pointer;
	}
	
</style>
</head>
<body>
<%
	//이미지 목록을 얻어온다.
	List<ImageDto> list=ImageDao.getInstance().getList();
%>
<h3>겔러리 입니다.</h3>
<table>
	<thead>
		<tr>
			<th>이름</th>
			<th>이미지</th>
			<td>업로드 날짜</td>
		</tr>
	</thead>
	<tbody>
	<%for(ImageDto tmp:list){ %>
		<tr>
			<td><%=tmp.getName() %></td>
			<td><a href="detail.jsp?num=<%=tmp.getNum()%>"><img src="<%=tmp.getImgSrc() %>" width="200" /></a></td>
			<td><%=tmp.getRegdate() %></td>
		</tr>
	<%} %>	
	</tbody>
</table>
</body>
</html>











