package exActionTag;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	 public void insertStudent(StudentVO item) throws Exception {
		  String no = item.getNo();
		  String name = item.getName();

		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","201412360","201412360");

		  PreparedStatement pstmt = conn.prepareStatement("insert into student values(?,?)");
		  pstmt.setString(1,no);
		  pstmt.setString(2,name);
		  pstmt.executeUpdate();

		  pstmt.close();

		  conn.close();
		 }
	 public List<StudentVO> selectStudent() throws Exception { //List에 record set을 담아 넘겨 준다
		   List<StudentVO> items = new ArrayList<StudentVO>();

		   // DB 접속
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","201412360","201412360");
		   // SQL문 실행
			  PreparedStatement pstmt = conn.prepareStatement("select * from student");
			  ResultSet rs = pstmt.executeQuery();
			  
		   while(rs.next()) {
		    // 가져온 레코드 값 리스트에 세트
			   StudentVO item = new StudentVO();
			   item.setNo(rs.getString("no"));
			   item.setNo(rs.getString("name"));
		    items.add(item);
		   } 

		   return items;
		 }
}
