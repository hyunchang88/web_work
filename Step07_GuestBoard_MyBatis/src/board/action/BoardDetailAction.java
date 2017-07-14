package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.controller.Action;
import board.controller.ActionForward;
import board.dao.GuestBoardDao;
import board.dto.GuestBoardDto;


public class BoardDetailAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		int num = Integer.parseInt(request.getParameter("num"));
		GuestBoardDto dto=GuestBoardDao.getInstance().getData(num);
		request.setAttribute("dto", dto);
		return new ActionForward("/views/board/detail.jsp");
	}
	
}
