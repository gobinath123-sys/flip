package com.studentDetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDao {

	@Autowired
	StudentRepository studRepo;

	public String setStudent(List<Student> det) throws StudentAgeIsBelow18 {
		studRepo.saveAll(det);
		return "Save Succesfully";
	
	}

}
