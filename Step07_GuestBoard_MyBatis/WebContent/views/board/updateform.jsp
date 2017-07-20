<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>디테일 폼 ~</h3>
	<form action="update.do" method="post">
		<input type="hidden" name="num" value="${dto.num }" />
		글번호<input type="text" value="${dto.num}" disabled/>
		제목<input type="text" name="title" value="${dto.title}">
		작성자<input type="text" name="writer" value="${dto.writer}" disabled><br/>
		내용 <br/>
			<textarea name="content" rows="30" cols="90">${dto.content}</textarea>
		<button type="submit">수정확인</button>
		<button type="reset">취소</button>
	</form>
</body>
</html>