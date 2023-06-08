package com.employee1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Employee1Exception {
	@ExceptionHandler(Employee1NotFoundException.class)
	public ResponseEntity<Object> idNotHere(){
		return new ResponseEntity<>("No employee is present",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(Employee1NameNotFoundException.class)
	public ResponseEntity<Object> nameNotHere(){
		return new ResponseEntity<>("this name is not available",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(Employee1Employee1AgeNotFoundException.class)
	public ResponseEntity<Object> ageNotHere(){
		return new ResponseEntity<>("Age is not available in this id",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(Employee1SalaryNotFoundException.class)
	public ResponseEntity<Object> salaryNotHere(){
		return new ResponseEntity<>("Salary is not available in this id",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(EmployeeGenderNotFoundException.class)
	public ResponseEntity<Object> genderNotHere(){
		return new ResponseEntity<>("Gender is not available in this id",HttpStatus.NOT_FOUND);
	}

}
