import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Surbhi","root","root");

			String sql="insert into menu(mid,mname,price,qty)values(?,?,?,?)";
			 PreparedStatement ps=conn.prepareStatement(sql);
			 ps.setInt(1, 104);
			 ps.setString(2, "Chines");
			 ps.setInt(3, 200);
			 ps.setInt(4, 1);
			 ps.executeUpdate();
			 System.out.println("Data added Succesfuly");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
