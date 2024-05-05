package com.company.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.company.dao.UserDao;
import com.company.dao.UserDaoImpl;
import com.company.util.User;


public class RegistrationSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao userDao = new UserDaoImpl();
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		User user = new User();
		user.setName(username);
		user.setEmail(email);
		user.setPassword(password);
		
		if(userDao.addUser(user)) {
			response.sendRedirect("login.jsp?Registration=sucess");
		}else {
			response.sendRedirect("register.jsp?error=1");
		}
		
	}

}
