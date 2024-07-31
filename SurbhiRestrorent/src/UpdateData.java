import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateData {

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Surbhi","root","root");
			
			String sql ="update menu set mname=?,price=?,qty=? where mid=?";
			
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1, "Samosa Pav");
			ps.setInt(2,200);
			ps.setInt(3, 10);
			ps.setInt(4, 102);
			ps.executeUpdate();
			
			System.out.println("Data Updated successfully");
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
