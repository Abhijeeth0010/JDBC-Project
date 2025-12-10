package jdbc_query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UCUCU_Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		String sql = "Update ucucubank set Balance = Balance - ? where Account_No = ? and Pin = ?";
		String sql2 = "Update ucucubank set Balance = Balance + ? where Account_No = ?";
		String url = "jdbc:mysql://localhost:3306/bank ? user = root & password = Root" ;
		String dPath = "com.mysql.cj.jdbc.Driver";

		try {
			Class.forName(dPath);
			con = DriverManager.getConnection(url);
			ps1 = con.prepareStatement(sql);
			ps2 = con.prepareStatement(sql2);

			System.out.println("Enter the senders Account_No and Pin:");
			int f_Acc = sc.nextInt();
			int pin = sc.nextInt();

			System.out.println("Enter the recivers Account_No:");
			int t_Acc = sc.nextInt();

			System.out.println("Enter the amount to be transfered:");
			int amount = sc.nextInt();

			ps1.setInt(1, amount);
			ps1.setInt(2, f_Acc);
			ps1.setInt(3, pin);

			ps2.setInt(1, amount);
			ps2.setInt(2, t_Acc);

			con.setAutoCommit(false);
			int res1 = ps1.executeUpdate();
			int res2 = ps2.executeUpdate();
			con.commit();
			System.out.println((res1 + res2) + " rows updated.");

		} catch (Exception e) {
			try {
				con.rollback();
				e.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				if (con != null) con.close();
				if (ps1 != null) ps1.close();
				if (ps2 != null) ps2.close();
				if (sc != null) sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
