package test.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
/*
 * 회원정보 추가 폼을 출력해주는 액션
 */
public class MemberInsertformAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, 
			HttpServletResponse response) {
		// 간단한 예제 이므로 수행할 비즈니스 로직은 없다.
		
		return new ActionForward("/views/member/insertform.jsp");
	}

}
