package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import dao.*; 
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
    //   UserDAO userDAO = new UserDAOImpl();

      QuestionDAO questionDAO = new QuestionDAO(); 
      QuizDAO quizDAO = new QuizDAO(); 
      Quiz quiz = new Quiz();
      
      Question newQuestion = new Question();
      newQuestion.setQText("what is the result for 2+2?");
      newQuestion.setAns(4);
      Collection<Question> questionCollection = new ArrayList<>();
      questionCollection.add(newQuestion);
        
      quiz.setNumberOfQuestions(2);
      quiz.setQuestionArray(questionCollection );
      questionDAO.insertQuestion(newQuestion);
      quizDAO.insertQuiz(quiz);
        

       // userDAO.insertUser("admin", "pass");

     
    }
}
