package users.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Action;
import controller.ActionForward;
import users.dao.UsersDao;
import users.dto.UsersDto;

public class UsersSignupFormAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
						
		return new ActionForward("/views/users/signupform.jsp");
	}

}
