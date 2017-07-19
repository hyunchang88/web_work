package test.cafe.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class CafeInsertAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 폼 전송되는 파라미터 추출해서 콘솔창에 출력해보기
		String writer=request.getParameter("writer");
		String title=request.getParameter("title");
		String content=request.getParameter("ir1");
		
		System.out.println("작성자:"+writer);
		System.out.println("제목:"+title);
		System.out.println("내용:"+content);
		
		// request 에 content 담아보기
		request.setAttribute("content", content);
		
		return new ActionForward("/views/cafe/result.jsp");
	}

}
