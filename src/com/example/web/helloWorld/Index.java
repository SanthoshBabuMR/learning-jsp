package com.example.web.helloWorld;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Index extends HttpServlet {
	public void doGet (HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		out.println("Hello World!");
	}
}