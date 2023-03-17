package com.example.vallegrande.domain;

import java.util.List;

public interface StudentService {

    List<Student> listartodos();

    Student save (Student student);

    Student update(Student student);

    void delete (Integer id );
}
