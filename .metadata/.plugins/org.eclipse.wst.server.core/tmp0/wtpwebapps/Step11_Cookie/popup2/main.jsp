<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>popup2/main.jsp</title>
</head>
<body>
<%
	//팝업창을 띄울지에 대한 여부
	boolean canPopup=true;
	Cookie[] cookies=request.getCookies();
	for(Cookie tmp:cookies){
		// popup 이라는 키값으로 저장된 쿠키가 존재하면
		if(tmp.getName().equals("popup")){
			// 팝업을 띄우지 않도록 설정
			canPopup=false;
		}
	}
%>
<%if(canPopup){ %>
<script>
	window.open("popup_page.jsp","팝업","width=500,height=500,top=100,left=100");
</script>
<%} %>
<h3>메인 페이지 입니다.</h3>
<p>Gura 홈쇼핑</p>
<p>여름을 미리 준비 하세요~</p>
</body>
</html>