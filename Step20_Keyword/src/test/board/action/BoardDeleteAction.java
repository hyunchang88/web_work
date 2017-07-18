package test.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.board.dao.BoardDao;
import test.controller.Action;
import test.controller.ActionForward;
/*
 * 파라미터로 전달되는 글번호에 해당되는 글을 삭제하는 메소드
 */
public class BoardDeleteAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		int num=Integer.parseInt(request.getParameter("num"));
		BoardDao.getInstance().delete(num);
		// 글 목록 보기로 리다일렉트
		return new ActionForward("/board/list.do", true);
	}

}
