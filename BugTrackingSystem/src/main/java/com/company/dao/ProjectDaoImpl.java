package com.company.dao;

import java.sql.Connection;

import com.company.DBUtils.DBConnection;
import com.company.exceptions.BugFoundClosedException;
import com.company.model.Project;
import com.company.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectDaoImpl implements ProjectDao {
	Connection conn = DBConnection.getConnection();
	PreparedStatement pstmt = null;
	

	@Override
	public List<Project> fetchAllProjects() {
		Statement stmt;
		ResultSet rset;
		Project p = null;
		List<Project> projects = new ArrayList<>();
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from ProjectInfo");
			
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

	//for the search bar
	@Override
	public Project fetchProjectDetails(int ProjId) {
		Statement stmt;
		ResultSet rset;
		Project p = null;
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from ProjectInfo where projectId= " + ProjId);
			
			rset.next();
			  p  = new Project(rset.getInt(1), rset.getString(2), rset.getString(3),rset.getDate(4),rset.getString(5));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return p;
		
	}
	

}
