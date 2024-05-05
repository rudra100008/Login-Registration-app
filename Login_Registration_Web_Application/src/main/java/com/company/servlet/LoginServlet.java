package com.company.servlet;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import com.company.dao.UserDao;
import com.company.dao.UserDaoImpl; 

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final UserDao userDao = new UserDaoImpl(); // Initialize UserDao

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String userpassword = request.getParameter("password");
        if (userDao.isValidUser(username, userpassword)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("welcome.jsp");
        }else {
            response.sendRedirect("login.jsp?error=1");
            System.out.println("ERROR");
        }
    }
}
