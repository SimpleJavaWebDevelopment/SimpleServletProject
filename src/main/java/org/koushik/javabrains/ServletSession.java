package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "a Simple Servlet", urlPatterns = { "/ServletSession" },
  initParams={@WebInitParam(name="defaultUser", value="Vikash Kumar")})

public class ServletSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * http://localhost:8080/SimpleServletProject/ServletSession?userName=Vikash&userId=1234
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from ServletSession::Get Method");
		
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		if(null != userName && !userName.isEmpty()) {
			session.setAttribute("savedUserName", userName);
		}
		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("Request Parameter has " + userName );
		writer.println("Session Parameter has " + (String) session.getAttribute("savedUserName") );
		String defaultUser = (String) this.getServletConfig().getInitParameter("defaultUser");
		
		writer.println("default user name is  " + defaultUser );
		
	
	}

}
