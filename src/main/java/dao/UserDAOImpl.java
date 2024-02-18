/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.User; 

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UserDAOImpl implements UserDAO {
    private EntityManagerFactory entityManagerFactory;

    public UserDAOImpl() {
        entityManagerFactory = Persistence.createEntityManagerFactory("onlinetestsPU");
    }

    @Override
    public void createUser(User user) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void insertUser(String username, String password) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password);

        entityManager.persist(newUser);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
} 