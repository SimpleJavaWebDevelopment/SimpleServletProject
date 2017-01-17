package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
//@WebServlet(description = "a Simple Servlet", urlPatterns = { "/SimpleServletPath" })
@WebServlet(description = "a Simple Servlet", urlPatterns = { "/AdvanceServletMoreParamPath" })
public class AdvanceServletMoreParamForm extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 * http://localhost:8080/SimpleServletProject/AdvanceServletMoreParamPath?userName=Vikash&userId=1234
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("Hello from AdvanceServletPostForm::Post Method");
			
			String userName = request.getParameter("userName");
			String fullName = request.getParameter("fullName");
			
			PrintWriter writer = response.getWriter();
			response.setContentType("text/html");
			writer.println("Hello from AdvanceServletPostForm::Post Method");
			writer.println("<h3>User Name! " + userName + "!</h3>");
			writer.println("We know your full name is! " + fullName );
			
			String prof = request.getParameter("prof");
			writer.println("You are a " + prof );
			
			//String location = request.getParameter("location");
//			writer.println("You are at " + locations );
			String[] locations = request.getParameterValues("location");
			for(int i = 0; i< locations.length ; i++) { 
				writer.println("You are at " + locations[i] );
			}
			
			writer.append("Served at: ").append(request.getContextPath());
		}

}
