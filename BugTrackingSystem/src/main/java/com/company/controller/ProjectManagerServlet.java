package com.company.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.ProjectDaoImpl;
import com.company.model.Project;
import com.company.model.User;

@WebServlet("/ProjectManagerMain")
public class ProjectManagerServlet extends HttpServlet{
	 

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// dummy
		Date date = new Date();
		ProjectDaoImpl projectImpl = new ProjectDaoImpl();
		List<Project> projects = projectImpl.fetchAllProjects();
		req.setAttribute("projects", projects);
		System.out.println(res);
		req.getRequestDispatcher("ProjectManager.jsp").forward(req, res);
	}
}
