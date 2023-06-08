package com.Flipkart;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepo extends  JpaRepository<Order,Integer> {
	@Query(value="select flipkart_order.city,flipkart_product.name from flipkart_order join flipkart_product on flipkart_order.order_id=flipkart_product.order_id_fk",nativeQuery=true)
	public List<Object>getorder();

}
