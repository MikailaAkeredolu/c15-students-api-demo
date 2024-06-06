package com.tech552.cohort_15_students_api.service;

import com.tech552.cohort_15_students_api.model.Student;
import com.tech552.cohort_15_students_api.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    //delete a student

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

    //get a student by id

    public Optional<Student> getStudentById(Long id){
        return studentRepository.findById(id);
    }


    //Update student
    public void updateStudent(Long id, Student student ){
        for (Student s:  getStudents() ) {
            if(s.getId().equals(id)){
                studentRepository.save(student);
            }
        }

//        student.setId(id);
//        studentRepository.save(student);

    }




}
