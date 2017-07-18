package test.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.security.jca.GetInstance;
import test.board.dao.BoardDao;
import test.board.dto.BoardDto;
import test.controller.Action;
import test.controller.ActionForward;
/*
 * 파라미터로 전달되는 글번호를 수정할 폼을 제공하는 액션
 */
public class BoardUpdateformAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 1. 글 번호를 읽어온다.
		int num=Integer.parseInt(request.getParameter("num"));
		BoardDto dto=new BoardDto();
		dto.setNum(num);
		// 2. DB 에서 해당글의 정보를 얻어온다.
		BoardDto resultDto=BoardDao.getInstance().getData(dto);
		// 3. request 에 담고
		request.setAttribute("dto", dto);
		// 4. 뷰 페이지로 forward 이동
		return new ActionForward("/views/board/updateform.jsp");
	}

}
