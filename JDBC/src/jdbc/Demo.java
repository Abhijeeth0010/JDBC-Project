package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "Root";
		String query = "select * from student_table";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//Step-1 -> Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded the driver");
			
			//Step2 -> Establish the connection
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established");
			
			//Step3 -> Create a medium
			stmt = conn.createStatement();
			System.out.println("Medium created");
			
			//Step4 -> Query and get result
			rs = stmt.executeQuery(query);
			System.out.println("Result Set Saved using query");
			
			//Step5 -> Display the result
			while (rs.next()) {
				System.out.println("Student ID: " + rs.getInt("Student_ID") + " Student Name: " + rs.getString("Student_Name") + " Student Age: " + rs.getInt("Student_Age"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//Step6 -> Close the resource	
			try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
		}
	}
}
