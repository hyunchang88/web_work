package test.file.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.file.dao.FileDao;
import test.file.dto.FileDto;
/*
 * 파라미터로 전달되는 번호에 해당하는 파일을 다운로드 시켜주는 액션
 * 
 */
public class DownloadAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		int num=Integer.parseInt(request.getParameter("num"));
		//Dao 를 이용해서 다운로드 시켜줄 파일의 정보를 얻어온다.
		FileDto dto=FileDao.getInstance().getData(num);
		// request 에 파일 정보를 담고
		request.setAttribute("dto", dto);
		// 다운로드 시켜주는 뷰 페이지로 forward 이동 시킨다.
		return new ActionForward("/views/file/download.jsp");
	}

}
