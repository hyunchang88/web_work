package test.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dto.MemberDto;

@WebServlet("/member/detail")
public class MemberDetailServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		// DB 에서 불러온 회원 한명의 정보라고 가정하자
		MemberDto dto=new MemberDto(1, "김구라", "노량진");
		
		// 1. request 에 회원 정보를 담고
		request.setAttribute("dto", dto);
		// 2. forward 이동( 응답을 위임 ) 한다.
		RequestDispatcher rd=
				request.getRequestDispatcher("/member/detail.jsp");
		rd.forward(request, response);
	}
}
