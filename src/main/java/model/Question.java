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

    private int correctAnswer;
 
    
      // Constructor
    public Question(String qText, int correctAnswer) {
        this.qText = qText;
   
        this.correctAnswer = correctAnswer;
      
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
    public int getAns() {
        return correctAnswer;
    }

    // Setter for ans
    public void setAns(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}

  
    

 