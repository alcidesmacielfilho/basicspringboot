/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.repositories;

import com.example.domain.user.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author User
 */
public interface  UserRepository extends JpaRepository< User , Long> {
   Optional<User> findUserByDocument(String document);
   Optional<User> findUserById(Long id);   
}
