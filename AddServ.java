package com.DemoApp2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServ extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException {
		
		int i = Integer.parseInt(req.getParameter("x"));
		int j = Integer.parseInt(req.getParameter("y"));
		int k = i+j;
		
		req.setAttribute("k", k);
		
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
	}

}
