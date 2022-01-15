package com.DemoApp1.AddServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionServlet extends HttpServlet{
	
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
// similarly we can also use doGet method which will accept only get requests.
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		PrintWriter out = res.getWriter();
		out.println("The result is : " + k);
	}

}
