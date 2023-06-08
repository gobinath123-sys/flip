package com.studentResults;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultsService {

	@Autowired
	ResultsDao resDao;

//	public ResultsEntity getStudentMarkByRollNumber(int roll) {
//
//		return resDao.getFinalMarkByRoll(roll);
//	}

	public String setResults(ResultsEntity res) {

		return resDao.setResults(res);
	}

	public List<ResultsEntity> getFinalMarks() {

		return resDao.getFinalMarks();
	}

	public ResultsEntity getFinalMarkByRoll(int roll) {

		return resDao.getFinalMarkByRoll(roll);
	}
//postDb;
	public String findResults(List<ResultsEntity> resultsDetails) {
		
		return resDao.findResults(resultsDetails);
	}

	public int getTotalByRoll(int roll) {
		List<ResultsEntity> allDetails = resDao.getFinalMarks();
		int temp = 0;
		for(ResultsEntity x:allDetails) {
			if(x.getRollNumber() == roll) {
				temp=x.getTotalMarks();
			}
		}
		
		return temp;
	}

	public String updateByRoll(ResultsEntity a, int roll) {
		
		return  resDao.updateByRoll(a,roll);
	}

	public String deleteByid(int id) {
		
		return resDao.deleteByid(id);
	}


}

