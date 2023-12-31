package com.example.workshopmongo.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshopmongo.domain.Post;
import com.example.workshopmongo.repository.PostRepository;

@Service
public class PostService{
	
	@Autowired
	private PostRepository postRepository;

	public Post findById(String id) {
		return postRepository.findById(id).get();
	}

	public List<Post> findAll() {
		List<Post> posts = postRepository.findAll();
		return posts;
	}
	
	public List<Post> findByTitle(String text){
		return postRepository.findByTitle(text);
	}
	
	public List<Post>fullSearch(String text, Date minDate, Date maxDate){
		maxDate = new Date(maxDate.getTime() + 24 *60 *60 * 1000);
		return postRepository.fullSearch(text, minDate, maxDate);
	}
}
