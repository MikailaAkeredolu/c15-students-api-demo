package com.tech552.cohort_15_students_api.controller;

import com.tech552.cohort_15_students_api.model.Student;
import com.tech552.cohort_15_students_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.Optional;

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

    //Endpoint to delete a student
    @DeleteMapping("/students/{id}")
    public void deleteStudentById(@PathVariable Long id){
         studentService.deleteStudent(id);
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getStudent(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/students/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody Student student ){
        studentService.updateStudent(id, student);
    }




}
