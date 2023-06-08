package com.Student.studentController;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Student.studentEntity.Student;
import com.Student.studentService.StudentService;


@RestController
public class StudentController {
	@Autowired
	StudentService stdSer;
	
	@PostMapping(value="/addAllDetails")
	public String addAlldet(@RequestBody List<Student> det) {
		return stdSer.addAlldet(det);
	}
	

}
