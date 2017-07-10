package test.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.board.dto.ImageDto;
import test.util.DbcpBean;

public class ImageDao {
	private static ImageDao dao;
	private ImageDao(){}
	public static ImageDao getInstance(){
		if(dao==null){
			dao=new ImageDao();
		}
		return dao;
	}
	//이미지 정보를 저장하는 메소드 
	public boolean insert(ImageDto dto){
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			conn = new DbcpBean().getConn();
			String sql = "INSERT INTO board_image "
					+ "(num,name,imgSrc,regdate)"
					+ " VALUES(board_image_seq.NEXTVAL,?,?,SYSDATE)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getImgSrc());
			flag = pstmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		if (flag > 0) {
			return true;
		} else {
			return false;
		}
		
	}
	//이미지 정보를 삭제하는 메소드 
	public boolean delete(int num){
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			conn = new DbcpBean().getConn();
			String sql = "DELETE FROM board_image WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			flag = pstmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		if (flag > 0) {
			return true;
		} else {
			return false;
		}
	}
	//이미지 목록을 리턴해주는 메소드 
	public List<ImageDto> getList(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//ImageDto 객체를 담을 ArrayList 객체
		List<ImageDto> list=new ArrayList<ImageDto>();
		try {
			conn = new DbcpBean().getConn();
			String sql = "SELECT num,name,imgSrc,regdate "
					+ "FROM board_image "
					+ "ORDER BY num DESC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ImageDto dto=new ImageDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setImgSrc(rs.getString("imgSrc"));
				dto.setRegdate(rs.getString("regdate"));
				list.add(dto);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return list;
	}
	//이미지 한개의 정보를 리턴해 주는 메소드 
	public ImageDto getData(int num){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ImageDto dto=null;
		try {
			conn = new DbcpBean().getConn();
			String sql = "SELECT name,imgSrc,regdate "
					+ "FROM board_image "
					+ "WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto=new ImageDto();
				dto.setNum(num);
				dto.setName(rs.getString("name"));
				dto.setImgSrc(rs.getString("imgSrc"));
				dto.setRegdate(rs.getString("regdate"));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return dto;
	}
}










