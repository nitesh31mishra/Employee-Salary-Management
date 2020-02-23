package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uname =request.getParameter("uname");
	String pass =request.getParameter("pass");
	
	if(uname.equals("admin")&& pass.equals("12345"))
	{
		HttpSession session=request.getSession();
		session.setAttribute("username",uname);
		response.sendRedirect("employee.jsp");
	}
	else if(uname.equals("admin")&& pass.equals("admin"))
	{
		response.sendRedirect("admin.jsp");
	}
	
	else
	{
		
		response.sendRedirect("login.jsp");
		
	}
	
	
	}



}
