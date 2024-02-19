/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;
import model.User; 


/**
 *
 * @author Bianca Iorgoaea
 */
public interface UserDAO {
    void createUser(User user);
    void insertUser(String username, String email); 
  
    
}
