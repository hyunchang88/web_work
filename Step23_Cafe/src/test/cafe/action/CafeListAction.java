package test.cafe.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.cafe.dao.CafeDao;
import test.cafe.dto.CafeDto;
import test.controller.Action;
import test.controller.ActionForward;

public class CafeListAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//1. 카페 글 목록을 읽어온다.
		List<CafeDto> list=CafeDao.getInstance().getList();
		//2. request 에 담는다
		request.setAttribute("list", list);
		//3. 뷰페이지로 forward 이동 해서 글 목록 출력하기
		return new ActionForward("/views/cafe/list.jsp");
	}

}















