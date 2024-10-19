/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain.user;

import javax.persistence.*;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;

/**
 *
 * @author User
 */

@Entity(name="users")
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")




public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String firstName;
    private String lastName;
    
    @Column(unique=true)
    private String document;
    
    @Column(unique=true)
    private String email;
    
    private String password;
    private BigDecimal balance;
    
    @Enumerated(EnumType.STRING)
    private UserType usertype;
    
    
    
    
    
            
    
    
    
}
