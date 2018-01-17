package com.example.web.servletParam;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Index extends HttpServlet {
	public void doGet (HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		String user = getServletConfig().getInitParameter("Email");
		String superUser = getServletContext().getInitParameter("Super User Email");
		out.println("servlet param(user): " + user);
		out.println("context param(superUser): " + superUser);
	}
}