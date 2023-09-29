package com.example.Student.Management.System.controllers;

import com.example.Student.Management.System.models.Student;
import com.example.Student.Management.System.repos.StudentRepository;
import com.example.Student.Management.System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping({"/showEmployees","/list","/"})
    public ModelAndView showStudents(){
        ModelAndView mav = new ModelAndView("list-students");
        List<Student>list =  studentRepository.findAll();
        mav.addObject("students",list);
        return mav;
    }

    @GetMapping("/StudentForm")
    public ModelAndView studentForm(){
        ModelAndView mav = new ModelAndView("studentForm");
        Student newStudent = new Student();
        mav.addObject("student",newStudent);
        return mav;

    }

    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute Student student){
        studentRepository.save(student);
        return "redirect:/list";
    }

    @GetMapping("/updateForm")
    public ModelAndView updateEmployee(@RequestParam Long student_id){
        ModelAndView mav = new ModelAndView("studentForm");
        Student student = studentRepository.findById(student_id).get();
        mav.addObject("student",student);
        return mav;
    }

    @GetMapping ("/delete")
    public String deleteStudent(@RequestParam Long id){
        studentRepository.deleteById(id);
        return "redirect:/list";
    }

}
