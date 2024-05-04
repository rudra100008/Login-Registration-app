<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
<h1>Login</h1>
<form action="LoginServlet" method="post">
  <label for="username">UserName:</label>
  <input  type="text" name="username" id="username" placeholder="Enter username">
  <br>
  <label for="email">Email</label>
  <input type="text" name="email" id="email">
  <br>
  <label for="password">Password:</label>
  <input type="password" name="password" id="password" placeholder="Enter password">
  <br>
  <button type="submit">Register</button>
</form>
 <p><a href="index.html">Back to home</a></p>
 </div>
</body>
</html>