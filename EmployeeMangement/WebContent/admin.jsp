<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
         table, th, td {
            border: 3px solid black;
         }
 </style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<style>
    body {
 background-image: url("https://freefrontend.com/assets/img/css-particle-backgrounds/thumb.png");
 background-size:cover;
}

.middle{
position: absolute;
left:30%;
}
</style>
</head>
<body>
 <div >
<div class="but">
     <a class="btn btn-primary" href="employee1.jsp" role="button">View Database</a>
</div>
</div>

<div>
<right>
	<font face="times new roman"> <font color="white">
</font>

				<form action="Choice.jsp" method="post">
					<button type="submit">Logout</button>
				</form>	
<h1>Employee Entry</h1>
<form action="Serveadmin" method="post">
<body bgcolor="#E6E6FA">
</body>	
<table width="45opx">
<th>
<tr>
<label for="id">Employee Id</label>
</td>
<td>
<input type="text" name="id" size="30" maxlength="50">
</td>
</tr>

<tr>
<td>
<label for="fname">First Name</label>
</td>
<td>
<input type="text" name="fname" size="30" maxlength="50">
</td>
</tr>
 
<tr>
<td>
<label for="lname">Last Name</label>
</td>
<td>
<input type="text" name="lname" size="30" maxlength="50">
</td>
</tr>

<tr>
<td>
<label for="dep">Department</label>
</td>
<td>
<input type="text" name="dep" size="30" maxlength="50">
</td>
</tr>

<tr>
<td>
<label for="post">Post</label>
</td>
<td>
<input type="text" name="post" size="30" maxlength="50">
</td>
</tr>


<tr>
<td>
<label for="email">Email Address</label>
</td>
<td>
<input type="text" name="email" size="30" maxlength="80">
</td>
</tr>

<tr>
<td>
<label for="contact">Contact_Number</label>
</td>
<td>
<input type="text" name="contact" size="30" maxlength="30">
</td>
</tr>

<tr>
<td>
<label for="address">Address</label>
</td>
<td>
<textarea name="address" maxlength="1000" cols="31" rows="3"></textarea>
</td>

<td>
<label for="date">Date of joining</label>
</td>
<td>
<input type="text" name="date" size="30" maxlength="30">
</td>

</tr>

<tr>
<td>
<label for="bs">Basic Salary</label>
</td>
<td>
<input type="text" name="bs" size="30" maxlength="30">
</td>

<td>
<label for="hra">House Rent Allowance</label>
</td>
<td>
<input type="text" name="hra" size="30" maxlength="30">
</td>
</tr>

<tr>
<td>
<label for="ta">Transport Allowance</label>
</td>
<td>
<input type="text" name="ta" size="30" maxlength="30">
</td>

<td>
<label for="fbp">FBP Allowance</label>
</td>
<td>
<input type="text" name="fbp" size="30" maxlength="30">
</td>
</tr>
<tr>
<td>
<label for="bonus">Bonus</label>
</td>
<td>
<input type="text" name="bonus" size="30" maxlength="30">
</td>
</tr>

<tr>
<td>
<label for="pf">Provident Fund</label>
</td>
<td>
<input type="text" name="pf" size="30" maxlength="30">
</td>
<td>
<label for="tax">Tax Returns</label>
</td>
<td>
<input type="text" name="tax" size="30" maxlength="30">
</td>
</tr>


</table>
<input type="submit" value="submit">

</form>
</body>
</html>