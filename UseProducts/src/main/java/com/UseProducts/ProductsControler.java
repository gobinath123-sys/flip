package com.UseProducts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Rest_Template.Product;


@RestController
public class ProductsControler {
	@Autowired
	RestTemplate rt;

	@GetMapping(value = "/getallProduct")
	public List<Product> addAllDetail() {
		String url1 = "http://localhost:8081/addAllDetail";
		String url2 = "http://localhost:8082/getTaxByHsn/";
		ResponseEntity<List<Product>> response1 = rt.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Product>>() {
				});
		List<Product> products = response1.getBody();
		products.forEach(x -> {
			ResponseEntity<Integer> tax = rt.exchange(url2 + x.getHsn(), HttpMethod.GET, null, Integer.class);
			int t = tax.getBody();
			x.setPrice(x.getPrice() + (x.getPrice() * t / 100));
		});
		return products;
	}
	
	
	

}
