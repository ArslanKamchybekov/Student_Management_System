package com.arslankamchybekov.studentsystem.service;

import com.arslankamchybekov.studentsystem.model.Student;

import java.util.List;

public interface StudentService {

    public void saveStudent (Student student);
    public List<Student> getAllStudents ();
    public Student getStudent(Integer id);
    public void deleteStudent(Integer id);
}
