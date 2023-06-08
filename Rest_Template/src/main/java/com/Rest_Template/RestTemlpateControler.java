package com.Rest_Template;

import java.util.ArrayList;  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemlpateControler {
	@Autowired
	RestTemplate rt;

	@GetMapping(value = "/get")
	public String get() {
		String url = "http://localhost:8080/hi";
		ResponseEntity<String> response1 = rt.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<String>() {
				});
		String res = response1.getBody();
		return "the response is " + res;
	}

	@GetMapping(value = "/getlist")
	public List<Product> addAllDetail() {
		String url = "http://localhost:8082/addAllProduct";
		ResponseEntity<List<Product>> response2 = rt.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Product>>() {
				});
		List<Product> res1=response2.getBody();
		return res1;
	}
	@GetMapping(value="/getnetprice")
	public List<Integer> getTaxByHsn(){
		String url1="http://localhost:8081/addAllDetail";
		String url2="http://localhost:8082/getTaxByHsn/";
		
		ResponseEntity<List<Product>> response3 = rt.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Product>>() {
				});
		List<Product> products=response3.getBody();
		
		List<Integer> netprice=new ArrayList<>();
		products.forEach(x->{
		ResponseEntity<Integer> tax=rt.exchange(url2+x.getHsn(),HttpMethod.GET,null,Integer.class);
			
			int t=tax.getBody();
			netprice.add(x.getPrice()+(x.getPrice()*t/100));
		});
		return netprice;
	}
	}


