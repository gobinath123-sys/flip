package com.student.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.StudentEntity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{

}
