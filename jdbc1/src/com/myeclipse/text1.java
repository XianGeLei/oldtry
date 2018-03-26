package com.myeclipse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class text1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
			Class.forName("mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql:thin:@127.0.0.1:3306:text","root","root");
		   String sql="select*from emp";
		   Statement stat=conn.createStatement();
		   ResultSet rs=stat.executeQuery(sql);
		   while(rs.next()){
			   System.out.println(rs.getString(1));
		   }
		   
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
