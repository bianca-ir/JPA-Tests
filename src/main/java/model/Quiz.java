/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author andre
 */
@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_quiz;
    private Integer numberOfQuestions;
    
    @OneToMany(mappedBy = "quiz")
    private Collection<Question> questionArray;

   /* public Quiz(Long id_quiz, int numberOfQuestions, Collection<Question> questionArray) {
        this.id_quiz = id_quiz;
   
        this.numberOfQuestions = numberOfQuestions;
        this.questionArray = questionArray;
    }
      */
    public Long getId() {
        return id_quiz;
    }

    public void setId(Long id_quiz) {
        this.id_quiz = id_quiz;
    }

     public Integer getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(Integer numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }
    
     public Collection<Question> getQuestionArray() {
        return questionArray;
    }

    public void setQuestionArray(Collection<Question> questionArray) {
        this.questionArray = questionArray;
    }

    
}
