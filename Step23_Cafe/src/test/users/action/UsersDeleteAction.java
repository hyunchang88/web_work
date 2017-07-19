package test.users.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.users.dao.UsersDao;

public class UsersDeleteAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 1. 세션에 저장된 아이디 값을 읽어온다.
		String id=(String)request.getSession().getAttribute("id");
		// 2. DB 에서 삭제한다.
		UsersDao.getInstance().delete(id);
		// 3. 세션 초기화
		request.getSession().invalidate();
		// 4. 응답
		request.setAttribute("msg", "회원 탈퇴 처리 되었습니다.");
		request.setAttribute("url", request.getContextPath());
		return new ActionForward("/views/users/alert.jsp");
	}

}
