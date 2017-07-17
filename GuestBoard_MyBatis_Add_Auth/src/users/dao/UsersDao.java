package users.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlMapConfig;
import users.dto.UsersDto;

public class UsersDao {
	private static UsersDao dao;
	private static SqlSessionFactory factory;
	private UsersDao(){}
	public static UsersDao getInstance(){
		if(dao==null){
			dao=new UsersDao();
			factory = SqlMapConfig.getSqlSession();
		}
		return dao;
	}
	// 회원가입 정보 저장하는 메소드
	public void signup(UsersDto dto){
		SqlSession session=factory.openSession(true);
		session.insert("Auth.signup",dto);
		session.close();
	}
	
}
