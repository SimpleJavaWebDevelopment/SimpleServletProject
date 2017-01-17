package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)

	 * http://localhost:8080/SimpleServletProject/XmlServletPath?userName=Vikash$userId=1234
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from XmlServlet::Get Method");
		String userName = request.getParameter("userName");
		String userId = request.getParameter("userId");
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.println("Hello from XmlServlet::Get Method");
		writer.println("<h3>User Name! " + userName + "!</h3>");
		writer.println("<h3>User ID! " + userId + "!</h3>");
		
		writer.append("Served at: ").append(request.getContextPath());
		
String defaultUser = (String) this.getServletConfig().getInitParameter("defaultUser");
		
		writer.println("default user name is  " + defaultUser );
	}

}
