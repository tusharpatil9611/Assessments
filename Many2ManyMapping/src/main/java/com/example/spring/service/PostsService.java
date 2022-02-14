package com.example.spring.service;

import java.util.List;
import java.util.Set;

import com.example.spring.model.Post;
import com.example.spring.model.Tag;

public interface PostsService {

	public String listPosts();
	public Post savePosts(Post posts);
	public Post updatePosts(Post posts);
	public String deletePosts(Post posts);
	
}
