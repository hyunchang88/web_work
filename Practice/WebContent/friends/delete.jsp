<%@page import="test.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//파라미터로 전달된 삭제할 회원의 번호를 읽어온다.
	int num=Integer.parseInt(request.getParameter("num"));
	//Dao 객체를 이용해서 DB 에서 삭제한다.
	Dao dao=Dao.getInstance();
	dao.delete(num);
	//응답하기
	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>friends/delete.jsp</title>
</head>
<body>
<script>
		alert("<%=num %>번 회원정보를 삭제 했습니다.")
		location.href="list.jsp"; //목록보기 페이지로 이동
</script>
</body>
</html>