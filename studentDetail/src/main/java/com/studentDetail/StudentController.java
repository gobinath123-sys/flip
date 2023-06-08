package com.studentDetail;

import java.util.List;   

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
	public class StudentController {
		
		@Autowired
		StudentService studSer;
		
		
		@PostMapping(value ="/setStudent")
		public String setStudent(@RequestBody List<Student> det) throws StudentAgeIsBelow18 {
			return studSer.setStudent(det);
		}

}