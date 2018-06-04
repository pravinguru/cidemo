package com.bhankhol.application.service;

import com.bhankhol.application.entity.User;
import com.bhankhol.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pravingosavi on 21/05/18.
 */

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



    public void createUser(User user){
        userRepository.save(user);
    }

    public User creatNeweUser(User user){
        userRepository.save(user);
        return user;
    }

    public User getUserByUserName(String username){
        return userRepository.findByUsername(username);
    }

    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public void deleteUserByUserName(User userName){
         userRepository.delete(userName);
    }

    public void deleteAllUsers(){
        userRepository.deleteAll();
    }

    public boolean exists(User user) {
        return getUserByUserName(user.getUsername()) != null;
    }
}
