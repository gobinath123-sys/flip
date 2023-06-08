package com.onesoft.car.Service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.car.Dao.CarDao;
import com.onesoft.car.Entity.Car;



@Service
public class CarService {
	@Autowired
CarDao carDao;
	public String addcar(Car a) {
		return carDao.addcar(a);
	}
	public String addcarlist(List<Car> a) {
		return carDao.addcarlist(a);
	}
	public Car getCarById(int id) {
		return carDao.getCarById(id);
	}
	public String updatedcar(Car id) {
		return carDao.updatedcar(id);
	}
	public String deleteCarById(int id) {
		return carDao.deleteCarById(id);
	}
	public List<Car> getAllCarById(){
		return carDao.getAllCarById();
	}
	public String namechange(int id,Car brand) {
		return carDao.namechange(id,brand);
	}
	public List<Car>getCarBrand(String barnd) {
		List<Car>carbrand=carDao.getAllCarById();
		return carbrand.stream().filter(x->x.getBrand().equalsIgnoreCase(barnd)).toList();
	}
	public List<Car>getCarmodel(String model) {
		List<Car>carmodel=carDao.getAllCarById();
		return carmodel.stream().filter(x->x.getModel().equalsIgnoreCase(model)).toList();
	}
	public List<Car>getCarcolor(String color) {
		List<Car>carcolor=carDao.getAllCarById();
		return carcolor.stream().filter(x->x.getColor().equalsIgnoreCase(color)).toList();
	}
	public List<Car>getcar(){
		List<Car>cardet=carDao.getAllCarById();
		cardet.forEach(x->{			
			if (x.getCc() <= 300 && x.getCc() >= 120) {
		
			x.setPrice(x.getPrice()+x.getPrice()*5/100);
		} else if (x.getCc() >=300 && x.getCc() <= 500) {
			x.setPrice(x.getPrice()+x.getPrice()*10/100);
		} else if (x.getCc() <= 500) {
			x.setPrice(x.getPrice()+x.getPrice()*15/100);
		}} 
		);
		return cardet;
	}

		
		
	}

