package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.FriendsDto;
import test.util.DBConnect;

/*
 *  Dao => Data Access Object 
 *  
 *  - 회원정보에 대해서  SELECT, INSERT, UPDATE, DELETE 작업을 수행할
 *    객체를 생성하기 위한 클래스 정의하기
 *  - Application 전역에서 MemberDao 객체는 오직1개만 생성될수 있도록
 *    설계한다. 
 */
public class FriendsDao {
   //1. 자신의 Type 을 private static 맴버필드로 정의한다.
   private static FriendsDao dao;
   //2. 외부에서 객체 생성할수 없도록 생성자의 접근 지정자를 private로 지정
   private FriendsDao(){}
   //3. 자신의 참조값을 리턴해주는 static 멤버 메소드를 정의한다.
   public static FriendsDao getInstance(){
      if(dao==null){//최초 호출될때는 null 임으로
         dao=new FriendsDao(); //객체를 생성해서 필드에 저장한다.
      }
      //필드에 저장된 참조값을 리턴해준다.
      return dao;
   }
   
   //인자로 전달된 번호에 해당하는 회원정보를 리턴해주는 메소드
   public FriendsDto getData(int num){
	   Connection conn=null;
	   PreparedStatement pstmt=null;
	   ResultSet rs=null;
	   FriendsDto dto=null;
	   try{
		   conn=new DBConnect().getConn();
		   String sql="SELECT name,phone,email FROM friends WHERE num=?";
		   pstmt=conn.prepareStatement(sql);
		   pstmt.setInt(1, num);
		   //SELECT 문 수행하고 결과값을 ResultSet 으로 받아오기
		   rs=pstmt.executeQuery();
		   //SELECT 된 결과가 있다면 cursor 를 한칸 내려서
		   if(rs.next()){
			   //커서가 위치한 곳의 정보를 읽어온다.
			   String name=rs.getString("name");
			   String phone=rs.getString("phone");
			   String email=rs.getString("email");
			   //MemberDto 객체를 생성해서 담는다.
			   dto=new FriendsDto(num, name, phone, email);
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
	   // 회원 한명의 정보가 담겨 있는 MemberDto 객체를 리턴해준다.
	   return dto;
   }
   
   //회원정보 저장
   public boolean insert(FriendsDto dto){
      Connection conn=null;
      PreparedStatement pstmt=null;
      int flag=0;
      try{
         conn=new DBConnect().getConn();
         //실행할 sql 문 준비하기
         String sql="INSERT INTO friends (num,name,phone,email) "
               + "VALUES(friends_seq.NEXTVAL, ?, ?, ?)";
         pstmt=conn.prepareStatement(sql);
         //? 에 값 바인딩하기
         pstmt.setString(1, dto.getName());
         pstmt.setString(2, dto.getPhone());
         pstmt.setString(3, dto.getEmail());
         //sql 문 수행하기
         flag=pstmt.executeUpdate();
      }catch(Exception e){
         e.printStackTrace();
      }finally{
         try{
            if(pstmt!=null)pstmt.close();
            if(conn!=null)conn.close();
         }catch(Exception e){}
      }
      if(flag>0){//작업이 성공이면 
         return true;
      }else{//작업이 실패면 
         return false;
      }
   }// insert()
   
   //회원정보 수정
   public boolean update(FriendsDto dto){
	   Connection conn=null;
	   PreparedStatement pstmt=null;
	   int flag=0;
	   try{
		   conn=new DBConnect().getConn();
		   String sql="UPDATE friends SET name=?,phone=?,email=? WHERE num=?";
		   pstmt=conn.prepareStatement(sql);
		   //? 에 수정할 회원의 정보 바인딩하기
		   pstmt.setString(1, dto.getName());
		   pstmt.setString(2, dto.getPhone());
		   pstmt.setString(3, dto.getEmail());
		   pstmt.setInt(4, dto.getNum());
		   flag=pstmt.executeUpdate();
	   }catch(Exception e){
		   e.printStackTrace();
	   }finally{
		   try{
			   if(pstmt!=null)pstmt.close();
			   if(conn!=null)conn.close();
		   }catch(Exception e){}
	   }
	   if(flag>0){
		   return true;
	   }else{
		   return false;
	   }
   }
   //회원정보 삭제
   public boolean delete(int num){
	   Connection conn=null;
	   PreparedStatement pstmt=null;
	   int flag=0;
	   try{
		   conn=new DBConnect().getConn();
		   String sql="DELETE FROM friends WHERE num=?";
		   pstmt=conn.prepareStatement(sql);
		   // ? 에 삭제할 회원의 번호를 바인딩 한다.
		   pstmt.setInt(1, num);
		   //삭제하기
		   flag=pstmt.executeUpdate();
	   }catch(Exception e){
		   e.printStackTrace();
	   }finally{
		  try{
			  if(pstmt!=null)pstmt.close();
			  if(conn!=null)conn.close();
		  }catch(Exception e){}
	   }
	   if(flag>0){
		   return true;
	   }else{
		   return false;
	   }
   }
   //회원목록 리턴
   public List<FriendsDto> getList(){
      //필요한 객체를 담을 지역변수 만들기
      Connection conn=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null;
      //회원목록을 담을 객체 생성
      List<FriendsDto> list=new ArrayList<>();
      try{
         conn=new DBConnect().getConn();
         String sql="SELECT num,name,phone,email FROM friends "
               + "ORDER BY num ASC";
         pstmt=conn.prepareStatement(sql);
         //sql 문 수행하고 결과셋 받아오기
         rs=pstmt.executeQuery();
         while(rs.next()){
            int num=rs.getInt("num");
            String name=rs.getString("name");
            String phone=rs.getString("phone");
            String email=rs.getString("email");
            //회원 한명의 정보를 MemberDto 객체에 담는다.
            FriendsDto dto=new FriendsDto(num, name, phone, email);
            //MemberDto 객체의 참조값을 ArrayList 에 저장
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
      return list;
   }//getList()
}
