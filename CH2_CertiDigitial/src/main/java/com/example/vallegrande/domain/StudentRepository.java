package com.example.vallegrande.domain;

import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student, Integer> { ;
}
