<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/member/updateform.jsp</title>
</head>
<body>
<h3>회원정보 수정 폼</h3>
<form action="update.do" method="post">
	<input type="hidden" name="num" value="${dto.num }" />
	번호 <input type="text" value="${dto.num }" disabled />
	이름 <input type="text" name="name" id="${dto.name }" />
	주소 <input type="text" name="addr" id="${dto.addr }" />
	<button type="submit">수정확인</button>
	<button type="reset">취소</button>
</form>
</body>
</html>