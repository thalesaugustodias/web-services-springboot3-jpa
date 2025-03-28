package com.educandoweb.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> FindAll() {
		return repository.findAll();
	}
	
	public User FindById(Long id) {
		return repository.findById(id).get();
	}
}