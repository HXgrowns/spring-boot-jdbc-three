package com.thoughtworks.springdemo.controller;

import com.thoughtworks.springdemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.thoughtworks.springdemo.repository.StudentRepository;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(value = "/add")
    public String addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

    @GetMapping(value = "/queryByName")
    public Student queryByName(@RequestParam String name) {
        return studentRepository.queryByName(name);
    }

    @GetMapping(value = "/list")
    public Collection<Student> queryAll() {
        return studentRepository.queryAllStudent();
    }

    @DeleteMapping(value = "/delete")
    public String delete(String name) {
        return studentRepository.deleteByName(name);
    }

}
