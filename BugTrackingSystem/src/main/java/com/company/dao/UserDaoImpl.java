package com.company.dao;

import java.sql.Connection;
import com.company.exceptions.BugFoundClosedException;
import com.company.model.Project;
import com.company.model.User;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.DBUtils.DBConnection;


public class UserDaoImpl implements UserDao {

	Connection conn = DBConnection.getConnection();
	PreparedStatement pstmt = null;
	
	
	@Override
	public void registerUserFromJson(String name, String role, String email) {
		String sql = "insert into userinfo(username,type,emailid) values(?,?,?)";
		int i=0;
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, role);
			pstmt.setString(2, email);
			pstmt.setString(3, name);
			i = pstmt.executeUpdate();
			System.out.println("Success");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void registerUser(User u,String pass) {
		String sql = "insert into userinfo values(?,?,?,?)";
		int i=0;
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, u.getId());
			pstmt.setString(2, u.getUserName());
			pstmt.setString(3, u.getUserEmail());
			pstmt.setString(4, pass);
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}
