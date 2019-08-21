package com.vineeth.confusion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vineeth.confusion.models.Comment;
import com.vineeth.confusion.services.CommentService;

@RestController
@RequestMapping("/dishes/{dishId}/comments")
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@GetMapping
	public List<Comment> getAllComments(@PathVariable(value="dishId") Long dishId){
		return commentService.getAllComments(dishId);
	}
	
	@PostMapping
	public void addComment(@PathVariable(value="dishId") Long dishId, @RequestBody Comment comment) {
		commentService.addComment(dishId, comment);
	}
}
