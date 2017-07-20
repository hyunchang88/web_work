package test.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.member.dao.MemberDao;
import test.member.dto.MemberDto;
/*
 * 파라미터로 전달되는 회원정보를 저장하는 액션
 */
public class MemberInsertAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 1. 파라미터로 전달되는 회원정보를 읽어와서
		String name=request.getParameter("name");
		String addr=request.getParameter("addr");
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		// 2. DB에 저장하고
		MemberDao.getInstance().insert(dto);
		// 3. 응답한다.
		request.setAttribute("msg", "회원정보를 저장했습니다.");
		return new ActionForward("/views/member/alert.jsp");
	}
	
}