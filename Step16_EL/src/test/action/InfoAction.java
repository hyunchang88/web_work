package test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.member.dto.MemberDto;

public class InfoAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 회원정보를 얻어오는 비즈니스 로직 수행
		MemberDto dto=new MemberDto(1, "김구라", "노량진");
		// request 영역에 "dto" 라는 키 값으로 담고
		request.setAttribute("dto", dto);
		// forward 이동
		return new ActionForward("/views/info.jsp");
	}
	
}
