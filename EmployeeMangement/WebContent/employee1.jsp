<%@page import="com.login.DBConnect"%>
<%@page import="java.util.ArrayList"%> 

<%@page import ="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{
background-image: url("https://freefrontend.com/assets/img/css-particle-backgrounds/thumb.png");
 background-size:cover;
 }
table, th, td {
padding: 15px;
border-spacing: 5px;
   color:black;
  border: 3px solid black;
}
</style>


</head>
<body
	style="background-image: url('https://freefrontend.com/assets/img/css-particle-backgrounds/thumb.png'); , background-size: cover;">
	
	</font>

	<h1>--Employee Database--</h1>
	<table class="table table-hover">
	  <thead class="thead-dark">
	    <tr>
	      <th scope="col">ID</th>
	      <th scope="col">First Name</th>
	      <th scope="col">Last name</th>
	      <th scope="col">Department</th>
	      <th scope="col">Post</th>
	      <th scope="col">Email</th>
	      <th scope="col">Contact</th>
	      <th scope="col">Address</th>
	      <th scope="col">Date</th>
	      <th scope="col">Basic salary</th>
	      <th scope="col">Hra</th>
	      <th scope="col">Ta</th>
	      <th scope="col">Fbp allowance</th>
	      <th scope="col">Bonus</th>
	         <th scope="col">Pf</th>
	      <th scope="col">Tax</th>
	    </tr>
	  </thead>
	  <tbody>
	    
	  
	<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
	<% 
	Connection con;
    Statement st;
    final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final String DB_URL = "jdbc:mysql://localhost:3305/employeeproject";
    final String DUSER = "root";
    final String DPASS = "root";
    String query;
    int executeUpdate;
    ResultSet rs;
    try {
    	
    	 	Class.forName(JDBC_DRIVER);
            
            // To set up a connect
            con = DriverManager.getConnection(DB_URL,DUSER,DPASS);
            
            // To execute statement 
            st = con.createStatement();
            // Auto connects to database
            query = String.format("SELECT * from employeedata");
            rs = st.executeQuery(query);
            while(rs.next()){
            	out.println("<tr>");
            		out.println("<td>");
	            		out.println(rs.getString("id"));
	            	out.println("<td>");
	            		out.println(rs.getString("fname"));
	            	out.println("<td>");
	            		out.println(rs.getString("lname"));
	            	out.println("<td>");
	            		out.println(rs.getString("dep"));
	            		out.println("<td>");
	            		out.println(rs.getString("post"));
	            		out.println("<td>");
	            		out.println(rs.getString("email"));
	            		out.println("<td>");
	            		out.println(rs.getString("contact"));
	            		out.println("<td>");
	            		out.println(rs.getString("address"));
	            		out.println("<td>");
	            		out.println(rs.getString("date"));
	            		out.println("<td>");
	            		out.println(rs.getString("bs"));
	            		out.println("<td>");
	            		out.println(rs.getString("hra"));
	            		out.println("<td>");
	            		out.println(rs.getString("ta"));
	            		out.println("<td>");
	            		out.println(rs.getString("fbp"));
	            		out.println("<td>");
	            		out.println(rs.getString("bonus"));
	            		out.println("<td>");
	            		out.println(rs.getString("pf"));
	            		out.println("<td>");
	            		out.println(rs.getString("tax"));
            	out.println("</tr>");
            }
    
    }
    catch(Exception e){
    	System.out.println(e);
    }
    
	%>
	</tbody>
	</table>
</body>
</html>