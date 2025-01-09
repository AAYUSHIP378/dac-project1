	package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;

//http protocol - hyper text transfer protocol
public class HelloServlet extends HttpServlet
{
 
	 @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		PrintWriter out= response.getWriter();
	    out.println("<h1>welcome to web based java</h1> ");
	    out.println("<i> how are you</i>");
	    
	 }

}
