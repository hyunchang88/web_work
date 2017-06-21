package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *  [ 서블릿 클래스 만드는 방법  ]
 *  
 *  1. HttpServlet 클래스를 상속 받는다.
 *  2. service() 메소드를 오버라이딩한다.
 *  3. Annotation 으로 맵핑한다.
 */

//3.
@WebServlet("/test")
public class TestServlet extends HttpServlet{//1.
	//2.
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 요청 메소드를 읽어온다.
		String method=request.getMethod();
		// 콘솔에 출력
		System.out.println("method:"+method);
		
		// 전송된 파라미터 추출해 보기
		String num=request.getParameter("num");
		String name=request.getParameter("name");
		// 콘솔에 출력
		System.out.println(num+"/"+name);
		
		// 클라이언트에게 출력할 수 있는 객체의 참조값 얻어오기
		PrintWriter pw=response.getWriter();
		// 간단한 문자열 응답하기
		pw.println("method:"+method);
		pw.println("ok");
		pw.close();
	}
}
