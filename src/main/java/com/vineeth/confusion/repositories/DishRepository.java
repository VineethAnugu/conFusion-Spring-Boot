package com.vineeth.confusion.repositories;

import org.springframework.stereotype.Repository;

import com.vineeth.confusion.models.Dish;

import org.springframework.data.repository.CrudRepository;


@Repository
public interface DishRepository extends CrudRepository<Dish, Long> {

	public Dish findByName(String name);
}
