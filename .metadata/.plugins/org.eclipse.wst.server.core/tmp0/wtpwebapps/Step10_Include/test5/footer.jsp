<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name2=(String)request.getAttribute("name");
%>
<div class="footer">
	<h3>footer.jsp 입니다.</h3>
	<p>어쩌구 <br/>
	저쩌구.... <br/>
	내 이름은 : <strong><%=name2 %></strong></p>
</div>