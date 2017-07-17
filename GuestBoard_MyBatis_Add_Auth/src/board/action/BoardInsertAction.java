package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.GuestBoardDao;
import board.dto.GuestBoardDto;
import controller.Action;
import controller.ActionForward;

public class BoardInsertAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		String title=request.getParameter("title");
		String writer=request.getParameter("writer");
		String content=request.getParameter("content");
		GuestBoardDto dto=new GuestBoardDto();
		dto.setTitle(title);
		dto.setWriter(writer);
		dto.setContent(content);
		
		GuestBoardDao.getInstance().insert(dto);
		
		request.setAttribute("msg", "방명록을 저장했습니다.");
		
		return new ActionForward("/views/board/alert.jsp");
	}
	
}
