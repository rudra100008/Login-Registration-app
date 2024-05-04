<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
<h1>Login</h1>
<form action="LoginServlet" method="post">
  <label for="username">UserName:</label>
  <input  type="text" name="username" id="username" placeholder="Enter username">
  <br>
  <label for="password">Password:</label>
  <input type="password" name="password" id="password" placeholder="Enter password">
  <br>
  <button type="submit">Login</button>
</form>
 <p><a href="index.html">Back to home</a></p>
 <% 
 String error =request.getParameter("error");
 if(error !=null && error.equals("1")){
 %>
 <p style="color:red;">Invalid username or password.Please try again</p>
 <%} %>
</div>
</body>
</html>