package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serveadmin
 */
@WebServlet("/Serveadmin")
public class Serveadmin extends HttpServlet {


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
		if(dbc.admin(id, fname, lname, dep, post, email, contact, address, date, bs, hra, ta, fbp, bonus, pf, tax)) {
			System.out.println("ServeAdmin");
			response.sendRedirect("adminredirection.jsp");
		}
		
	}	

}