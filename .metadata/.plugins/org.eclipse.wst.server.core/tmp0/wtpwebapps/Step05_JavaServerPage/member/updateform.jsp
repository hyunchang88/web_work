<%@page import="test.dto.MemberDto"%>
<%@page import="test.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//파라미터로 전달되는 수정할 회원의 번호를 읽어온다.
	int num=Integer.parseInt(request.getParameter("num"));
	//MemberDao 객체를 이용해서 수정할 회원의 정보를 얻어온다.
	MemberDao dao=MemberDao.getInstance();
	MemberDto dto=dao.getData(num);
	//수정할 회원의 정보를 한번 출력해준다.
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/member/updateform.jsp</title>
</head>
<body>
<h3>회원정보 수정 페이지</h3>
<form action="update.jsp" method="post">
	<!-- 클라이언트에게 보이지는 않지만 폼이 전송되었을때 num 이라는 파라미터 명으로
	수정할 회원의 정보를 가지고 갈수 있도록 input type="hidden" 이 필요하다. -->
	<input type="hidden" name="num" value="<%=dto.getNum() %>"/>
	번호 <input type="text" value="<%=dto.getNum() %>" disabled /><br/>
	이름 <input type="text" name="name" value="<%=dto.getName() %>"/><br/>
	주소 <input type="text" name="addr" value="<%=dto.getAddr() %>"/><br/>
	<button type="submit">확인</button>
</form>
</body>
</html>