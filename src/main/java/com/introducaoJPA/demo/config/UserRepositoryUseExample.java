/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.introducaoJPA.demo.config;

import com.introducaoJPA.demo.entity.Role;
import com.introducaoJPA.demo.entity.User;
import com.introducaoJPA.demo.repository.RoleRepository;
import com.introducaoJPA.demo.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author crist
 */
@Component
public class UserRepositoryUseExample {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    
    public void executeExamplesRepositories(){
        
        //pegar toda a tabela
        List<User> lista = userRepository.findAll();
        
        if (lista.isEmpty()) {
            createUser("Cristiano Hahn", "cristianohahn.ch@gmail.com");
            createUser("Carlos", "Carlos.@gmail.com");
            createUser("Maria", "maria@gmail.com");
            lista = userRepository.findAll();
        }   

        // buscar onde id = 2
        User user01 = userRepository.getOne(lista.get(0).getId());
        
        //Atualizar user
        user01.setEmail("email@substituído");
        userRepository.save(user01);
        
        //deletar
        //userRepository.delete(user01);
        
        //deletar por id
        //userRepository.deleteById(user01.getId());
        
        //buscando por nome - implementado em UserRepository "Mágico"
        userRepository.findByName("Cristiano Hahn");
        
        //buscando com método com query anotada
        List<User> usersC = userRepository.findByNameStartWith("C");
        
        for (User user : usersC) {
            System.out.println(user.getName());
        }
        
        roleRepository.deleteAll();
        
        Role role01 = new Role();
        role01.setName("Role02");
        Role role02 = new Role();
        role02.setName("Role03");
        Role role03 = new Role();
        role03.setName("Role01");
        
        roleRepository.save(role01);
        roleRepository.save(role02);
        roleRepository.save(role03);
        
        
        
        
        //empty table
        //userRepository.deleteAll();    
    }
    
    public void createUser(String name, String email){
        User user = new User(name, email);
        userRepository.save(user);
    }    
}
