package com.lopes.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lopes.workshopmongo.domain.User;
import com.lopes.workshopmongo.repository.UserRepository;
import com.lopes.workshopmongo.services.exception.ObjectNotfoundException;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		
		
		return repo.findAll();
		
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotfoundException("Objeto não encontrado"));
		}
	


}
