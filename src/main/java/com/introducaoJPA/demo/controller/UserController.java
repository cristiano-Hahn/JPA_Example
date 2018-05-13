/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.introducaoJPA.demo.controller;

import com.introducaoJPA.demo.repository.UserRepository;
import com.introducaoJPA.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author crist
 */
@Controller
public class UserController {
    
    
    @Autowired
    private UserService userService;
    
    @RequestMapping("/user")
    public String getUsers(Model model){
        model.addAttribute("usersList", userService.findFirst3());
        
        return "user";
    }
    
}
