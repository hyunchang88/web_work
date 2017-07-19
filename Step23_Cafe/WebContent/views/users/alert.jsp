<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/users/alert.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resource/css/bootstrap.css" />
</head>
<body>
<div class="container">
	<h3>알림</h3>
	<div class="alert alert-success">
		${msg }
		<a class="alert-link" href="${url }">확인</a>
	</div>
</div>
</body>
</html>