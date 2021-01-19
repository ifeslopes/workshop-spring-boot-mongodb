package com.lopes.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lopes.workshopmongo.domain.User;
import com.lopes.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		System.out.println("ola listaa qui  "+repo.findAll());
		
		return repo.findAll();
		
	}

}
