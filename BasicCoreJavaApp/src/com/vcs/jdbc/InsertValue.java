package com.vcs.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertValue {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String URL = "jdbc:oracle:thin:@localhost:1521:xe";
		String user1 = "system";
		String pass1 = "student";
		Connection con = DriverManager.getConnection(URL, user1, pass1);
		int id = 11;
		String name = "central";
		String desc = "housing";
		PreparedStatement ps = con
				.prepareStatement("insert into floor(floor_id,floor_name,floor_desc) values(?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, desc);
		ps.executeUpdate();
		System.out.println("succesfull");

	}
}
