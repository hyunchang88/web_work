<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/book/insertform.jsp</title>
</head>
<body>
<h3>새책 추가 폼입니다.</h3>
<form action="insert.jsp" method="post">
	<label for="title">제목</label>
	<input type="text" name="title" id="title"/><br/>
	<label for="author">저자</label>
	<input type="text" name="author" id="author"/><br/>
	<label for="publisher">출판사</label>
	<input type="text" name="publisher" id="publisher"/><br/>
	<br/>
	<button type="submit">저장</button>
</form>
</body>
</html>