package com.studentDetail;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

	@Autowired
	StudentDao studDao;

	public String setStudent(List<Student> det) throws StudentAgeIsBelow18 {
	
		
		List<Student> below18Age=det.stream().filter(x->x.getAge()<18).collect(Collectors.toList());
		
		if(below18Age.isEmpty()) {
			return studDao.setStudent(det);
		}
		else {
			throw new StudentAgeIsBelow18("Age error");
		}
		
		

	}
		
			
}
