package test.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test/go10")
public class Go10Servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("test/go10 요청 처리중...");
		
		//forward 이동을 하면서 전달할 데이터가 있으면 request 에 담는다.
		request.setAttribute("myName", "박현창");
		
		// 요청 전달자 객체의 참조값 얻어오기		
		RequestDispatcher rd=
				request.getRequestDispatcher("/test/view3.jsp"); // 절대경로
		// view3.jsp 페이지에 응답을 위임한다.
		rd.forward(request, response);
	}
}
