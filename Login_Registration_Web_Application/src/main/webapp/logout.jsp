<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@  page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<% 
       HttpSession logoutsession = request.getSession(false);
       if(logoutsession !=null){
    	   logoutsession.invalidate();
       }
       
    	   response.sendRedirect("index.html");
       
    %>

</body>
</html>