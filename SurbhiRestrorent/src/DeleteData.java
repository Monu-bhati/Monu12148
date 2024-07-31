import java.sql.*;

public class DeleteData {

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Surbhi","root","root");
			
			String sql="delete from menu where mid=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setInt(1, 101);
			ps.execute();
			System.out.println("Data Deleted Successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
