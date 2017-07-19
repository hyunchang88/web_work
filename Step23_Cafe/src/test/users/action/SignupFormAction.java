package test.users.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class SignupFormAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 회원 가입 폼을 제공하는 뷰 페이지로 forward 이동
		return new ActionForward("/views/users/signup_form.jsp");
	}

}
