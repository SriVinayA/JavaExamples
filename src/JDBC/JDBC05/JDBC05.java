package JDBC.JDBC05;

import java.sql.*;

public class JDBC05 {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Student s2 = new Student();
        s2.rollno = 15;
        s2.sname = "Kamal";
        dao.connect();
        dao.addStudent(s2);
    }
}

class StudentDAO {
    Connection con = null;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addStudent(Student s) {
        String query = "insert into student values(?, ?)";
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement(query);
            pst.setInt(1, s.rollno);
            pst.setString(2, s.sname);
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Student {
    int rollno;
    String sname;
}