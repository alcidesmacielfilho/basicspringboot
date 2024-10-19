/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain.transaction;

import javax.persistence.*;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.example.domain.user.User;
/**
 *
 * @author User
 */
@Entity(name="transactions")
@Table(name="transactions")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")

public class Transaction {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    
    private BigDecimal amount;
    
    @ManyToOne
    @JoinColumn(name="sender_id")
    private User sender;
    
    @ManyToOne
    @JoinColumn(name="receiver_id")
    private User receiver;
    
    private LocalDateTime timestamp;
    
    
    
    
            
}
