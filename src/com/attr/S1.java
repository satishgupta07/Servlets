package com.attr;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S1")
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public S1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		
		int nn1 = Integer.parseInt(n1);
		int nn2 = Integer.parseInt(n2);
		
		//add
		int s = nn1 + nn2;
		
		//attributes...........
		request.setAttribute("sum", s);
		
		//request -> request dispatcher
		RequestDispatcher rd = request.getRequestDispatcher("S2");
		
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
