package com.student.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.StudentDao.StudentDao;
import com.student.StudentEntity.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao stdDao;
	public String adddet(List<Student>det) {
		return stdDao.adddet(det);
	}

}
