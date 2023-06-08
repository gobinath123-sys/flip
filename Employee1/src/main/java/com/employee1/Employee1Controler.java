package com.employee1;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;






@RestController

public class Employee1Controler {
	public static Logger  log = Logger.getLogger(Employee1Controler.class);
	@Autowired
	
	Employee1Service emp1Ser;
	@PostMapping(value = "/addemp")
	public String addEmployees(@RequestBody List<Employee1> e) {
		return emp1Ser.addEmployees(e);
	}
	@GetMapping(value="/getemp1ById")
	public List<Employee1> getemp1ById(){
		PropertyConfigurator.configure("logpropertice");
		log.info("successfully loggin");
		log.info("Started successfully");
		log.debug("no debug");
		log.error("no error");
		log.fatal("no fatal");
		log.warn("no warning");
		return emp1Ser.getemp1ById();
	}
	@GetMapping(value="/getempname")
	public List<Employee1>getemp1name() {
		return emp1Ser.getemp1Byname();
	}
	@GetMapping(value="/getemp1age")
	public List<Employee1>getemp1age() {
		return emp1Ser.getemp1Byage();
	}
	@GetMapping(value="/getById/{id}")
	public Employee1 getEmployeeById(@PathVariable int id) throws Employee1NotFoundException {
		return emp1Ser.getEmployee1ById(id);
	}
	@GetMapping(path="/getbyname/{name}")
	public List<Employee1> getName(@PathVariable   String name) throws Employee1NameNotFoundException{
		return emp1Ser.getName(name);
	}
	@GetMapping(value="/getBySalary/{salary}")
	public List<Employee1> getSalary(@PathVariable int salary) throws Employee1SalaryNotFoundException{
		return emp1Ser.getSalary(salary);
	}
	@GetMapping(value="/getEmployee1ByAge/{age}")
	public List<Employee1>getAge(@PathVariable int age)throws Employee1Employee1AgeNotFoundException{
		return emp1Ser.getAge(age);
	}
	@GetMapping(path="/getByGender/{gender}")
	public List<Employee1> getGender(@PathVariable String gender) throws EmployeeGenderNotFoundException{
		return emp1Ser.getGender(gender);
	}

}
