package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowFortuneServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// 오늘의 문세 목록
		String[] list={"동쪽으로 가면 귀인을 만나요",
				"로또를 사면 좋은 결과가 있을거에요",
				"저녁에 치맥을 먹게 될거에요",
				"다가오는 주말에 이상형을 만나게 되요",
				"집에가는 길에 비를 맞을거에요"};
		// 0 ~ 4 사이의 랜덤한 정수 얻어내기
		int index=new Random().nextInt(5);
		// 오늘의 운세
		String fortune=list[index];
		
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
		pw.println("<title>오늘의 운세 페이지</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h3>오늘의 운세:"+fortune+"</h3>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
}
