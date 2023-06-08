package com.employee1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Employee1Dao {
	@Autowired
	Employee1Repository emp1Repo;

	public String addEmployee1(List<Employee1> e) {
		emp1Repo.saveAll(e);
		return "Successfully save";
	}

	public List<Employee1> getemp1ById() {
		return emp1Repo.findAll();
	}

	public List<Employee1> getemp1Byname() {
		return emp1Repo.findAll();
	}

	public List<Employee1> getemp1Byage() {
		return emp1Repo.findAll();
	}

	public Employee1 getEmployee1ById1(int id) throws Employee1NotFoundException {
		return emp1Repo.findById(id).orElseThrow(() -> new Employee1NotFoundException());
	}

	public Employee1 getEmployee1ById(int id) throws Employee1NotFoundException {
		return emp1Repo.findById(id).orElseThrow(() -> new Employee1NotFoundException());
	}

	public List<Employee1> getName(String name) throws Employee1NameNotFoundException {
		if (emp1Repo.getEmpName(name).isEmpty() == true) {
			throw new Employee1NameNotFoundException();
		} else {
			return emp1Repo.getEmpName(name);
		}
	}

	public List<Employee1> getSalary(int salary) throws Employee1SalaryNotFoundException {
		if( emp1Repo.getAllsalary(salary).isEmpty()==true) {
			throw new Employee1SalaryNotFoundException();
		}
		else {
			return emp1Repo.getAllsalary(salary);
		}
	}
	public List<Employee1> getAge1(int age) {
		return emp1Repo.getAge(age);
	}

	public List<Employee1> getAge(int age) throws Employee1Employee1AgeNotFoundException {
		if (emp1Repo.getAge(age).isEmpty() == true) {
			throw new Employee1Employee1AgeNotFoundException();
		} else {
			return emp1Repo.getAge(age);

		}
	}

	public List<Employee1> getGender(String gender) throws EmployeeGenderNotFoundException {
		if (emp1Repo.getbyGender(gender).isEmpty() == true) {
			throw new EmployeeGenderNotFoundException();
		} else {
			return emp1Repo.getbyGender(gender);
		}
	}

}
