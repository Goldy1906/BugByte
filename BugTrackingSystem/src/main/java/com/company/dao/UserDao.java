package com.company.dao;

import com.company.exceptions.BugFoundClosedException;
import com.company.model.Project;
import com.company.model.User;

public interface UserDao {
	public void registerUserFromJson(String name,String role, String email);
	public void registerUser(User u,String pass);
}
