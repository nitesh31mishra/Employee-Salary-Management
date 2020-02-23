<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.login.DBConnect"%>
<%@page import="com.login.User"%>
<%@page import="java.util.ArrayList"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
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
<body>
<!-- <form action="Adduser" method="post">-->
<div>
<left>
	<font face="times new roman"> <font color="white">
</font>

				<form action="Choice.jsp" method="post">
					<button type="submit">Logout</button>


<h2>check your details here!</h2>
  <% 
	  ArrayList<User> employeelist =  
	  (ArrayList<User>)request.getAttribute("data"); 
	 
			 for(User s: employeelist) {%>
  <!-- Start for loop here -->
  <table align="center">
  <tr>
     <th>Id</th>
    <th>First-name</th>
    <th>Last-name</th>
    <th>Department</th>
        <th>Post</th>
            <th>E-mail id</th>
                <th>Contact-no</th>
                    <th>Address</th>
                        <th>Date of Joining</th>
  </tr>
  <tr>
   <td><%= s.getId() %></td>
    <td><%= s.getFname() %></td>
    <td><%= s.getLname() %></td>
    <td><%= s.getDep() %></td>
    <td><%= s.getPost() %></td>
    <td><%= s.getEmail() %></td>
    <td><%= s.getContact() %></td>
    <td><%= s.getAddress() %></td>
    <td><%= s.getDate() %></td>
  </tr>
  
  <tr><td>Basic Salary</td><td><%= s.getBs() %></td></tr>
     <tr><td>House Rent Allowance</td><td><%= s.getHra() %></td></tr>
      <tr><td>Transport Allowance</td><td><%= s.getTa() %></td></tr>
       <tr><td>FBP Allowance</td><td><%= s.getFbp() %></td></tr>
        <tr><td>Bonus</td><td><%= s.getBonus() %></td></tr>
  		 <tr><td>Provident Fund</td><td><%= s.getPf() %></td></tr>
  		  <tr><td>Tax Returns</td><td><%= s.getTax() %></td></tr>
   <tr><td>Total Salary</td><td><%= Integer.parseInt(s.getBs())+Integer.parseInt(s.getHra())+Integer.parseInt(s.getTa())+Integer.parseInt(s.getFbp())+Integer.parseInt(s.getBonus())-Integer.parseInt(s.getPf())-Integer.parseInt(s.getTax()) %></td></tr>		 
   <br>
  
  </table>
  <!-- end for loop  -->
  <%} %>
  
 </form>
</body>
</html>