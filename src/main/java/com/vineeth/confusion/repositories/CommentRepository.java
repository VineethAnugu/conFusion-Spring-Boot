package com.vineeth.confusion.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vineeth.confusion.models.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {

	public List<Comment> findByDishId(Long dishId);
}
