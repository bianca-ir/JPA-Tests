/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.QuestionDAO;
import dao.QuizDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Question;
import model.Quiz;
import java.util.ArrayList;
import java.util.Collection;

@WebServlet(name = "AddQuizController", urlPatterns = {"/AddQuizController"})
public class AddQuizController extends HttpServlet {
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        int numberOfQuestions = Integer.parseInt(request.getParameter("numQuestions"));

      
        for (int i = 1; i <= numberOfQuestions; i++) {
            String questionText = request.getParameter("question" + i);
            String[] options = request.getParameter("options" + i).split(",");
            int correctAnswerIndex = Integer.parseInt(request.getParameter("correctAnswer" + i));

            QuestionDAO questionDAO = new QuestionDAO(); 
            QuizDAO quizDAO = new QuizDAO(); 
            
      
            Question newQuestion = new Question();
            newQuestion.setQText(questionText);
            newQuestion.setAns(correctAnswerIndex);
     
            newQuestion.setOptions(options);
            questionDAO.insertQuestion(newQuestion);
            
            Collection<Question> questionCollection = new ArrayList<>();
            questionCollection.add(newQuestion);
//        

            Quiz quiz = new Quiz();
            quiz.setNumberOfQuestions(numberOfQuestions);
            quiz.setQuestionArray(questionCollection );
     
            quizDAO.insertQuiz(quiz);
//        
 
        }

        
        response.sendRedirect("start.html");

    
}
}
