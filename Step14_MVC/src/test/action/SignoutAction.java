package test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class SignoutAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 로그아웃 처리하는 비즈니스 로직 수행
		request.getSession().invalidate();
		
		// redirect 이동할수 있도록 ActionForward 객체 생성
		ActionForward af = new ActionForward("/index.jsp", true);
		return af;
	}

}
