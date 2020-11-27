package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;

public class FirstServlet implements Servlet {
	
	// Life-Cycle Methods :
	
	ServletConfig conf;
	
	public void init(ServletConfig conf) {
		this.conf = conf;
		System.out.println("creating object....");
		
	}
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servicing...............");
		//set the content type of response
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>this is my output from servlet method:</h1>");
		out.println("<h1>Today date and time is "+new Date().toString()+"</h1>");
	}
	public void destroy() {
		System.out.println("going to destroy servlet object");
	}
	
	// Non Life Cycle Methods
	
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	public String getServletInfo() {
		return "this servlet is created by Satish Kumar Gupta";
	}

}
