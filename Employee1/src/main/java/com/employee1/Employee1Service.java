package com.employee1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service

public class Employee1Service {
	@Autowired
	Employee1Dao emp1Dao;

	public String addEmployees(List<Employee1> e) {
		return emp1Dao.addEmployee1(e);
	}
	public List<Employee1> getemp1ById(){
		return emp1Dao.getemp1ById();
	}
	public List<Employee1> getemp1Byname(){
		return emp1Dao.getemp1Byname();
	}
	public List<Employee1> getemp1Byage(){
		return emp1Dao.getemp1Byage();
	}
	public Employee1 getEmployee1ById(int id) throws Employee1NotFoundException {
		return emp1Dao.getEmployee1ById(id);
	}
	public List<Employee1> getName(String name) throws Employee1NameNotFoundException{
		return emp1Dao.getName(name);
	}
	public List<Employee1> getSalary(int salary) throws Employee1SalaryNotFoundException{
		return emp1Dao.getSalary(salary);
	}
	public List<Employee1> getAge(int age) throws Employee1Employee1AgeNotFoundException{
		return emp1Dao.getAge(age);
	}
	public List<Employee1> getGender(String gender) throws EmployeeGenderNotFoundException{
		return emp1Dao.getGender(gender);
	}

}
