package com.company.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.company.dao.UserDaoImpl;
import com.company.model.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImportServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		JSONParser jsonParser;
		try(FileReader reader = new FileReader("/Users/shriy/eclipse-workspace-new/BugTrackingSystem/users.json"))
				{
			jsonParser = new JSONParser();
			Object obj = null;

			try {
				int uid = 0;
				 resp.setContentType("text/html");
				 PrintWriter out = resp.getWriter();
				obj = jsonParser.parse(reader);
				JSONArray userList = (JSONArray)obj;
				ArrayList<User> users = new ArrayList<>();
				userList.forEach( user -> users.add(parseUserObject(((JSONObject)user), uid)));
				System.out.println(users);
				
				UserDaoImpl userImpl = new UserDaoImpl();
//				if(userImpl.userCheckTable(users.get(0).getUserEmail())) {
					for(User user: users) {
						userImpl.registerUserFromJson(user.getUserName(), user.getTypeOfUser(), user.getUserEmail());
					}
					RequestDispatcher rd = req.getRequestDispatcher("Import-User.jsp");
					rd.forward(req, resp);
//				}
//				else {
//					out.print("<h3>Already users exists!</h3>");
//				}
			} catch (org.json.simple.parser.ParseException e) {			
				e.printStackTrace();
			}
				}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		super.doGet(req, resp);
	}
	
	public User parseUserObject(JSONObject user, int uid) {
		JSONObject userObject = (JSONObject) user.get("user");
		String userName = (String) userObject.get("name");
		String userType = (String) userObject.get("type");
		String userEmail = (String) userObject.get("email");
		User newUser = new User(uid, userName, userType, userEmail);
		return newUser;
	}
}
