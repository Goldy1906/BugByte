package com.company.dao;

import java.util.List;
import com.company.exceptions.BugFoundClosedException;
import com.company.model.Project;
import com.company.model.User;

interface ProjectDao {
	public List<Project> fetchAllProjects();
	public Project fetchProjectDetails(int projId);
}
