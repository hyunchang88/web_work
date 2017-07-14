<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/board/insertform.jsp</title>
</head>
<body>
	<h3>방명록 추가 폼</h3>
	<form action="insert.do" method="post">
		제목<input type="text" name="title">
		작성자<input type="text" name="writer"><br/>
		내용 <br/>
			<textarea name="content" rows="30" cols="90"></textarea>
		<button type="submit">추가</button>
	</form>
</body>
</html>