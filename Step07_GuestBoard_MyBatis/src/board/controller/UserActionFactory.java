package board.controller;

import board.action.BoardDeleteAction;
import board.action.BoardDetailAction;
import board.action.BoardInsertAction;
import board.action.BoardInsertFormAction;
import board.action.BoardListAction;
import board.action.BoardUpdateAction;
import board.action.BoardUpdateFormAction;

public class UserActionFactory {
	private static UserActionFactory factory;
	private UserActionFactory(){}
	//자신의 참조값을 리턴해주는 메소드
	public static UserActionFactory getInstance(){
		if(factory==null){
			factory=new UserActionFactory();
		}
		return factory;
	}
	
	//인자로 전달되는 command 를 수행할 Action type 객체를 리턴해주는 
	//메소드
	public Action action(String command){
		//Action 추상클래스 type 을 담을 지역변수 만들기 
		Action action=null;
		if(command.equals("/board/list")){
			action=new BoardListAction();
		}else if(command.equals("/board/detail")){
			action=new BoardDetailAction();
		}else if(command.equals("/board/updateform")){
			action=new BoardUpdateFormAction();
		}else if(command.equals("/board/update")){
			action=new BoardUpdateAction();
		}else if(command.equals("/board/delete")){
			action=new BoardDeleteAction();
		}else if(command.equals("/board/insertform")){
			action=new BoardInsertFormAction();
		}else if(command.equals("/board/insert")){
			action=new BoardInsertAction();
		}
		return action;
	}
}

