package com.example.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.workshopmongo.domain.Post;
import com.example.workshopmongo.services.PostService;

@RestController
@RequestMapping(value = "/posts")
public class PostResource{
	
	@Autowired
	PostService postService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Post findById(@PathVariable String id) {
		return postService.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Post> findAll(){
		return postService.findAll();
	}
}
