package com.lac;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;






public class DBUtil {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/dbtest";
	private static final String USER = "root";
	private static final String PASSWORD = "4210";
	
	private static java.sql.Connection conn = null;
	
	static{
		try {
			//加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			//获得数据库的链接
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	public static Connection getConnection(){
		return conn;
	}
	
	
	
/*
 * *
 * 
 * 	public static void main(String[] args) throws Exception{
		
		//加载驱动程序
		Class.forName("com.mysql.jdbc.Driver");
		//获得数据库的链接
		java.sql.Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
		//操纵数据库
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select user_name,age from lacdb_goddess");
		
		
		while(rs.next()){
			System.out.println(rs.getString("user_name") + rs.getInt("age"));
		}
	}
 * 
 * 
 */


}
