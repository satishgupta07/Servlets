package com.myservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet01() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		//name fetch.........
		String name = request.getParameter("user_name");
		
		out.println("<h1> Your name is : "+name+"</h1>");
		
//		out.println("<a href='Servlet02?user="+name+"'> Go to second servlet </a>");
		
		//hidden form field coding...
		out.println(""
				+"<form action='Servlet02'>"
				+"<input type='hidden' name='user_name' value='"+name+"' />"
				+"<button>Go To Second Servlet </button>"
				+"</form>"
				);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
