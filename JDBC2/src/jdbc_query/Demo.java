package jdbc_query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String dPath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/student";
		String user = "root";
		String password = "Root";
		String sql = "select * from students where Roll_No = ? and Password = ?";

		try {	
			Class.forName(dPath);
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			System.out.println("Hey Dear, Enter the roll_no and password.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
