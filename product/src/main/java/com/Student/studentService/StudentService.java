package com.Student.studentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.studentDao.StudentDao;
import com.Student.studentEntity.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao stdDao;
	public String adddet(List<Student>det) {
		return stdDao.adddet(det);
	}

}
