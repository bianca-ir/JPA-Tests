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
    private String optionA;
    private String optionB;
    private int ans;
    private int chosen;
    
      // Constructor
    public Question(String qText, String optionA, String optionB, int ans, int chosen) {
        this.qText = qText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.ans = ans;
        this.chosen = chosen;
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

    // Getter for optionA
    public String getOptionA() {
        return optionA;
    }

    // Setter for optionA
    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    // Getter for optionB
    public String getOptionB() {
        return optionB;
    }

    // Setter for optionB
    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    // Getter for ans
    public int getAns() {
        return ans;
    }

    // Setter for ans
    public void setAns(int ans) {
        this.ans = ans;
    }

    // Getter for chosen
    public int getChosen() {
        return chosen;
    }

    // Setter for chosen
    public void setChosen(int chosen) {
        this.chosen = chosen;
    }
}
    
    


    

 