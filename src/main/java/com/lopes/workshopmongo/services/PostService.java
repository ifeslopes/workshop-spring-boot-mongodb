package com.lopes.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lopes.workshopmongo.domain.Post;
import com.lopes.workshopmongo.repository.PostRepository;
import com.lopes.workshopmongo.services.exception.ObjectNotfoundException;


@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotfoundException("Objeto não encontrado"));
		}
	
	public List<Post> findByTitle(String text){
		return repo.findByTitleContainingIgnoreCase(text);
	}

}
