/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.introducaoJPA.demo.repository;

import com.introducaoJPA.demo.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author crist
 */
public interface UserRepository extends JpaRepository<User, Long>{
   
    //"Método mágico" findBy + nome da coluna gera internamente query
    User findByName(String name);
    
    //query personalizada
    @Query("select u from User u where u.name like ?1%")
    List<User> findByNameStartWith(String name);
    
    
}
