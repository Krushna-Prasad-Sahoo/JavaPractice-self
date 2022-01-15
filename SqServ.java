package com.DemoApp2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServ extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException {
		
		int k = (int) req.getAttribute("k");
		int m = k*k;
		
		PrintWriter out = res.getWriter();
		out.println("Now we have added your 2 numbers & the value is : " + k);
		out.println("Also we have calculated the square & the result is : " + m);
		out.println();
		out.println("--- Both the Addition & Square operations are performed in 2 different Servlets ---");
	}

}
