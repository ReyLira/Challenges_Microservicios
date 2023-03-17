package com.example.vallegrande.application;

import com.example.vallegrande.domain.Student;
import com.example.vallegrande.domain.StudentRepository;
import com.example.vallegrande.domain.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> listartodos() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }
}
