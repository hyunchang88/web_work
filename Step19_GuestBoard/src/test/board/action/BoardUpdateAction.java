package test.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.board.dao.BoardDao;
import test.board.dto.BoardDto;
import test.controller.Action;
import test.controller.ActionForward;
/*
 * 폼 전송되는 수정할 글 정보를 추출해서 DB 에 반영하는 액션
 */
public class BoardUpdateAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 1. 파라미터로 전달되는 정보를 추출해서 Dto에 담은 다음
		int num=Integer.parseInt(request.getParameter("num"));
		String title=request.getParameter("title");
		String writer=request.getParameter("writer");
		String content=request.getParameter("content");
		BoardDto dto=new BoardDto();
		dto.setNum(num);
		dto.setTitle(title);
		dto.setWriter(writer);
		dto.setContent(content);
		// 2. Dao 를 이용해서 DB 에 수정반영
		BoardDao.getInstance().update(dto);
		// 3. 목록보기로 리다일렉트 시키는 응답하기
		return new ActionForward("/board/list.do", true);
	}
}
