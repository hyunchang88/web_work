package test.users.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class SignoutAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 로그아웃 처리
		request.getSession().invalidate();
		request.setAttribute("msg", "로그 아웃 되었습니다.");
		request.setAttribute("url", request.getContextPath());
		return new ActionForward("/views/users/alert.jsp");
	}

}
