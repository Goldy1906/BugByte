package com.company.dao;

import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import com.company.DBUtils.DBConnection;
import com.company.model.Bug;
import com.company.model.Project;
import com.company.model.User;

public class ProjectManagerDaoImpl implements ProjectManagerDao{

	Connection conn = DBConnection.getConnection();
	PreparedStatement pstmt = null;
	
	@Override
	public boolean createProject(Project pNew) {
		String sql = "insert into projectInfo values(?,?,?,?,?)";
		int i=0;
		PreparedStatement pstmt;
		try {
			Date date = new Date(2022);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pNew.getProjectId());
			pstmt.setString(2, pNew.getProjectName());
			pstmt.setString(3, pNew.getProjDesc());
			pstmt.setDate(4, date); 
			pstmt.setString(5, pNew.getStatus());
			
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
	public void assignTeamMember( int userId,int tmId,int projId) {
		Statement stmt;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate("insert into TeamInfo values("+tmId+","+userId+","+projId+");");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public User getPMDetails(String email) {
		Statement stmt;
		ResultSet rset;
		User p = null;
		
		try {
			stmt = conn.createStatement();
			String query = "select * from userinfo where emailID='"+email+"';";
			rset = stmt.executeQuery(query);	
			rset.next();
			//User(int id, String userName, String userEmail, String typeOfUser)
			 
			p  = new User(rset.getInt(1), rset.getString(2), rset.getString(3),rset.getString(4));
			return p;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	//everytime it is called when login button clicked
	
	public int checkAndStoreLogin(String email) {
		Statement stmt;
		ResultSet rset;
		ResultSet rs;
		User p = null;
		int pmid=0;
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select type,userId from UserInfo where email= " + email);
			rset.next();
			if(rset.getString(1).equals("project manager")) {
				pmid=rset.getInt(2);
				//getting current date and time
				LocalTime lastLogin = LocalTime.now(ZoneId.of("GMT+02:30"));
				//updating in db
				stmt.executeUpdate("update UserInfo set lastLogin="+lastLogin+" where email="+email);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pmid;
	}

	@Override
	public Bug getBugDetail(int bugId) {
		Statement stmt;
		ResultSet rset;
		Bug b = null;
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from BugsInfo where bugID= " + bugId);
			
			rset.next();
			  b  = new Bug(rset.getInt(1), rset.getString(2), rset.getString(3),rset.getInt(4),rset.getInt(5),rset.getDate(6),rset.getInt(7),rset.getString(8),rset.getInt(9),rset.getString(10),rset.getString(11),rset.getString(12));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return b;
		
	}

	@Override
	public HashMap<Integer, ArrayList<Integer>> getAllTeams() {
		HashMap<Integer,ArrayList<Integer>> teams=new HashMap<>();
		Statement stmt;
		ResultSet rset;
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from TeamInfo");
			
			while (rset.next()) {
				// fetching the  project details from the db and adding to the list
				if(!teams.containsKey(rset.getInt(1))) {
					ArrayList<Integer> teamList=new ArrayList<>();
					teamList.add(rset.getInt(2));
					teams.put(rset.getInt(1), teamList);
				}else {
					ArrayList<Integer> teamList=teams.get(rset.getInt(1));
					teamList.add(rset.getInt(2));
					teams.put(rset.getInt(1),teamList);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return teams;
	}

	@Override
	public List<Bug> checkForBugStatus(int pmId) {
		Statement stmt;
		ResultSet rset;
		ResultSet rs;
		Bug p = null;
		ArrayList<Bug> bugs = new ArrayList<>();
		
		try {
			stmt = conn.createStatement();
			rs=stmt.executeQuery("select projectID from teamInfo where userId="+pmId);
			int projId=rs.getInt(1);
			rset = stmt.executeQuery("select * from BugInfo where markedForClosing=yes AND projectId="+projId);
			
			while (rset.next()) {
				// fetching the  project details from the db and adding to the list
				//Project(int projectId, String projectName, String projDesc, Date strtDate, String status)
			  p  = new Bug(rset.getInt(1), rset.getString(2), rset.getString(3),rset.getInt(4),rset.getInt(5),(Date)rset.getDate(6),rset.getInt(7),rset.getString(8),rset.getInt(9),rset.getString(10),rset.getString(11),rset.getString(12));
			  closeBug(p, pmId);
			  bugs.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bugs;
	
}

//for closing the bugs if developer has marked it for closing using CheckForBugStatus and close function
public void closeBug(Bug b,int pmId) {
	b.setStatus("Closed");
	b.setBugClosedByPMId(pmId);
	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
	 LocalDateTime now = LocalDateTime.now(); 
	 b.setClosedOn(dtf.format(now));
}

}
