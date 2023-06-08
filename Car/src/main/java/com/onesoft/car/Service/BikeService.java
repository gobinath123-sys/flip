package com.onesoft.car.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.car.Dao.BikeDao;
import com.onesoft.car.Entity.Bike;

@Service

public class BikeService {

	@Autowired
	BikeDao bikeDao;

	public String addbike(Bike a) {
		return bikeDao.addbike(a);
	}

	public String addbikelist(List<Bike> a) {
		return bikeDao.addbikelist(a);
	}

	public Bike getBikeById(int id) {
		return bikeDao.getBikeById(id);
	}

	public String updatedbike(Bike id) {
		return bikeDao.updatedbike(id);
	}

	public String deleteBikeById(int id) {
		return bikeDao.deleteBikeById(id);
	}

	public List<Bike> getAllBikeById() {
		return bikeDao.getAllBikeById();
	}

	public String addbike1(Bike a) {
		return bikeDao.addbike1(a);

	}

	public List<Bike> getBikeBrand(String brand) {
		List<Bike> getbikebrand = bikeDao.getAllBikeById();
		return getbikebrand.stream().filter(x -> x.getBrand().equalsIgnoreCase(brand)).collect(Collectors.toList());
	}

	public List<Bike> getbikecolor(String color) {
		List<Bike> getcolor = bikeDao.getAllBikeById();
		return getcolor.stream().filter(x -> x.getColor().equalsIgnoreCase(color)).collect(Collectors.toList());
	}

	public List<Bike> getmodel(String model) {
		List<Bike> getmodel = bikeDao.getAllBikeById();
		return getmodel.stream().filter(x -> x.getModel().equalsIgnoreCase(model)).collect(Collectors.toList());
	}

	public List<Bike> getbrands(String brand) {
		return bikeDao.getByBrand(brand);
	}

	public List<Bike> getcolors(String color) {
		return bikeDao.getByColor(color);
	}

	public List<Bike> getcc(int cc) {
		return bikeDao.getByCc(cc);
	}

	public List<String> getbrands(int cc) {
		return bikeDao.getBrands(cc);
	}

}
