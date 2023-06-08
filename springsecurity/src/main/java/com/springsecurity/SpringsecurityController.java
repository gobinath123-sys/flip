package com.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringsecurityController {
	
	@GetMapping(value = "/hi")
	public String display() {
		return "i am gobi";
	}

}
