package com.studentDetail;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface StudentRepository  extends JpaRepository<Student,Integer>{
	@Query(value = "select * from student where age = ?", nativeQuery = true)
	public List<Student> getAge(int age);
}
