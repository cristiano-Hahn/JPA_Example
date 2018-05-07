/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.introducaoJPA.demo.controller;

import com.introducaoJPA.demo.repository.RoleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author crist
 */
@Controller
public class RoleController {
    
    private RoleRepository roleRepository;
    
    public RoleController(RoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }
    
    @GetMapping("/role")
    public String getRoles(Model model){
        model.addAttribute("rolesList", roleRepository.findAll());
        return "role";
    }
}
