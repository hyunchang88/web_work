package test.cafe.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class CafeInsertformAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//새글 쓰기 폼 뷰페이지로 forward 이동
		return new ActionForward("/views/cafe/private/insertform.jsp");
	}

}
