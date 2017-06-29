<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int num=Integer.parseInt(request.getParameter("num"));
	String name=request.getParameter("name");
	String addr=request.getParameter("addr");
%>

<div class="header">
	<h3>header.jsp 입니다.</h3>
	<p> 번호 : <strong><%=num %></strong></p>
	<p> 이름 : <strong><%=name %></strong></p>
	<p> 주소 : <strong><%=addr %></strong></p>
</div>