package com.vcs.database.scrollable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MyResultSetMetadata {

	public static void main(String a[]){
        
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.
                getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","student");
            st = con.createStatement();
            rs = st.executeQuery("select * from student");
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            for(int i=1;i<=columnCount;i++){
                System.out.println(rsmd.getColumnName(i));
                System.out.println(rsmd.getColumnType(i));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            try{
                if(rs != null) rs.close();
                if(st != null) st.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
    }
//- See more at: http://www.java2novice.com/jdbc/result-set-metadata/#sthash.v5gDVz8k.dpuf
}
