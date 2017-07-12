package test.member.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.member.dao.MemberDao;
import test.member.dto.MemberDto;

public class MemberListAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//회원목록을 얻어온다.
		List<MemberDto> list=MemberDao.getInstance().getList();
		//모델을 request 에 담는다.
		request.setAttribute("list", list);
		//view 페이지로 forward 이동되도록...
		ActionForward af=new ActionForward("/views/member/list.jsp");
		
		return af;
	}

}

















