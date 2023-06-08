package com.employee1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface Employee1Repository extends JpaRepository<Employee1, Integer> {
	@Query(value = "select*from employees where name like ?", nativeQuery = true)
	public List<Employee1> getEmpName(String name);
	
	@Query(value = "select *from employees where salary = ?", nativeQuery = true)
	public List<Employee1> getAllsalary(int salary);
	
	@Query(value = "select * from employees where age = ?", nativeQuery = true)
	public List<Employee1> getAge(int age);

	@Query(value = "select * from employees where gender like ?", nativeQuery = true)
	public List<Employee1> getbyGender(String gender);

	



}
