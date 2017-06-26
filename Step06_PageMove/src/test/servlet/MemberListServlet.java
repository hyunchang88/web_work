package test.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dto.MemberDto;

@WebServlet("/member/list")
public class MemberListServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		//DB 에서 회원 목록을 얻어온다.
		MemberDto dto1=new MemberDto(1, "김구라", "노량진");
		MemberDto dto2=new MemberDto(2, "해골", "행신동");
		MemberDto dto3=new MemberDto(3, "원숭이", "상도동");
		List<MemberDto> list=new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		
		//1. request 에 list 라는 키값으로 회원 목록을 답는다.
		request.setAttribute("list", list);
		//2. /member/list.jsp 페이지로 forward 이동해서
		// 회원 목록을 table 마크업을 이용해서 출력해 보세요.
		RequestDispatcher rd=
				request.getRequestDispatcher("/member/list.jsp");
		rd.forward(request, response);
		
	}
}

