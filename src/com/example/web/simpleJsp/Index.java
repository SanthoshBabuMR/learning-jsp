package com.example.web.simpleJsp;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Index extends HttpServlet {
	public void doGet (HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		request.setAttribute("data", "test");
		RequestDispatcher view = request.getRequestDispatcher("view/simple-jsp.jsp");
		view.forward(request, response);
	}
}