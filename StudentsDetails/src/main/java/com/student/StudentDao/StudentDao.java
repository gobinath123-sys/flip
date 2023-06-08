package com.student.StudentDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.StudentEntity.Student;
import com.student.StudentRepository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository stdRepo;
	public String adddet(List<Student>det) {
		stdRepo.saveAll(det);
		return "save successfully";
	}

}
