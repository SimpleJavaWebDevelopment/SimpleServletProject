package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "a Simple Servlet", urlPatterns = { "/SimpleServletPath" })
//@WebServlet(description = "a Simple Servlet", urlPatterns = { "/AdvanceServletPath" })

public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * http://localhost:8080/SimpleServletProject/SimpleServletPath?userName=Vikash&userId=1234
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from SimpleServlet::Get Method");
		
		String userName = request.getParameter("userName");
		String userId = request.getParameter("userId");
		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("Hello from SimpleServlet::Get Method");
		writer.println("<h3>User Name! " + userName + "!</h3>");
		writer.println("<h3>User ID! " + userId + "!</h3>");
		
		writer.append("Served at: ").append(request.getContextPath());
	}

}
