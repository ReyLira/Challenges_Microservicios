package com.example.vallegrande.domain;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name="student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(name = "name", length = 50 , nullable = false)
    private String name;
}
