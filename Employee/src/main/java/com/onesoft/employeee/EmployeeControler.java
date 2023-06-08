package com.onesoft.employeee;

import java.util.List;     
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeControler {
	@Autowired
	EmployeeService empser;
	@PostMapping(value="/addemp")
	public String addEmployee(@RequestBody Employee e) {
		return empser.addEmployee(e);
	}
	@PostMapping(value="/addemp1")
	public String addEmployee(@RequestBody List<Employee> e) {
		return empser.addEmployee(e);
	}
	@GetMapping(value="/getById/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return empser.getEmployeeById(id);
	}
	@GetMapping(value="/getAllById")
	public List<Employee> getAllEmployeeById(){
		return empser.getAllEmployeeById();
	}
	
	@DeleteMapping(value="/delById/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		return empser.deleteEmployeeById(id);
	}
	@PutMapping(value="/updatedemp/{id}")
	public String updatedEmployee(@RequestBody Employee id) {
		return empser.updatedEmployee(id);
	}
	@GetMapping(value="/getempbyGender/{gender}")
	public List<Employee>getbygender(@PathVariable String gender){
		return empser.getbygender(gender);
	}
	

}
