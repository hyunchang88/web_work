package test.board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.board.dao.BoardDao;
import test.board.dto.BoardDto;
import test.controller.Action;
import test.controller.ActionForward;

public class BoardListAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 게시판 목록을 얻어온다.
		List<BoardDto> list=BoardDao.getInstance().getList();
		// 모델을 request 에 담는다.
		request.setAttribute("list", list);
		// view 페이지로 forward 이동 되도록...
		ActionForward af=new ActionForward("/views/border/list.jsp");
		return af;
	}

}
