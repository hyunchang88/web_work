package test.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.member.dto.MemberDto;
import test.mybatis.SqlMapConfig;

public class MemberDao {
	private static MemberDao dao;
	// MyBatis 를 사용하기 위한 핵심 객체
	private static SqlSessionFactory factory;
	// 생성자
	private MemberDao(){}
	// MemberDao 객체를 리턴해 주는 static 맴버 메소드
	public static MemberDao getInstance(){
		if(dao==null){
			dao=new MemberDao();
			//SqlSessionFactory 객체를 얻어와서 맴버필드에 저장
			factory = SqlMapConfig.getSqlSession();
		}
		return dao;
	}
	
	// 회원 목록을 리턴해주는 메소드
	public List<MemberDto> getList(){
		// 1. SqlSession 객체의 참조값 얻어와서
		SqlSession session=factory.openSession();
		// 2. MemberMapper.xml 문서에 정의된 SELECT 문을 수행 후 결과값을 받아오고
		List<MemberDto> list = session.selectList("member.getList");
		// 3. session 객체 닫아주고
		session.close();
		// 4. 회원목록을 리턴해준다.
		return list;
	}
	// 회원정보를 삭제하는 메소드
	public void delete(int num){
		// SqlSession 객체의 참조값 얻어와서 삭제하기
		SqlSession session=factory.openSession();
		session.delete("member.delete", num);
		session.commit(); // DB 에 실제 반영
		session.close(); // 마무리
	}
	// 회원정보를 저장하는 메소드
	public void insert(MemberDto dto){
		//auto commit 되는 SqlSession 객체 얻어오기
		SqlSession session=factory.openSession(true);
		session.insert("member.insert", dto);
		session.close();
	}
	// 회원 한병의 정보를 리턴해주는 메소드
	public MemberDto getData(int num){
		SqlSession session=factory.openSession();
		MemberDto dto=session.selectOne("member.getData", num);
		session.close();
		return dto;
	}
	//회원 한명의 정보를 수정 반영하는 메소드
	public void update(MemberDto dto){
		SqlSession session=factory.openSession(true);
		session.update("member.update", dto);
		session.close();
	}
}





















