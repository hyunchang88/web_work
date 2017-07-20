package test.cafe.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.cafe.dto.CafeDto;
import test.mybatis.SqlMapConfig;

public class CafeDao {
	private static CafeDao dao;
	private static SqlSessionFactory factory;
	private CafeDao(){}
	public static CafeDao getInstance(){
		if(dao==null){
			dao=new CafeDao();
			factory=SqlMapConfig.getSqlSession();
		}
		return dao;
	}
	//글목록을 리턴해주는 메소드
	public List<CafeDto> getList(){
		SqlSession session=factory.openSession();
		
		List<CafeDto> list=null;
		try{
			list=session.selectList("cafe.getList");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return list;
	}
	
	//글정보 저장하는 메소드
	public void insert(CafeDto dto){
		//auto commit 되는 SqlSession 객체 얻어오기 
		SqlSession session=factory.openSession(true);
		
		try{
			session.insert("cafe.insert", dto);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	//글정보를 리턴해주는 메소드
	public CafeDto getData(int num){
		SqlSession session=factory.openSession();
		CafeDto dto=null;
		try{
			dto=session.selectOne("cafe.getData", num);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return dto;
	}
	
	//조회수를 1 증가 시키는 메소드
	public void increaseViewCount(int num){
		//auto commit 되는 SqlSession 객체의 참조값 얻어오기 
		SqlSession session = factory.openSession(true);
		try{
			session.update("cafe.increaseViewCount", num);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	
	public void update(CafeDto dto){
		SqlSession session=factory.openSession(true);
		try{
			session.update("cafe.update", dto);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	
	public void delete(int num){
		SqlSession session=factory.openSession(true);
		try{
			session.update("cafe.delete", num);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
}
