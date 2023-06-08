package com.studentMarkSheet;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class StudentMarkSheetDao {
	
	@Autowired
	StudentMarkSheetRepository stdRepo;
	
	public String setMark(List<MarkSheet> mark) {
		stdRepo.saveAll(mark);
		
		return "Save Successfully";
	}

}
