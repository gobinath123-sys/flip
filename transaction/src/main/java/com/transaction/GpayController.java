package com.transaction;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;

@RestController
public class GpayController {
	@Autowired
	SenderRepo sr;
	@Autowired
	ReciverRepo rr;
	
	@Transactional
	@PostMapping(value="/postThis")
	public String postthis(@RequestBody Gpay g) {
		sr.save(g.getSender());
		int num=10/0;
		rr.save(g.getReciver());
		return "transection successfully";
	}

}
