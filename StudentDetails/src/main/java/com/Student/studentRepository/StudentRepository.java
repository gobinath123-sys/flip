package com.Student.studentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Student.studentEntity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
