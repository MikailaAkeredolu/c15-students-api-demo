package com.tech552.cohort_15_students_api.repositories;

import com.tech552.cohort_15_students_api.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
