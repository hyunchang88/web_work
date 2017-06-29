<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/test7/home.jsp</title>
<%@ include file="myResource.jsp" %>
</head>
<body>
<jsp:include page="navbar.jsp">
	<jsp:param value="home" name="active"/>
</jsp:include>
<div class="container">
	<h3>Home 페이지 입니다.</h3>
	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsam tempora debitis tempore mollitia ex ullam quos corrupti non saepe nostrum facere recusandae et iure quas aliquam laboriosam quae voluptatum repudiandae!</p>
</div>

</body>
</html>