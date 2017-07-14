package board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.controller.Action;
import board.controller.ActionForward;
import board.dao.GuestBoardDao;
import board.dto.GuestBoardDto;

public class BoardListAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		List<GuestBoardDto> list = GuestBoardDao.getInstance().getList();
		request.setAttribute("list", list);
		return new ActionForward("/views/board/list.jsp");
	}
	
}
