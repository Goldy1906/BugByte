package com.company.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.UserDaoImpl;

public class RegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		 UserDaoImpl userImpl = new UserDaoImpl();
		 resp.setContentType("text/html");
		 PrintWriter out = resp.getWriter();
		 String role = req.getParameter("role");
		 String email = req.getParameter("email");
		 String pass = req.getParameter("password");
		 String confirmPass = req.getParameter("password-1");
//		 if(userImpl.userCheckTable(email));{
//			 System.out.println("YAY");
//		 } 
	}
}