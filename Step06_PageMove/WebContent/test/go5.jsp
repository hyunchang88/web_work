<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	System.out.println("/test/go5.jsp 요청 처리중...");

	// 상대경로 리다일렉트 이동 응답.
	response.sendRedirect("result5.jsp");
%>
