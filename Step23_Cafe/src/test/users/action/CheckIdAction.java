package test.users.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.users.dao.UsersDao;
/*
 * Ajax 요청으로 전송되는 파라미터를 추출해서 사용할수 있는
 * 아이디인지 여부를 응답하는 액션
 */
public class CheckIdAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 1. ajax 전송 아이디 읽어오기
		String id=request.getParameter("inputId");
		// 2. 사용 가능 여부를 boolean type 으로 Dao 객체로 부터 리턴 받기
		boolean canUse=UsersDao.getInstance().canUseId(id);
		// 3. request 에 담고
		request.setAttribute("canUse", canUse);
		// 4. JSON 문자열을 응답하기 위해 뷰 페이지로 forward 이동
		return new ActionForward("/views/users/checkid.jsp");
	}

}
