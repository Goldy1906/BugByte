package com.company.DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection conn = null;

	public static void closeConnection() {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}// end finally try
	}// end try
	

	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/BugTrackingSys";
		try {
			if (conn == null) {
				DriverManager.registerDriver (new com.mysql.cj.jdbc.Driver());
				conn = DriverManager.getConnection (url, "root", "root");
				System.out.println("conn : " + conn);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}


}
