package com.company.dao;

import java.util.ArrayList;
import com.company.exceptions.BugFoundClosedException;
import com.company.model.Bug;
import com.company.model.Project;
import com.company.model.User;


public interface TesterDao {
	public boolean reportBug(Bug Bugdetails);
	public User getDetailOfTester(int devId);
	public ArrayList<Bug> displayBugByProjId(int projId);
}
