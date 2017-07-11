package test.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do") // mapping - .do 로 끝나는 모든 요청에 응답하는 servlet
public class ActionServlet extends HttpServlet{
   
   public static final int INCLUDE_EXTENSION_LENGTH=3;
   // . 을 포함한 요청 확장자의 길이 (여기서는 .do 이므로 3)
      
   @Override
   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      String uri=request.getRequestURI();
      // 요청 URI 읽어오기
      String contextName=request.getContextPath();
      // context name 읽어오기
      String command=uri.substring(contextName.length(), uri.length()-INCLUDE_EXTENSION_LENGTH);
      // 순수 요청 경로를 추출 한다.(context 와 .do 를 제외한 요청)
      // command => /fortune , /info , /signin or /signout
            
      Action action=UserActionFactory.getInstance().action(command);
      // 해당 command 를 수행할 Action 객체를 팩토리로 부터 얻어온다. 
      
      if(action != null){ // 처리 가능한 command 라면 
         ActionForward af=null;
         try{
            af=action.execute(request, response);
         }catch(Exception e){
            e.printStackTrace();
            return;
         }
         if(af.isRedirect()){ // redirect 이동해야 한다면
            response.sendRedirect(contextName+af.getPath());
            // redirect 이동 시킨다.
            
         }else{ // forward 이동해야 한다면 
            RequestDispatcher rd=
                  request.getRequestDispatcher(af.getPath());
            rd.forward(request, response);
         }
      }
   }
}