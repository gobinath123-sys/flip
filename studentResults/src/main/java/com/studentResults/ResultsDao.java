package com.studentResults;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ResultsDao {

	@Autowired
	ResultsRepository resRepo;

//	public ResultsEntity getStudentMarkByRollNumber(int roll) {
//
//		return resRepo.getFinalMarkByRoll(roll);
//	}

	public String setResults(ResultsEntity res) {
		resRepo.save(res);
		return "save succesfully";
	}

	public List<ResultsEntity> getFinalMarks() {

		return resRepo.findAll();
	}

	public ResultsEntity getFinalMarkByRoll(int roll) {

		return resRepo.getFinalMarkByRoll(roll);
	}

	public String findResults(List<ResultsEntity> resultsDetails) {
		resRepo.saveAll(resultsDetails);
		return "Save Succesfully";
	}

	public String updateByRoll(ResultsEntity a, int roll) {
		resRepo.save(a);
		return "Update Succesfully";
	}

	public String deleteByid(int id) {
		resRepo.deleteById(id);
		
		return "Delete Successfully";
	}

	
}
