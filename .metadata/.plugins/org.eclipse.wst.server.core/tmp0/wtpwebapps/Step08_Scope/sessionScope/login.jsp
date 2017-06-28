<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 1. 폼전송된 아이디와 비밀번호를 읽어온다.
	String id=request.getParameter("id");
	String pwd=request.getParameter("pwd");
	
	// 2. Dao 를 이용해서 유요한 정보인지 확인한다.
	boolean isValid=false;
	if(id.equals("gura") && pwd.equals("1234")){// 가상으로 확인
		isValid=true;
	}
	
	// 3. 만일 유효한 정보라면 로그인 했다는 의미에서
	// session 영역에 특정 정보를 저장한다.
	if(isValid){
		session.setAttribute("id", id);
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login.jsp</title>
</head>
<body>
<%if(isValid){ %>
	<script>
		alert("<%=id%> 회원님 로그인 되었습니다.");
		location.href="login_result.jsp";
	</script>
<%}else{ %>
	<script>
		alert("아이디 혹은 비밀번호가 틀려요.");
		location.href="loginform.jsp";
	</script>
<%} %>
</body>
</html>