/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.introducaoJPA.demo.service;

import com.introducaoJPA.demo.entity.User;
import com.introducaoJPA.demo.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author crist
 */
@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository; 
    
    public List<User> findAll(){
        return userRepository.findAll();
    }
    
    public List<User> findFirst3(){
        List<User> lista = new ArrayList();
        List<User> res = new ArrayList();
        lista = userRepository.findAll();
        
        for (int i = 0; i < 3; i++) {
            if (lista.size() >= i) {
               res.add(lista.get(i)); 
            }
        }
        return res;
    }
}
