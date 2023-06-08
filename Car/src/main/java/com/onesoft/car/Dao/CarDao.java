package com.onesoft.car.Dao;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.car.Entity.Car;
import com.onesoft.car.Repository.CarRepository;





@Repository
public class CarDao {
	@Autowired
	CarRepository carRepo;
	public String addcar(Car a) {
		carRepo.save(a);
		return "Details Add Successfully";
	}
	public String addcarlist(List<Car> a) {
		carRepo.saveAll(a);
		return "Car List Add Successfully";
	}
	public Car getCarById(int id) {
		return carRepo.findById(id).get();
	}
	public String updatedcar(Car id) {
		carRepo.save(id);
		return "Updated Successfully";
	}
	public String deleteCarById(int id) {
		carRepo.deleteById(id);
		return "deleted successfull";
	}
	public List<Car> getAllCarById(){
		return carRepo.findAll();
	}
	public String namechange(int id,Car brand) {
		carRepo.findById(id).get();
		((Car) carRepo).getBrand();
		return "Updated Success";
	}
}
