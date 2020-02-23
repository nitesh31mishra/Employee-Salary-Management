package com.login;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Serve
 */
@WebServlet("/Serve")
public class Serve extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String True = null;
	private static final String admin = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login =request.getParameter("login");
		String password =request.getParameter("password");
		DBConnect dbc=new DBConnect();
		dbc.login(login, password);
		if(dbc.login(login,password)){
			if(login.equals("admin") && password.equals("admin")) {
				response.sendRedirect("admin.jsp");
		         dbc.close();
		         
			}
			
				
			
			// Get user marks. And show it ?
		//	java.util.ArrayList<User> userList = dbc.userList(login);
//			for(User s: userList)
//				System.out.println(s.getMath());
			
			// Setting the attribute of the request object 
		    // which will be later fetched by a JSP page 
	      //   request.setAttribute("data", userList);
			else {
	 		
				// Start request dispatcher
				ArrayList<User> employeelist = dbc.employeelist(login);
				
				// Setting the attribute of the request object 
			    // which will be later fetched by a JSP page 
		         request.setAttribute("data", employeelist );
		         RequestDispatcher rd =  
		                 request.getRequestDispatcher("employee.jsp"); 
		         dbc.close();
		         rd.forward(request, response); 
	         
	     
		}
		}
	
			
				
	
		// Forward to login page.
		else{
			
			dbc.close();
			response.sendRedirect("/EmployeeMangement/login.jsp");
		}
	}

}
