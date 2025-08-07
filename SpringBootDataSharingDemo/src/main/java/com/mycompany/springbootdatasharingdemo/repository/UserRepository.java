/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.springbootdatasharingdemo.repository;

import com.mycompany.springbootdatasharingdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author 20113
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
