package com.onesoft.employeee;

import java.util.List; 
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao empDao;

	public String addEmployee(Employee e) {
		return empDao.addEmployee(e);
	}

	public String addEmployee(List<Employee> e) {
		return empDao.addEmployee(e);
	}

	public Employee getEmployeeById(int id) {
		return empDao.getEmployeeById(id);
	}

	public List<Employee> getAllEmployeeById() {
		return empDao.getAllEmployeeById();
	}

	public String deleteEmployeeById(int id) {
		return empDao.deleteEmployeeById(id);
	}

	public String updatedEmployee(Employee id) {
		return empDao.updatedEmployee(id);
	}

	public List<Employee> getbygender(String gender) {
		List<Employee> allemp = empDao.getAllEmployeeById();
		return allemp.stream().filter(x -> x.getGender().equals(gender)).collect(Collectors.toList());
	}

}
