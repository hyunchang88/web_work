package test.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.member.dao.MemberDao;
import test.member.dto.MemberDto;

public class MemberInsertAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//폼 전송되는 회원의 이름과 주소 읽어오기
		String name=request.getParameter("name");
		String addr=request.getParameter("addr");
		//DB 에 저장하기
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		MemberDao.getInstance().insert(dto);
		//회원 목록 보기로 리다일렉트 이동 할수 있도록 
		return new ActionForward("/member/list.do", true);
	}
	
}











