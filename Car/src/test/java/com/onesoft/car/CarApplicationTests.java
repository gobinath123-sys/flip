package com.onesoft.car;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.onesoft.car.Controler.BikeControler;

@SpringBootTest
class CarApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	BikeControler bc;
	public void testgetAll() {
		 assertNotNull(bc.getAllBikeById());
	}
	

}
