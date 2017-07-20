package test.cafe.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.cafe.dao.CafeCommentDao;
import test.cafe.dao.CafeDao;
import test.cafe.dto.CafeCommentDto;
import test.cafe.dto.CafeDto;
import test.controller.Action;
import test.controller.ActionForward;

public class CafeDetailAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//1. 파라미터로 전달되는 글번호를 읽어온다.
		int num=Integer.parseInt(request.getParameter("num"));
		//2. 조회수를 1 올린다.
		CafeDao.getInstance().increaseViewCount(num);
		//3. 글번호에 해당되는 글정보를 얻어온다.
		CafeDto dto=CafeDao.getInstance().getData(num);
		//4. 글번호에 해당되는 덧글 목록을 얻어온다.
		List<CafeCommentDto> commentList=
				CafeCommentDao.getInstance().getList(num);
		
		//5. request 에 글정보와 덧글 목록을 담는다.
		request.setAttribute("dto", dto);
		request.setAttribute("commentList", commentList);
		String id = (String)request.getSession().getAttribute("id");
		boolean isLogin=false;
		if(id != null){
			isLogin=true;
		}
		//로그인 했는지 여부도 request 에 담는다.
		request.setAttribute("isLogin", isLogin);
		//5. 뷰페이지로 forward 이동해서 글정보를 응답한다.
		return new ActionForward("/views/cafe/detail.jsp");
	}

}











