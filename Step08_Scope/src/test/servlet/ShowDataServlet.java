package test.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestScope/showdata")
public class ShowDataServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// GET 방식으로 전송되는 파라미터를 추출한다.
		int num=Integer.parseInt(request.getParameter("num"));
		
		// DB 에서 번호에 해당하는 정보를 읽어온다.
		Map<String, String> map=new HashMap<>();
		map.put("name", "김구라");
		map.put("addr", "노량진");
		
		// request 영역에 담는다.
		request.setAttribute("map", map);
		// forward 방식으로 이동한다.
		RequestDispatcher rd=
				request.getRequestDispatcher("/requestScope/showdata.jsp");
		rd.forward(request, response);
	}
}
