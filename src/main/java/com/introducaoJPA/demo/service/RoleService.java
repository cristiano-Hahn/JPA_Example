/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.introducaoJPA.demo.service;

import com.introducaoJPA.demo.entity.Role;
import com.introducaoJPA.demo.repository.RoleRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author crist
 */
public class RoleService {
    
    @Autowired
    RoleRepository roleRepository;
    
    
    public List<Role> findfirst3(){
          List<Role> lista = new ArrayList();
        List<Role> res = new ArrayList();
        lista = roleRepository.findAll();
        
        for (int i = 0; i < 3; i++) {
            if (lista.size() >= i) {
               res.add(lista.get(i)); 
            }
        }
        return res;
    }
}
