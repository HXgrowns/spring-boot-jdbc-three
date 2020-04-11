package com.thoughtworks.springdemo.service;

import com.thoughtworks.springdemo.entity.Student;
import com.thoughtworks.springdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public String addStudent(Student student) {
        Student byName = studentRepository.findByName(student.getName());
        if (byName == null) {
            studentRepository.save(student);
            return "保存成功";
        }
        return "姓名重复";
    }

    public Student queryByName(String name) {
        return studentRepository.findByName(name);
    }

    public List<Student> getStudent() {
        List<Student> students = new ArrayList<>();
        Iterable<Student> all = studentRepository.findAll();
        for (Student student : all) {
            students.add(student);
        }
        return students;
    }

    public String delete(String name) {
        if (studentRepository.deleteByName(name)) {
            return "删除成功";
        }
        return "删除失败";
    }
}
