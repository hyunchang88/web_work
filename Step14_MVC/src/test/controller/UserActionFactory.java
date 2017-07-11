package test.controller;

import test.action.FortuneAction;
import test.action.InfoAction;
import test.action.SigninAction;
import test.action.SignoutAction;

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
	
	// 인자로 전달되는 command 를 수행할 추상클래스 type인 Action class 객체를 리턴해주는 메소드
	public Action action(String command){
		//Action 추상클래스 type 을 담을 지역변수 만들기
		Action action=null;
		if(command.equals("/fortune")){
			action = new FortuneAction();
		}else if(command.equals("/info")){
			action = new InfoAction();
		}else if(command.equals("/signin")){
			action = new SigninAction();
		}else if(command.equals("/signout")){
			action = new SignoutAction();
		}
		return action;
	}
}
