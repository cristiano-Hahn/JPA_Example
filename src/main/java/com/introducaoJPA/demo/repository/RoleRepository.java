/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.introducaoJPA.demo.repository;

import com.introducaoJPA.demo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author crist
 */
public interface RoleRepository extends JpaRepository<Role, Long>{
    
    Role findByName(String name);
}
