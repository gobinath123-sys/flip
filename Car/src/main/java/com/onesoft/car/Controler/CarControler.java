package com.onesoft.car.Controler;

import java.util.List;   

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.onesoft.car.Entity.Car;
import com.onesoft.car.Entity.Employees;
import com.onesoft.car.Service.CarService;



@RequestMapping(value="/car")
@RestController
public class CarControler {
	

	private static final List<Employees> Employees = null;
	@Autowired
	RestTemplate rt;
	CarService carSer;
	@PutMapping(value="/addcar")
	public String addcar(@RequestBody Car a) {
		return carSer.addcar(a);
	}
	@PutMapping(value="/addcarlist")
	public String addcarlist(@RequestBody List<Car> a) {
		return carSer.addcarlist(a);
	}
	@GetMapping(value="/getById/{id}")
	public Car getCarById(@PathVariable int id) {
		return carSer.getCarById(id);
	}
	@PutMapping(value="/updatedcar/{id}")
	public String updatedcar(@RequestBody Car id) {
		return carSer.updatedcar(id);
	}
	@DeleteMapping(value="/delById/{id}")
	public String deleteCarById(@PathVariable int id) {
		return carSer.deleteCarById(id);
	}
	@GetMapping(value="/getAllById")
	public List<Car> getAllCarById(){
		return carSer.getAllCarById();
	}
	@PutMapping(value="/namechange/{id}/{brand}")
	public String namechange(@PathVariable int id, @PathVariable Car brand) {
		return carSer.namechange(id,brand);
	}
	@GetMapping(value="/getCarBrand/{brand}")
	public List<Car>getCarBrand(@PathVariable String brand) {
		return carSer.getCarBrand(brand);
	}
	@GetMapping(value="/getCarmodel/{model}")
	public List<Car>getCarmodel(@PathVariable String model) {
		return carSer.getCarmodel(model);
	}
	@GetMapping(value="/getCarcolor/{color}")
	public List<Car>getCarcolor(@PathVariable String color) {
		return carSer.getCarcolor(color);
	}
	@GetMapping(value="/getCarpriceinc")
	public List<Car>getCar() {
		return carSer. getcar();
	}
	@GetMapping(value = "/allEmployees")
	public List<Employees> addAllemp() {
		String url = "http://localhost:8082/addAllemp";
		ResponseEntity<List<Employees>> res = rt.postForObject(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Employees>>() {
		});
		return Employees;
	}

}
