package jdbc_query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo_adding {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;
		String dPath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/student ? user = root & password = Root";
		String sql = "Insert into student_table values(?, ?, ?, ?, ?)";

		try {
			Class.forName(dPath);
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(sql);
			System.out.println("Enter id, name, age, rollno, password");
			int id = sc.nextInt();
			String name = sc.next();
			int age = sc.nextInt();
			String roll = sc.next();
			String pass = sc.next();
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4, roll);
			ps.setString(5, pass);
			
			int result = ps.executeUpdate();
			System.out.println(result + " Rows Inserted.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
				if (ps != null) ps.close();
				if (sc != null) sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
