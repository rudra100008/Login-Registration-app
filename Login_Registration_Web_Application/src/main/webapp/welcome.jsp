<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@  page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" type="text/css" href="IndexStyle.css">
</head>
<body>
<% 
       HttpSession session1 = request.getSession(false);
       if(session1 !=null && session1.getAttribute("username") !=null){
    	   String username =(String)session1.getAttribute("username");
       
   
%>
<div class="container">
<h1>Welcome <%= username %> !</h1>
<p>We're absolutely delighted to have you join us!</p>
<h3> Get ready to explore, learn, and grow with our vibrant community.</h3>
<p>Welcome, and enjoy your time with us!</p>
<p>Fell free to stay with us as long as you want and when you are ready you can <a href="logout.jsp">LOGOUT</a> securely</p>
</div>
   <%
       }else{
    	   response.sendRedirect("login.jsp");
       }
    %>

</body>
</html>