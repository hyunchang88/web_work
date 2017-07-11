package test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class SigninAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 로그인 처리를 하는 비즈니스 로직 수행
		String id=request.getParameter("id");
		request.getSession().setAttribute("id", id);
		
		// redirect 이동하도록 ActionForward 객체 생성
		ActionForward af=new ActionForward("/index.jsp");
		af.setRedirect(true);
		// ActionForward 객체 리턴해주기
		return af;
	}

}
