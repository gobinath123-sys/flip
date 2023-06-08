package com.Student.studentController;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Student.studentEntity.Student;
import com.Student.studentService.StudentService;
import com.student.StudentEntity.Products;


@RestController
public class StudentController {
	@Autowired
	StudentService stdSer;
	
	@PostMapping(value="/addAllDetails")
	public String addAlldet(@RequestBody List<Student> det) {
		return stdSer.addAlldet(det);
	}
	@GetMapping(value="/addAllDetail")
	public List<Products>addAllDetail(){
		return stdSer.addAllDetail();
	}
	

}
