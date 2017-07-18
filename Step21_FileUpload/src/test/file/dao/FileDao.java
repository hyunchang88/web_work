package test.file.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.file.dto.FileDto;
import test.mybatis.SqlMapConfig;

public class FileDao {
	private static FileDao dao;
	private static SqlSessionFactory factory;
	private FileDao(){}
	public static FileDao getInstance(){
		if(dao==null){
			dao=new FileDao();
			factory = SqlMapConfig.getSqlSession();
		}
		return dao;
	}
	
	// 파일 목록을 리턴해 주는 메소드
	public List<FileDto> getList(){
		SqlSession session=factory.openSession();
		List<FileDto> list = session.selectList("file.getList");
		session.close();
		return list;
	}
}
