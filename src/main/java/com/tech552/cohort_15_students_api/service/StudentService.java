package com.tech552.cohort_15_students_api.service;

import com.tech552.cohort_15_students_api.model.Student;
import com.tech552.cohort_15_students_api.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    //Save a student in db
    public void saveStudent(Student student){
        studentRepository.save(student);
    }

    public Iterable<Student> getStudents(){
        return studentRepository.findAll();
    }


}
