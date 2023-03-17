package com.example.vallegrande.rest;

import com.example.vallegrande.domain.Student;
import com.example.vallegrande.domain.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Challenge/v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<Student> listar() {
        return studentService.listartodos();
    }
    @PostMapping
    public Student create(@RequestBody Student student){
        return studentService.save(student);
    }

    @PutMapping
    public Student update(@RequestBody Student student){
        return studentService.save(student);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        studentService.delete(id);
    }
}
