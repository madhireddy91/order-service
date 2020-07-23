package com.capgemini.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.test.dto.OrderRequest;
import com.capgemini.test.entity.Order;
import com.capgemini.test.exception.OrderNotFoundException;
import com.capgemini.test.service.OrderSevice;

@RestController
public class OrderController {
	
	@Autowired
	private OrderSevice orderService;
	
	
	@PostMapping("/addOrder")
	public Order createOrder(@RequestBody OrderRequest orderRequest ) throws OrderNotFoundException{
		return orderService.saveOrder(orderRequest.getOrder());
	}
	
	@GetMapping("/fetchAllOrder")
	public List<Order> fetchAllOrder(){
		return orderService.findAllOrder();
	}

}
