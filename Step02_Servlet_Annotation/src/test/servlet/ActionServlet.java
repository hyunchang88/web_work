package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.gura")
public class ActionServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 요청 uri 문자열 읽어오기
		String uri=request.getRequestURI();
		// context path 읽어오기
		String contextPath=request.getContextPath();
		
		// 응답 인코딩 설정
		response.setCharacterEncoding("utf-8");
		// 응답 컨텐츠 설정
		response.setContentType("text/html;charset-utf-8");
		
		// 클라이언트에게 출력할수 있는 객체의 참조값을 얻어온다.
		PrintWriter pw=response.getWriter();
		// 클라이언트에게 html 형식의 문자열 응답하기
		pw.println("<!doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8'/>");
		pw.println("<title>서블릿 테스트</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("ActionServlet 에서 출력합니다.");
		pw.println("<p>요청 uri:"+uri+"</p>");
		pw.println("<p>요청 context name:"+contextPath+"</p>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
}
