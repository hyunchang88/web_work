package test.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class BoardInsertformAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 여기서 수행할 비즈니스 로직은 현재 없습니다.
		
		// 새글 작성 폼 페이지로 forward 이동하기
		return new ActionForward("/views/board/insertform.jsp");
	}

}
