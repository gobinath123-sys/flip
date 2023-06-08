package com.onesoft.car.Dao;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.car.Entity.Bike;
import com.onesoft.car.Repository.BikeRepository;

@Repository

public class BikeDao {
	@Autowired
	BikeRepository bikeRepo;
	public String addbike(Bike a) {
		bikeRepo.save(a);
		return "Details Add Successfully";
	}
	public String addbikelist(List<Bike> a) {
		bikeRepo.saveAll(a);
		return "Bike List Add Successfully";
	}
	public Bike getBikeById(int id) {
		return bikeRepo.findById(id).get();
	}
	public String updatedbike(Bike id) {
		bikeRepo.save(id);
		return "Updated Successfully";
	}
	public String deleteBikeById(int id) {
		bikeRepo.deleteById(id);
		return "deleted successfull";
	}
	public List<Bike> getAllBikeById(){
		return bikeRepo.findAll();
	}
	public String addbike1(Bike a) {
		bikeRepo.save(a);
		return "bike detail added";
	}
	public List<Bike>getByBrand(String brand){
		return bikeRepo.getByBrand(brand);
	}
	public List<Bike>getByColor(String color){
		return bikeRepo.getByColor(color);
	}
	public List<Bike>getByCc(int cc){
		return bikeRepo.getByCc(cc);
	}
	public List<String>getBrands(int cc){
		return bikeRepo.getBrands(cc);
	}

}
