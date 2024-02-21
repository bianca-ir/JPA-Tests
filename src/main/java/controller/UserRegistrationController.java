/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.UserDAOImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;


@WebServlet(name = "UserRegistrationController", urlPatterns = {"/UserRegistrationController"})
public class UserRegistrationController extends HttpServlet {
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        String email = request.getParameter("email"); 
        String username = request.getParameter("username"); 
        String password = request.getParameter("password"); 
        
        
    
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);

    
        UserDAOImpl userDAO = new UserDAOImpl();

      
      
        
        userDAO.insertUser(user);

//        
         response.sendRedirect("viewQuizList.jsp");
  
        }

      
    
}

