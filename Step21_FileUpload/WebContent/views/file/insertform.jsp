<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view/file/insertform.jsp</title>
</head>
<body>
<h3>파일 업로드 폼 입니다.</h3>
<form action="insert.do" method="post" 
	enctype="multipart/form-data">
	<table>
		<tr>
			<th><label for="writer">작성자</label></th>
			<td><input type="text" name="writer" id="writer"/></td>
		</tr>
		<tr>
			<th><label for="title">제목</label></th>
			<td><input type="text" name="title" id="title"/></td>
		</tr>
		<tr>
			<th><label for="myFile">첨부파일</label></th>
			<td><input type="file" name="myFile" id="myFile"/></td>
		</tr>
		<tr>
			<td></td>
			<td><button type="submit">확인</button></td>
		</tr>
	</table>
</form>
</body>
</html>