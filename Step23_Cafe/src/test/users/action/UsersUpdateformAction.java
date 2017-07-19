package test.users.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.users.dao.UsersDao;
import test.users.dto.UsersDto;

public class UsersUpdateformAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 세션에 담긴 아이디 정보를 읽어온다.
		String id=(String)request.getSession().getAttribute("id");
		// 회원 정보를 읽어온다.
		UsersDto dto=UsersDao.getInstance().getData(id);
		// request 에 담는다.
		request.setAttribute("dto", dto);
		
		return new ActionForward("/views/users/private/updateform.jsp");
	}

}
