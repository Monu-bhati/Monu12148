package com.MB.Database;

import java.sql.*;

public class CP {
	static Connection conn;
	public static Connection createc() throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String URL="jdbc:mysql://localhost:3306/MiniProject";
			String username="root";
			String Password="root";
			
			conn=DriverManager.getConnection(URL,username,Password);
		
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return conn;
		
	}
	

}
