package com.Flipkart;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	OrderDao od;
	
	public String postthis(Order p) {
		return od.postthis(p);
	}
	
	public List<Object>getorders(){
		return od.getorders();
	}

}
