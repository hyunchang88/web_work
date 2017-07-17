package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.GuestBoardDao;
import controller.Action;
import controller.ActionForward;

public class BoardDeleteAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		
		int num=Integer.parseInt(request.getParameter("num"));
		GuestBoardDao.getInstance().delete(num);
		return new ActionForward("/board/list.do",true);
	}

}
