package com.thoughtworks.springdemo.repository;


import com.thoughtworks.springdemo.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentRepository {

    private Map<String, Student> nameToStudent;

    public StudentRepository() {
        this.nameToStudent = new HashMap();
    }

    public String addStudent(Student student) {
        if (queryByName(student.getName()) == null) {
            this.nameToStudent.put(student.getName(), student);
            return "添加成功";
        }
        return "姓名重复";
    }

    public Collection<Student> queryAllStudent() {
        List<Student> students = new ArrayList<>();
        return this.nameToStudent.values();
    }

    public Student queryByName(String name) {
        return this.nameToStudent.get(name);
    }

    public String deleteByName(String name) {
        if (queryByName(name) == null) {
            return "该学生不存在";
        }
        this.nameToStudent.remove(name);
        return "删除成功";
    }
}
