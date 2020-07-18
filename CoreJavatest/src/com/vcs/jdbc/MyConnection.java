package com.vcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
public Connection getConnection() throws Exception{
	
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String URL="jdbc:oracle:thin:@192.168.100.100:1521:server";
	String user1="student";
	String pass1="student";
	Connection con=DriverManager.getConnection(URL,user1,pass1);
	return con;
	
}

}