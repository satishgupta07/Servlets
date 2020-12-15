package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S2")
public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public S2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		int nn1 = Integer.parseInt(request.getParameter("n1"));
		int nn2 = Integer.parseInt(request.getParameter("n2"));
		
		int p = nn1*nn2;
		
		//get attribute from request object...
		int sum = (int)request.getAttribute("sum");
		
		out.println("<h1>");
		out.println("Sum is = "+sum);
		out.println("Product is = "+p);
		out.println("</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
