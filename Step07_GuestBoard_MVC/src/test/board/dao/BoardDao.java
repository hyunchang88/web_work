package test.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.board.dto.BoardDto;
import test.util.DbcpBean;

public class BoardDao {
	// 자신의 객체를 저장할수 있는 static 맴버필드
	private static BoardDao dao;
	// 외부에서 객체 생성할수 없도록
	private BoardDao(){}
	// 참조값을 리턴해주는 static 맴버 메소드
	public static BoardDao getInstance(){
		if(dao==null){
			dao=new BoardDao();
		}
		return dao;
	}
	// 새글을 DB에 저장하는 메소드
	public boolean insert(BoardDto dto){
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try{
			// connection 객체의 참조값 얻어오기
			conn=new DbcpBean().getConn();
			String sql="INSERT INTO board_guest "
					+"(num,writer,title,content,regdate) "
					+"VALUES(board_guest_seq.NEXTVAL,?,?,?,SYSDATE)";
			pstmt=conn.prepareStatement(sql);
			// ? 에 값 바인딩하기
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContent());
			// sql 문 수행하기
			flag=pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				//Connection 객체의 .close() 메소드 호출하면
				//Connection 객체가 알아서 Pool 에 반납된다.
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}
		if(flag>0){
			return true; // 작업 성공
		}else{
			return false; // 작업 실패
		}
	}// insert()
	
	// 글목록을 리턴해주는 메소드
	public List<BoardDto> getList(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<BoardDto> list=new ArrayList<BoardDto>();
		try{
			conn=new DbcpBean().getConn();
			String sql="SELECT num,writer,title,"
					+ "TO_CHAR(regdate,'YYYY.MM.DD') regdate"
					+" FROM board_guest"
					+" ORDER BY num DESC"; // 글번호(or regdate)에 대해서 내림차순 하면 최신글이 가장 위에 있어
			pstmt=conn.prepareStatement(sql);
			// SQL 문 수행하고 결과셋 받아오기
			rs=pstmt.executeQuery();
			while(rs.next()){
				int num=rs.getInt("num");
				String writer=rs.getString("writer");
				String title=rs.getString("title");
				String regdate=rs.getString("regdate");
				// 글 정보를 BoardDto 에 담아서
				BoardDto dto=new BoardDto();
				dto.setNum(num);
				dto.setWriter(writer);
				dto.setTitle(title);
				dto.setRegdate(regdate);
				// List<BoardDto> 객체에 저장한다.
				list.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}
		// 글 목록을 리턴해 준다.
		return list;
	}// getList()
	
	// 인자로 전달되는 번호에 해당하는 글 정보를 리턴해주는 메소드
	public BoardDto getData(int num){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		BoardDto dto=null;
		try{
			conn=new DbcpBean().getConn();
			String sql="SELECT writer,title,content,regdate "
					+"FROM board_guest WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			//?에 값 바인딩하기
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()){
				String writer=rs.getString("writer");
				String title=rs.getString("title");
				String content=rs.getString("content");
				String regdate=rs.getString("regdate");
				// 글 정보를 BoardDto에 담기
				dto= new BoardDto(num, writer, title, content, regdate);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}//try
		//글 정보가 담긴 BoardDto 객체를 리턴해 준다.
		return dto;
	}// getData()
	
	// 글정보를 수정하는 메소드
	public boolean update(BoardDto dto){
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try{
			conn=new DbcpBean().getConn();
			String sql="UPDATE board_guest "
					+"SET writer=?,title=?,content=? "
					+"WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContent());
			pstmt.setInt(4,	dto.getNum());
			flag=pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}//try
		
		if(flag>0){
			return true;
		}else{
			return false;
		}
	}//update()
	
	//인자로 전달되는 글번호를 이용해서 해당 글을 삭제하는 메소드
	public boolean delete(int num){
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try{
			conn=new DbcpBean().getConn();
			String sql="DELETE FROM board_guest WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			flag=pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}//try
		if(flag>0){
			return true;
		}else{
			return false;
		}
	}// delete()
	
	
}// class











