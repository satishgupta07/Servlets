package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("this is get method...........");
		
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
		out.println("<h1>this is get method of my servlet </h1>");
		out.println(new Date().toString());
		
	}
}
