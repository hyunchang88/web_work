package test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.dto.MemberDto;

public class InfoAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 비지니스 로직 수행후 얻어낸 모델
		MemberDto dto=new MemberDto(2,"해골","행신동");
		// 모델을 request 에 담는다.
		request.setAttribute("dto", dto);
		// forward 이동할수 있는 ActionForward 객체 생성
		ActionForward af=new ActionForward("/views/info.jsp");
		// ActionForward 객체 리턴해주기
		return af;
	}
}
