package users.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Action;
import controller.ActionForward;
import users.dao.UsersDao;
import users.dto.UsersDto;

public class UsersSignupAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		UsersDto dto = new UsersDto();
		dto.setId(id);
		dto.setPwd(pwd);
		dto.setEmail(email);
		
		UsersDao.getInstance().signup(dto);
		
		request.setAttribute("msg", "회원가입이 완료 되었습니다.");
		return new ActionForward("/views/users/alert.jsp");
	}

}
