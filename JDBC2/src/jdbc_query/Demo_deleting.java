package jdbc_query;

public class Demo_deleting {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		java.sql.Connection con = null;
		java.sql.PreparedStatement ps = null;
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/student";
		String user = "root";
		String password = "Root";
		String sql = "delete from student_table where roll_no = ?";

		try {
			Class.forName(driver);
			con = java.sql.DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			System.out.println("Enter the roll number to delete from student_table");
			String rollNo = sc.next();
			ps.setString(1, rollNo);

			int deleted = ps.executeUpdate();
			if (deleted == 0) {
				System.out.println("No rows matched the provided roll number.");
			} else {
				System.out.println(deleted + " row(s) deleted successfully.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (con != null)
					con.close();
				if (sc != null)
					sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

