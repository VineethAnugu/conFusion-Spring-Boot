package com.vineeth.confusion.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vineeth.confusion.models.Comment;
import com.vineeth.confusion.models.Dish;
import com.vineeth.confusion.repositories.CommentRepository;
import com.vineeth.confusion.repositories.DishRepository;

@Service
public class CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private DishRepository dishRepository;
	
	public List<Comment> getAllComments(Long dishId){
		List<Comment> comments = new ArrayList<>();
		commentRepository.findByDishId(dishId).forEach(comments::add);
		return comments;
		
	}
	
	public Object getComment(Long id) {
		return commentRepository.findById(id);
	}
	
	public void addComment(Long dishId, Comment comment) {
		commentRepository.save(comment);
		dishRepository.findById(dishId).map(dish -> {
			dish.addComment(comment);
			return dishRepository.save(dish);
		});
	}
		
	
	public void deleteComment(Long id) {
		commentRepository.deleteById(id);
	}
}
