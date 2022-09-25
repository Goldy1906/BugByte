package com.company.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.ProjectManagerDaoImpl;
import com.company.dao.UserDaoImpl;
import com.company.model.User;


public class LoginServlet extends HttpServlet{
	public LoginServlet() {
		System.out.println("Successful");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		 resp.setContentType("text/html");
		 PrintWriter out = resp.getWriter();
		 
		 String uname = req.getParameter("username");
		 ProjectManagerDaoImpl projectImpl = new ProjectManagerDaoImpl();
		 User user = projectImpl.getPMDetails(uname);
		 String pass = req.getParameter("pass");
		 System.out.println(user);
		 if(user != null) {
			 if(user.getTypeOfUser().equals("Project Manager")) {
				 int time = projectImpl.checkAndStoreLogin(uname);
				req.setAttribute("time", time);
				 req.setAttribute("user", user);
				 RequestDispatcher rd = req.getRequestDispatcher("ProjectManagerMain");
				 rd.forward(req, resp);
			 }
		 }
		 
		 
//		 if(pasBook.containsKey(uname)) {
//			 if(pasBook.get(uname).equals(pass)) {
//				 System.out.println("Successful");
//				 out.println("Successful");
//			 }
//			 else
//				 out.println("Not");
//			 
//		 }
//		 else
//			 out.println("NOT");
//	}

	}
	
}