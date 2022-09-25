package com.company.dao;

import java.sql.Connection;

import com.company.DBUtils.DBConnection;
import com.company.exceptions.BugFoundClosedException;
import com.company.model.Bug;
import com.company.model.Project;
import com.company.model.User;
import java.time.LocalDateTime;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TesterDaoImpl implements TesterDao{
	Connection conn = DBConnection.getConnection();
	PreparedStatement pstmt = null;
	

	@Override
	public boolean reportBug(Bug bug) {
		String sql="insert into bugsinfo(bugTitle,bugDesc,projectId,createdBy,openDate,severityLevel,status) values(?,?,?,?,?,?)";
		//String sql="insert into bugsinfo(developerId,bugCloseRequestByDeveloperId) values(?,?)";
		int i=0;
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bug.getBugTitle());
			pstmt.setString(2, bug.getBugDesc());
			pstmt.setInt(3, bug.getProjectId());
			pstmt.setInt(4, bug.getCreatedBy()); 
			pstmt.setDate(5,(Date)bug.getOpenDate());
			pstmt.setString(6,bug.getSeverityLevel());
			pstmt.setString(6,bug.getStatus());
			//assigned to will be set by ect manager
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (i > 0) {
			return true;
		}
	return false;
		
	}

	@Override
	public User getDetailOfTester(int devId) {
		Statement stmt;
		ResultSet rset;
		User d = null;
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from UserInfo where userId= " + devId);
			
			rset.next();
			
			//User(int id, String userName, String userEmail, String typeOfUser)
			  d  = new User(rset.getInt(1), rset.getString(2), rset.getString(3),rset.getString(4));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return d;
		
	}

	
	@Override
	public ArrayList<Bug> displayBugByProjId(int projId) {
		Statement stmt;
		ResultSet rset;
		Bug p = null;
		ArrayList<Bug> bugs = new ArrayList<>();
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from BugInfo where projectid="+projId);
			
			while (rset.next()) {
				// fetching the  project details from the db and adding to the list
				//Project(int projectId, String projectName, String projDesc, Date strtDate, String status)
			  p  = new Bug(rset.getInt(1), rset.getString(2), rset.getString(3),rset.getInt(4),rset.getInt(5),(Date)rset.getDate(6),rset.getInt(7),rset.getString(8),rset.getInt(9),rset.getString(10),rset.getString(11),rset.getString(12));
			  bugs.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bugs;
		
	}
	
	
}
