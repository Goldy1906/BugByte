package com.company.dao;

import java.sql.Connection;
import com.company.exceptions.BugFoundClosedException;
import com.company.model.Project;
import com.company.model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.company.DBUtils.DBConnection;

public class DeveloperDaoImpl implements DeveloperDao{

	Connection conn = DBConnection.getConnection();
	PreparedStatement pstmt = null;
	
	@Override
	public User getDetailOfDeveloper(int devId) {
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
	public List<Project> getProjectDetails(int devId) {
		//sql="select p.pid,p.pname,p.teamid from ProjectInfo p,TeamInfo t where p.teamid==t.teamid";
		
		Statement stmt;
		ResultSet rset;
		Project p = null;
		List<Project> projects = new ArrayList<>();
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select p.projectID,p.projectName,p.pDescription,p.startDate,p.status,p.teamid from ProjectInfo p,TeamInfo t where p.teamid==t.teamid");
			
			while (rset.next()) {
				// fetching the  project details from the db and adding to the list
				//Project(int projectId, String projectName, String projDesc, Date strtDate, String status)
			  p  = new Project(rset.getInt(1), rset.getString(2), rset.getString(3),rset.getDate(4),rset.getString(5));
			  projects.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return projects;
	}

	@Override
	public HashMap<Integer,String> getAssignedBug(int devId) {
		//sql="select bugId,bugName from BugInfo where devId="+devId;
		Statement stmt;
		ResultSet rset;
		HashMap<Integer,String> bugDetail=new HashMap<>();
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select bugId,bugName from BugInfo where devId="+devId);
			
			while (rset.next()) {
				bugDetail.put(rset.getInt(1), rset.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bugDetail;
	}


	@Override
	public boolean closeBugRequest(int bugId) throws BugFoundClosedException {
		Statement stmt;
		ResultSet rset;
		String status="yes";
		try {
			stmt = conn.createStatement();
			//getting the status of the bug that it is active or closed
			rset = stmt.executeQuery("select status from BugInfo where bugID= " + bugId);
			rset.next();
			if(rset.getString(1).equals("closed")) {
				throw new BugFoundClosedException("Bug is Closed Earlier......Contact your Project Manager");
			}else {
				stmt.executeUpdate("update BugInfo set markedforclosing="+status+" where bugID="+bugId);
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
