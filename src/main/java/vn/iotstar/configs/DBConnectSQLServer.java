package vn.iotstar.configs;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectSQLServer {

	private static String URL = "jdbc:mysql://localhost:3306/ltwebct4";
	private static String user = "sa";
	private static String pass = "123";
	static Connection conn;

	public static Connection getConnection() throws Exception {

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(URL, user, pass);

	}

	public static void main(String[] args) {
		try {
			new DBConnectSQLServer();
			System.out.println(DBConnectSQLServer.getConnection());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
