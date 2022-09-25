package com.company.dao;


import java.util.HashMap;
import java.util.List;

import com.company.exceptions.BugFoundClosedException;
import com.company.model.Project;
import com.company.model.User;

public interface DeveloperDao {
	public User getDetailOfDeveloper(int devId);
	public List<Project> getProjectDetails(int devId);
	public HashMap<Integer,String> getAssignedBug(int devId);
	public boolean closeBugRequest(int bugId) throws BugFoundClosedException;
}
