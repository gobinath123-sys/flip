package com.Flipkart;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class OrderController {
	@Autowired
	OrderService os;
	
	@PostMapping(value="/flipkartpost")
	public String postthis(@RequestBody Order p) {
		return os.postthis(p);
	}

	@GetMapping(value="/getorders")
	public List<Object> getorders(){
		return os.getorders();
	}

}
