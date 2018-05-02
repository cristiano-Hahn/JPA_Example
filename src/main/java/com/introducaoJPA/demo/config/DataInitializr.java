/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.introducaoJPA.demo.config;

import com.introducaoJPA.demo.entity.User;
import com.introducaoJPA.demo.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 *
 * @author crist
 */
@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {
    
    @Autowired
    UserRepositoryUseExample example;
    
    //tudo que está aqui é executado no boot da aplicação
    @Override
    public void onApplicationEvent(ContextRefreshedEvent e) {
        
        //executando exemplos de reposiorios
        example.executeExamplesRepositories();
    }
    
    
}
