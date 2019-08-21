package com.vineeth.confusion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vineeth.confusion.models.Dish;
import com.vineeth.confusion.services.DishService;

@RestController
@RequestMapping("/dishes")
public class DishController {

		@Autowired
		private DishService dishService;
		
		@GetMapping
		public List<Dish> getAllDishes(){
			return dishService.getAllDishes();
		}
		
		@GetMapping("/id/{id}")
		public Object getDish(@PathVariable Long id) {
			return dishService.getDish(id);
		}
		
		@GetMapping("/name/{name}")
		public Object getDishByName(@PathVariable String name) {
			return dishService.getDishByName(name);	
		}
		
		@DeleteMapping("/id/{id}")
		public void deleteDishById(@PathVariable Long id) {
			dishService.deleteDishById(id);
		}
		
		@DeleteMapping("/name/{name}")
		public void deleteDishByName(@PathVariable String name) {
			dishService.deleteDishByName(name);
		}
		
		@PostMapping
		public void addDish(@RequestBody Dish dish) {
			dishService.addDish(dish);
		}
		
	}

