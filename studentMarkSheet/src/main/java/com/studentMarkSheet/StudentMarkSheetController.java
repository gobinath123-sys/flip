package com.studentMarkSheet;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentMarkSheetController {
	
	@Autowired 
	StudentMarkSheetService stdSer;
	
	@PostMapping(value ="/setMark")
	public String setMark(@RequestBody List<MarkSheet> mark) {
		return stdSer.setMark(mark);
	}

}
