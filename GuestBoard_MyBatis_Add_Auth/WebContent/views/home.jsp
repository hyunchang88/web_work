<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/home.jsp</title>
</head>
<body>
<h3>인덱스 페이지 입니다.</h3>

<p>${msg }</p>

<a href="${pageContext.request.contextPath }/board/list.do">방명록 목록 보기</a><br/>
<a href="${pageContext.request.contextPath }/users/signup_form.do">회원 가입</a>
</body>
</html>