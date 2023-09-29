package com.example.Student.Management.System.service.impl;

import com.example.Student.Management.System.models.Student;
import com.example.Student.Management.System.repos.StudentRepository;
import com.example.Student.Management.System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> showStudents() {
        return studentRepository.findAll();
    }
}
