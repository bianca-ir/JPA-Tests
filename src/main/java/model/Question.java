/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.*;

@Entity 
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String qText;
    private String[] options; 

    private int correctAnswerIndex;
 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "QUIZ_KEY")
    private Quiz quiz;
    
    public Question(){
        
    }
      // Constructor
    public Question(String qText, String[] options, int correctAnswerIndex) {
        this.qText = qText;
        this.options = options; 
        this.correctAnswerIndex = correctAnswerIndex;
      
    }
   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
      // Getter for qText
    public String getQText() {
        return qText;
    }

    // Setter for qText
    public void setQText(String qText) {
        this.qText = qText;
    }
 // Getter for ans
    public Quiz getQuiz() {
        return quiz;
    }

    // Setter for ans
    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
 

    // Getter for ans
    public int getAns() {
        return correctAnswerIndex;
    }

    // Setter for ans
    public void setAns(int correctAnswerIndex) {
        this.correctAnswerIndex = correctAnswerIndex;
    }
    
     public String[] getOptions() {
        return options;
    }

    // Setter for options
    public void setOptions(String[] options) {
        this.options = options;
    }
}
  
    

 
 
