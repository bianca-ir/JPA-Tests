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
    private String optionA;
    private String optionB;
    private int chosenAnswer;
    
       // Constructor with parameters
    public Answer(Long questionId, String optionA, String optionB, int chosenAnswer) {
        this.questionId = questionId;
        this.optionA = optionA;
        this.optionB = optionB;
        this.chosenAnswer = chosenAnswer;
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

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public int getChosenAnswer() {
        return chosenAnswer;
    }

    public void setChosenAnswer(int chosenAnswer) {
        this.chosenAnswer = chosenAnswer;
    }
}
    
    
   