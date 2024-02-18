/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.*; 

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class QuestionDAO  {
    private EntityManagerFactory entityManagerFactory;

    public QuestionDAO() {
        entityManagerFactory = Persistence.createEntityManagerFactory("onlinetestsPU");
    }


    public void insertQuestion(Question newQuestion) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

       

        entityManager.persist(newQuestion);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
} 