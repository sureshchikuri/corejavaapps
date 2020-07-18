package com.vcs.database.scrollable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseCon {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","student");
	
		String qry="select *from student";
		
		PreparedStatement ps=connection.prepareStatement(qry);
		ResultSet rs=ps.executeQuery();
		
		Student student=null;
		try{
		while(rs.next()){
			student=new Student();
			student.setStudentNo(rs.getInt(1));
			student.setStudentName(rs.getString(2));
		}
		}finally{
			connection.close();
			ps.close();
			rs.close();
		}
		System.out.println(student.toString());
		/*int no=ps.executeUpdate();
		System.out.println(no);*/
	}

}
