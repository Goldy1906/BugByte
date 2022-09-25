package com.company.model;

import java.util.Date;

public class Project {
	private int projectId;
	private String projectName,projDesc;
	Date strtDate;
	//status -> In progress // completed
	private String status;
	
	//creates an object of project
	public Project(int projectId, String projectName, String projDesc, Date strtDate, String status) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projDesc = projDesc;
		this.strtDate = strtDate;
		this.status = status;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjDesc() {
		return projDesc;
	}

	public void setProjDesc(String projDesc) {
		this.projDesc = projDesc;
	}

	public Date getStrtDate() {
		return strtDate;
	}

	public void setStrtDate(Date strtDate) {
		this.strtDate = strtDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

		
	
	
}
