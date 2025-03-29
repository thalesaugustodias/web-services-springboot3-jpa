package com.educandoweb.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

import java.util.List;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> FindAll() {
		return repository.findAll();
	}
	
	public Order FindById(Long id) {
		return repository.findById(id).get();
	}
}