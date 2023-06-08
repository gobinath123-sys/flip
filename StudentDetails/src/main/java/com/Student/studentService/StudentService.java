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
	public String addAlldet(List<Student>det) {
		return stdDao.addAlldet(det);
	}

}
