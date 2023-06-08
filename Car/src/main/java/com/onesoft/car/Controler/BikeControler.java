package com.onesoft.car.Controler;

import java.util.List;      

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onesoft.car.Entity.Bike;
import com.onesoft.car.Service.BikeService;

@RequestMapping(value="/bike")
@RestController
public class BikeControler {
	@Autowired
	BikeService bikeSer;
	@PutMapping(value="/addbike")
	public String addbike(@RequestBody Bike a) {
		return bikeSer.addbike(a);
	}
	@PutMapping(value="/addbikelist")
	public String addbikelist(@RequestBody List<Bike> a) {
		return bikeSer.addbikelist(a);
	}
	@GetMapping(value="/getById/{id}")
	public Bike getBikeById(@PathVariable int id) {
		return bikeSer.getBikeById(id);
	}
	@PutMapping(value="/updatedbike/{id}")
	public String updatedbike(@RequestBody Bike id) {
		return bikeSer.updatedbike(id);
	}
	@DeleteMapping(value="/delById/{id}")
	public String deleteBikeById(@PathVariable int id) {
		return bikeSer.deleteBikeById(id);
	}
	@GetMapping(value="/getbikeById")
	public List<Bike> getAllBikeById(){
		return bikeSer.getAllBikeById();
	}
	@PostMapping(value="/addbike1")
	public String addbike1(@RequestBody Bike a) {
		return bikeSer.addbike1(a);
	}
	@GetMapping(value="/getBikeBrand/{brand}")
	public List<Bike>getBikeBrand(@PathVariable String brand) {
		return bikeSer.getBikeBrand(brand);
	}
	@GetMapping(value="/getbikecolor/{color}")
	public List<Bike>getbikecolor(@PathVariable String color){
		return bikeSer.getbikecolor(color);
	}
	@GetMapping(value="/getbikemodel/{model}")
	public List<Bike>getmodel(@PathVariable String model){
		return bikeSer.getmodel(model); 
	}
	@GetMapping(value="/getbrand/{brand}")
	public List<Bike>getbrands(@PathVariable String brand){
		return bikeSer.getbrands(brand);
	}
	@GetMapping(value="/getcolors/{color}")
	public List<Bike>getcolors(@PathVariable String color){
		return bikeSer.getcolors(color);
	}
	@GetMapping(value="/getcc/{cc}")
	public List<Bike>getcc(@PathVariable int cc){
		return bikeSer.getcc(cc);
	}
	@GetMapping(value="/getBrand/{cc}")
	public List<String>getBrand(@PathVariable int cc){
		return bikeSer.getbrands(cc);
	}


}
