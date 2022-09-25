package com.company.model;

public class Team {
	private int teamId;
	private int empId;
	private int projId;
	public Team(int teamId, int empId, int projId) {
		super();
		this.teamId = teamId;
		this.empId = empId;
		this.projId = projId;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getProjId() {
		return projId;
	}
	public void setProjId(int projId) {
		this.projId = projId;
	}
	
}
