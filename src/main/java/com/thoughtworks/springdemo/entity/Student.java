package com.thoughtworks.springdemo.entity;

public class Student {
    private String name;
    private String sex;
    private String classInfo;

    public Student(String name, String sex, String classInfo) {
        this.name = name;
        this.sex = sex;
        this.classInfo = classInfo;
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
