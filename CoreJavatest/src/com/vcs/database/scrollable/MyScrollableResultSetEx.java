package com.vcs.database.scrollable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyScrollableResultSetEx {

	public static void main(String a[]){
        
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.
                getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","student");
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                            ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery("select sno,sname from student");
            System.out.println("ResultSet Curson is at before first: "+rs.isBeforeFirst());
            while(rs.next()){
                //System.out.println(rs.getInt(1)+"   "+rs.getString(2));
            	if(rs.getInt(1)==2){
            		rs.updateString(2, "mahi");
            		rs.updateRow();
            		System.out.println("Record Updated");
            	}
            }
            //now result set cursor reached the last position
            System.out.println("Is After Last: "+rs.isAfterLast());
            while(rs.previous()){
                System.out.println(rs.getInt(1)+"   "+rs.getString(2));
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
//- See more at: http://www.java2novice.com/jdbc/scroll-read-only/#sthash.GI98HQrf.dpuf
}
