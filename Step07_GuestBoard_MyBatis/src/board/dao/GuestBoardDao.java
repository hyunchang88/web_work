package board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import board.dto.GuestBoardDto;
import board.mybatis.SqlMapConfig;

public class GuestBoardDao {
	private static GuestBoardDao dao;
	private static SqlSessionFactory factory;
	private GuestBoardDao(){}
	public static GuestBoardDao getInstance(){
		if(dao==null){
			dao=new GuestBoardDao();
			factory = SqlMapConfig.getSqlSession();
		}
		return dao;
	}
	
	// 방명록을 리턴해 주는 메소드
	public List<GuestBoardDto> getList(){
		SqlSession session=factory.openSession();
		List<GuestBoardDto> list = session.selectList("board.getList");
		session.close();
		return list;
	}
	// 회원 한명의 정보를 리턴해 주는 메소드
	public GuestBoardDto getData(int num){
		SqlSession session=factory.openSession();
		GuestBoardDto dto=session.selectOne("board.getData", num);
		session.close();
		return dto;
	}
	// 수정 반영하는 메소드
	public void update(GuestBoardDto dto){
		SqlSession session=factory.openSession(true);
		session.update("board.update",dto);
		session.close();
	}
	// 삭제하는 메소드
	public void delete(int num){
		SqlSession session=factory.openSession(true);
		session.delete("board.delete", num);
		session.close();
	}
	// 삽입하는 메소드
	public void insert(GuestBoardDto dto){
		SqlSession session=factory.openSession(true);
		session.insert("board.insert", dto);
		session.close();
	}
	
	
}
