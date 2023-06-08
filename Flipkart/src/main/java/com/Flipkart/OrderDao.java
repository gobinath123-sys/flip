package com.Flipkart;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
	@Autowired
	OrderRepo or;
	
	public String postthis(Order p) {
		or.save(p);
		return "Saved successfully";
	}
	
	public List<Object>getorders(){
		return or.getorder();
	}

}
