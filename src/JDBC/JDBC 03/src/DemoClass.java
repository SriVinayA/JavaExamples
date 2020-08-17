import java.sql.*;

public class DemoClass {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "root";
		int id = 6;
		String name = "Vijay";
		String query = "insert into students values(?, ?);";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, id);
		st.setString(2, name);
		int count = st.executeUpdate();
		
		System.out.println(count + " row(s) affected.");
		
		st.close();
		con.close();
		
	}
}
