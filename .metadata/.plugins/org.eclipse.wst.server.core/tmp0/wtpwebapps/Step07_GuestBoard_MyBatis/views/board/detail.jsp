<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/board/detail.jsp</title>
</head>
<body>
	<h3>디테일 폼 ~</h3>
	글번호<input type="text" name="num" value="${dto.num}" readonly/>
	제목<input type="text" name="title" value="${dto.title}" readonly>
	작성자<input type="text" name="writer" value="${dto.writer}" readonly><br/>
	내용 <br/>
		<textarea name="content" rows="30" cols="90" readonly style="resize: none;">${dto.content}</textarea>
		<a href="list.do">목록보기</a>
		<a href="updateform.do?num=${dto.num}">수정</a>
</body>
</html>