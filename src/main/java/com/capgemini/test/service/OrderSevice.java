package com.capgemini.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.test.entity.Order;
import com.capgemini.test.repository.OrderItemRepository;
import com.capgemini.test.repository.OrderRepository;

@Service
public class OrderSevice {

	@Autowired
	private OrderRepository orderRepo;
	
	@Autowired
	private OrderItemRepository orderItemRepo;
	
	
	public Order saveOrder(Order order) {
		return orderRepo.save(order);
	}
	
	public List<Order> findAllOrder() {
		return orderRepo.findAll();
	}
}
