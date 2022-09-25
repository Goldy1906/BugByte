package com.company.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.ProjectDaoImpl;
import com.company.dao.ProjectManagerDaoImpl;
import com.company.model.Project;

public class ProjectServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProjectManagerDaoImpl projectImpl = new ProjectManagerDaoImpl();
		int pid = (int) Math.random();
		String name = req.getParameter("name");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = format.parse("2022-12-11");
			String desc = req.getParameter("desc");
			String status = req.getParameter("status");
			Project newProject = new Project(pid, name, desc, date, status);
			System.out.println(projectImpl.createProject(newProject));
			RequestDispatcher rd = req.getRequestDispatcher("NEW-PROJECT.html");
			rd.forward(req, resp);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}
