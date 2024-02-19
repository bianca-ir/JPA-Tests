/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.*; 

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class QuizDAO  {
    private EntityManagerFactory entityManagerFactory;

    public QuizDAO() {
        entityManagerFactory = Persistence.createEntityManagerFactory("onlinetestsPU");
    }
    
        public void createQuiz(Quiz quiz) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(quiz);
        entityManager.getTransaction().commit();
        entityManager.close();
    }


    public void insertQuiz(Quiz newQuiz) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

       

        entityManager.persist(newQuiz);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
} 