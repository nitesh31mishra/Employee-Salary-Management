package com.login;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Adduser")
public class Adduser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id =request.getParameter("id");
		String fname =request.getParameter("fname");
		String lname =request.getParameter("lname");
		String dep =request.getParameter("dep");
		String post =request.getParameter("post");
		String email =request.getParameter("email");
		String contact =request.getParameter("contact");
		String address =request.getParameter("address");
		String date =request.getParameter("date");
		String bs =request.getParameter("bs");
		String hra =request.getParameter("hra");
		String ta =request.getParameter("ta");
		String fbp =request.getParameter("fbp");
		String bonus =request.getParameter("bonus");
		String pf =request.getParameter("pf");
		String tax =request.getParameter("tax");
		
	DBConnect dbc=new DBConnect();
		
	
		
			// Start request dispatcher
	ArrayList<User> employeelist = dbc.employeelist(id);
			
			// Setting the attribute of the request object 
		    // which will be later fetched by a JSP page 
	         request.setAttribute("data", employeelist );
	         RequestDispatcher rd =  
	                 request.getRequestDispatcher("employee.jsp"); 
	         dbc.close();
	         rd.forward(request, response); 		
			
		
	}

}
