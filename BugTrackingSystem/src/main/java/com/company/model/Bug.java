package com.company.model;


import java.util.Date;

public class Bug {
	private int bugId;
	private String bugTitle,bugDesc;
	private int projectId;
	private int createdBy;
	private Date openDate;
	//project manager assign this project to a developer
	private int developerId;
	//Developer marks the bug to close
	private String bugCloseRequestByDeveloperId=null;
	//Project Manager Closes the Bug
	private int bugClosedByPMId=0;
	private String closedOn=null;
	//status--> open or closed
	private String status=null;
	//Severity LEvel --> critical,major,minor,trivial
	private String severityLevel;
	public int getBugId() {
		return bugId;
	}
	public void setBugId(int bugId) {
		this.bugId = bugId;
	}
	public String getBugTitle() {
		return bugTitle;
	}
	public void setBugTitle(String bugTitle) {
		this.bugTitle = bugTitle;
	}
	public String getBugDesc() {
		return bugDesc;
	}
	public void setBugDesc(String bugDesc) {
		this.bugDesc = bugDesc;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public int getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}
	public String getBugCloseRequestByDeveloperId() {
		return bugCloseRequestByDeveloperId;
	}
	public void setBugCloseRequestByDeveloperId(String bugCloseRequestByDeveloperId) {
		this.bugCloseRequestByDeveloperId = bugCloseRequestByDeveloperId;
	}
	public int getBugClosedByPMId() {
		return bugClosedByPMId;
	}
	public void setBugClosedByPMId(int bugClosedByPMId) {
		this.bugClosedByPMId = bugClosedByPMId;
	}
	public String getClosedOn() {
		return closedOn;
	}
	public void setClosedOn(String closedOn) {
		this.closedOn = closedOn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSeverityLevel() {
		return severityLevel;
	}
	public void setSeverityLevel(String severityLevel) {
		this.severityLevel = severityLevel;
	}
	public Bug(String bugTitle, String bugDesc, int projectId, int createdBy, Date openDate,
			String severityLevel) {
		super();
		this.bugId = bugId;
		this.bugTitle = bugTitle;
		this.bugDesc = bugDesc;
		this.projectId = projectId;
		this.createdBy = createdBy;
		this.openDate = openDate;
		this.severityLevel = severityLevel;
		this.status="closed";
		this.bugCloseRequestByDeveloperId="no";
	}
	public Bug(int bugId, String bugTitle, String bugDesc, int projectId, int createdBy, Date openDate, int developerId,
			String bugCloseRequestByDeveloperId, int bugClosedByPMId, String localDateTime, String status,
			String severityLevel) {
		super();
		this.bugId = bugId;
		this.bugTitle = bugTitle;
		this.bugDesc = bugDesc;
		this.projectId = projectId;
		this.createdBy = createdBy;
		this.openDate = openDate;
		this.developerId = developerId;
		this.bugCloseRequestByDeveloperId = bugCloseRequestByDeveloperId;
		this.bugClosedByPMId = bugClosedByPMId;
		this.closedOn = localDateTime;
		this.status = status;
		this.severityLevel = severityLevel;
	}
	
	
	
	
	

}
