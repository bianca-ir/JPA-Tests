package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import dao.*; 

public class Main {
    public static void main(String[] args) {
    //   UserDAO userDAO = new UserDAOImpl();
       
      QuestionDAO questionDAO = new QuestionDAO(); 
      Question newQuestion = new Question("question1", 1); 
       
      questionDAO.insertQuestion(newQuestion);
        
  
       
     //   userDAO.insertUser("admin", "pass");

     
    }
}
