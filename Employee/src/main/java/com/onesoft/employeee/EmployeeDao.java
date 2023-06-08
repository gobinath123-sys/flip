package com.onesoft.employeee;

import java.util.List;     
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository empRepo;
	public String addEmployee(Employee e) {
		empRepo.save(e);
		return "Successfully save";
	}
		public String addEmployee(List<Employee> e) {
			empRepo.saveAll(e);
			return "Successfully save";
		}
		public Employee getEmployeeById(int id) {
			return empRepo.findById(id).get();
		}
		
		public List<Employee> getAllEmployeeById(){
			return empRepo.findAll();
		}
		public String deleteEmployeeById(int id) {
			empRepo.deleteById(id);
			return "deleted successfull";
		}
		public String updatedEmployee(Employee id) {
			empRepo.save(id);
			return "Updated Successfully";
		}
		

}
