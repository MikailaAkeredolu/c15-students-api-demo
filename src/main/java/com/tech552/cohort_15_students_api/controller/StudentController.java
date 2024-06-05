package com.tech552.cohort_15_students_api.controller;

import com.tech552.cohort_15_students_api.model.Student;
import com.tech552.cohort_15_students_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    //create a student and add them to the db
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }

    //get a list of all students in the db
    @GetMapping("/students")
    public Iterable<Student> getAllStudents(){
        return studentService.getStudents();
    }


}
