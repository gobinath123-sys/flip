package com.studentResults;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ResultsRepository extends JpaRepository<ResultsEntity, Integer> {
	@Query(value = "select*from mark_sheet where roll_number = ?", nativeQuery = true)
	public ResultsEntity getFinalMarkByRoll(int roll);
}
