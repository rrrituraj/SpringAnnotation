package com.college.controller;

import org.springframework.stereotype.Controller;

public class Student {
    private int StudentId;
    private String Name;
    private int ClassTeacher;
    private String college;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getClassTeacher() {
        return ClassTeacher;
    }

    public void setClassTeacher(int classTeacher) {
        ClassTeacher = classTeacher;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
