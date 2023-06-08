package com.studentMarkSheet;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentMarkSheetService {
	@Autowired 
	StudentMarkSheetDao stdDao;

	public String setMark(List<MarkSheet> mark) {
		
		for(MarkSheet x : mark) {
		int total1=	x.getSem1Practicals()+x.getSem1Theory();
		x.setSem1Total(total1);
		
		int total2 = x.getSem2Practicals()+x.getSem2Theory();
		x.setSem2Total(total2);;
		}
		
		return stdDao.setMark(mark) ;
	}

}
