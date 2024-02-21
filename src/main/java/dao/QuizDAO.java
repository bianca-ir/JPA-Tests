/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.*; 

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


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
     public List<Quiz> getAllQuizzes() {
       EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            Query query = entityManager.createQuery("SELECT q FROM Quiz q");
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }
} 