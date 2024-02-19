/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Bianca Iorgoaea
 */
import javax.persistence.*;

@Entity 
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
    private Long questionId; 

    private int chosenAnswerIndex;
    
       // Constructor with parameters
    public Answer(Long questionId, int chosenAnswerIndex) {
        this.questionId = questionId;
   
        this.chosenAnswerIndex = chosenAnswerIndex;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

  

    public int getChosenAnswer() {
        return chosenAnswerIndex;
    }

    public void setChosenAnswer(int chosenAnswerIndex) {
        this.chosenAnswerIndex = chosenAnswerIndex;
    }
}
    
    
   