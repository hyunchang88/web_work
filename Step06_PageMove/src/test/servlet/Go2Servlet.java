package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/go2")
public class Go2Servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/go2 요청을 처리 중입니다.");
		
		/*
		 * 리다일렉트 이동하라는 응답하기
		 * 
		 * - 클라이언트에게 새로운 요청을 강요하는 응답 
		 */
		response.sendRedirect("result2.jsp");
	}
}
