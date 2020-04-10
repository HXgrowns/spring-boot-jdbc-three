package com.thoughtworks.springdemo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("student")
public class Student {
    @Id
    private Integer id;
    @Column("name")
    private String name;
    @Column("sex")
    private String sex;
    @Column("classInfo")
    private String classInfo;

    public Student(String name, String sex, String classInfo) {
        this.name = name;
        this.sex = sex;
        this.classInfo = classInfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(String classInfo) {
        this.classInfo = classInfo;
    }

    @Override
    public String toString() {
        return "name='" + name +
                ", sex='" + sex +
                ", classInfo='" + classInfo;
    }
}
