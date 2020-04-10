package com.thoughtworks.springdemo.controller;

import com.thoughtworks.springdemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.thoughtworks.springdemo.repository.StudentRepository;

import java.util.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(value = "/save")
    public String addStudent(Student student) {
        Student byName = studentRepository.findByName(student.getName());
        if (byName == null) {
            studentRepository.save(student);
            return "保存成功";
        }
        return "姓名重复";
    }

    @GetMapping(value = "/findByName")
    public Student queryByName(@RequestParam String name) {
        return studentRepository.findByName(name);
    }

    @GetMapping(value = "/findAll")
    public List<Student> getStudent() {
        List<Student> students = new ArrayList<>();
        Iterable<Student> all = studentRepository.findAll();
        for (Student student : all) {
            students.add(student);
        }
        return students;
    }

    @DeleteMapping(value = "/deleteByName")
    public String delete(String name) {
        if (studentRepository.deleteByName(name)) {
            return "删除成功";
        }
        return "删除失败";
    }
}
