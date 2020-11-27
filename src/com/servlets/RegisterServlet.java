package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h2>Welcome to register servlet </h2>");
		
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_id");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		
		String cond = req.getParameter("condition");
		
		if(cond != null) {
			if(cond.equals("checked")) {
				out.println("<h2>Name : "+name+"</h2>");
				out.println("<h2>Password : "+password+"</h2>");
				out.println("<h2>Email : "+email+"</h2>");
				out.println("<h2>Gender : "+gender+"</h2>");
				out.println("<h2>Course : "+course+"</h2>");
				
			}
			else {
				out.println("<h2>You have not accepted the terms and conditions </h2>");
			}
		}
		else {
			out.println("<h2>You have not accepted the terms and conditions </h2>");
		}
	
	}
}
