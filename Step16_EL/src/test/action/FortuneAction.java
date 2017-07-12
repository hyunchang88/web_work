package test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class FortuneAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 오늘의 운세를 얻어오는 비즈니스 로직 수행
		String fortuneToday="동쪽으로 가면 귀인을 만나요";
		// request 영역에 모델을 담고
		request.setAttribute("fortuneToday", fortuneToday);
		// forward 이동
		return new ActionForward("/views/fortune.jsp");
	}
	
}
