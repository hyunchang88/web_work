package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Action;
import controller.ActionForward;

public class HomeAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		
		String id=(String)request.getSession().getAttribute("id");
		
		if(id==null){
			request.setAttribute("msg", "로그인이 안되어 있습니다.");
		}else{
			request.setAttribute("msg", id+" 회원님 로그인 중 ...");
		}
		
		// index 페이지를 출력할 뷰 페이지로 forward 이동
		return new ActionForward("/views/home.jsp");
	}
	
}
