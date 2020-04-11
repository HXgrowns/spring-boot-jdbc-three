package com.thoughtworks.springdemo.controller;

import com.thoughtworks.springdemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.thoughtworks.springdemo.service.StudentService;

import java.util.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/save")
    public String addStudent(Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping(value = "/findByName")
    public Student queryByName(@RequestParam String name) {
        return studentService.queryByName(name);
    }

    @GetMapping(value = "/findAll")
    public List<Student> getStudent() {
        return studentService.getStudent();
    }

    @DeleteMapping(value = "/deleteByName")
    public String delete(String name) {
        return studentService.delete(name);
    }
}
