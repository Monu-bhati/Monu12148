
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadMenuData {

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Surbhi","root","root");
			
			Statement st =conn.createStatement();
			
			String sql="select*from menu";
			
			ResultSet rs=st.executeQuery(sql);
			 while(rs.next()) {
				int mid=rs.getInt("mid");
				 String mname=rs.getString("mname");
				 int price = rs.getInt("price");
				 int qty=rs.getInt("qty");
				 System.out.println(mid+" "+mname+" "+price+" "+qty);
			 }
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
