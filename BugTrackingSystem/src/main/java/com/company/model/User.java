package com.company.model;

public class User {
	private int id;
	private String userName,userEmail;
	//type of user --> PM(Project Manager), Developer, Tester
	private String typeOfUser;
	private int teamId;
	
	public User(int id, String userName, String userEmail, String typeOfUser) {
		super();
		this.id = id;
		this.userName = userName;
		this.userEmail = userEmail;
		this.typeOfUser = typeOfUser;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getTypeOfUser() {
		return typeOfUser;
	}

	public void setTypeOfUser(String typeOfUser) {
		this.typeOfUser = typeOfUser;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userEmail=" + userEmail + ", typeOfUser=" + typeOfUser
				+ ", teamId=" + teamId + "]";
	}
	
}