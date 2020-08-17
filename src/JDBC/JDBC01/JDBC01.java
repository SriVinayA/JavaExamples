package JDBC.JDBC01;

import java.sql.*;

public class JDBC01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "root";
		String query = "select name from students where id=3";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		String name = rs.getString("name");
		
		System.out.println(name);
		
		st.close();
		con.close();
		
	}
}
