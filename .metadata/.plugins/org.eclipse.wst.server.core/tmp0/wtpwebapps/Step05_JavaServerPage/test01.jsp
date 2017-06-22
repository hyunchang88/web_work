<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test01.jsp</title>
</head>
<body>
<%
	// 여기는 서블릿의 service() 메소드 안쪽이라고 생각하면 됩니다.
	int num=1;
	String name="김구라";
	String addr="노량진";
%>
<p> 번호 : <strong><%out.write(Integer.toString(num));%></strong></p>
<p> 이름 : <strong><%out.write(name);%></strong></p>
<p> 주소 : <strong><%out.write(addr);%></strong></p>
<hr/>
<p> 번호 : <strong><%=num %></strong></p>
<p> 이름 : <strong><%=name %></strong></p>
<p> 주소 : <strong><%=addr %></strong></p>
</body>
</html>