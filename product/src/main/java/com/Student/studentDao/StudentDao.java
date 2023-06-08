package com.Student.studentDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Student.studentEntity.Student;
import com.Student.studentRepository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository stdRepo;
	public String addAlldet(List<Student>det) {
		stdRepo.saveAll(det);
		return "save successfully";
	}

}
