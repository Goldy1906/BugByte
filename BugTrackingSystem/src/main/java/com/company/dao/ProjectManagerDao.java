package com.company.dao;

import java.util.ArrayList;
import com.company.exceptions.BugFoundClosedException;
import com.company.model.Bug;
import com.company.model.Project;
import com.company.model.User;
import java.util.HashMap;
import java.util.List;

interface ProjectManagerDao {
	//returns the id of the pm
	//returns object of the PM
	public User getPMDetails(String email);
	
	public boolean createProject(Project p);
	
	public void assignTeamMember(int userId,int tmId,int projId);	
	
	public Bug getBugDetail(int bugId);
	
	public HashMap<Integer,ArrayList<Integer>> getAllTeams();
	
	public List<Bug> checkForBugStatus(int pmId);
}
