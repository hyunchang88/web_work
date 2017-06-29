<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test1/main.jsp</title>
</head>
<body>
<!-- 
	include 디렉티브를 이용해서 외부 jsp 코드를 main.jsp 페이지에 병합 시키기
 -->
<%@ include file="header.jsp" %>
<div>
	<h3>메인 컨텐츠 입니다.</h3>
	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fuga qui iste aliquam dolore rem fugit quos eum facilis minima asperiores facere nobis repellendus. Veniam et cumque sequi laborum officiis quidem.</p>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>