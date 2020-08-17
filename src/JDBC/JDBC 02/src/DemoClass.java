import java.sql.*;

public class DemoClass {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "root";
		String query = "select * from students";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		String userData = "";
		
		while(rs.next()) {
			userData = rs.getInt(1) + " : " + rs.getString(2);
			System.out.println(userData);
		}
		
		st.close();
		con.close();
		
	}
}
