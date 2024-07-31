package com.MB.Dao;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.MB.Database.CP;
import com.MB.pojo.Students;

public class StudentDao {
	
	//Method for inserting the data into database 
	public static boolean InsertStudentData(Students s) {
		
		try {
			boolean f=false;
			Connection conn = CP.createc();
			String query="insert into students(sname,sphone,scity)values(?,?,?)";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setString(1,s.getsName());
			ps.setString(2,s.getsPhone());
			ps.setString(3,s.getsCity());
			ps.executeUpdate();
			f=true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
		
	}
	
	
	//Method for Updating the data into Database
	public static boolean UpdateStudentData(int val,String toUpadate,int id,Students s) {
		try {
			boolean f=false;
			Connection conn=CP.createc();
			if(val==1) {
				String query="update students set sname=? where sid=?";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setString(1, toUpadate);
				ps.setInt(2, id);
				ps.executeUpdate();
				f=true;
			}else if(val==2) {
				String query="update students set sphone=? where sid=?";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setString(1, toUpadate);
				ps.setInt(2, id);
				ps.executeUpdate();
				f=true;
			}else if(val==3) {
				String query="update students set scity=? where sid=?";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setString(1, toUpadate);
				ps.setInt(2, id);
				ps.executeUpdate();
				f=true;
			}else {
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	//Method for Deleting the Data from Database
	public static boolean DeleteStudentData(int userId) {
		try {
			boolean f=false;
			Connection conn = CP.createc();
			String query="delete from students where sid=?";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1, userId);
			ps.executeUpdate();
			f=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	//Method for Displaying All students Data from Database
	
	public static void ShowAllStudentsData() {
		try {
			Connection conn = CP.createc();
			String query="select * from students ";
			Statement st= conn.createStatement();
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next()) {
				int id=rs.getInt(1);
				String sname=rs.getString(2);
				String sphoneno=rs.getString(3);
				String scity=rs.getString(4);
		    	System.out.println(id+" "+sname+" "+sphoneno+" "+scity);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
