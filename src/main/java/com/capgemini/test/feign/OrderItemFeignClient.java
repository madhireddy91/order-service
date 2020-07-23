package com.capgemini.test.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capgemini.test.entity.OrderItem;

@FeignClient(value="order-item-service-microservice", url="http://localhost:9091/item/createOrder")
public interface OrderItemFeignClient {
	
	@PostMapping("/createOrder")
	public OrderItem createOrderItem(@RequestBody OrderItem orderItem);
	
	@GetMapping("/retrevieOrderItem")
	public List<OrderItem> retrevieOrderItem();

}
