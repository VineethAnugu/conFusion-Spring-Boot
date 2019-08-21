package com.vineeth.confusion.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vineeth.confusion.models.Dish;
import com.vineeth.confusion.repositories.DishRepository;


@Service
public class DishService {
	
	@Autowired
	private DishRepository dishRepository;
	
	
	public List<Dish> getAllDishes(){
		List<Dish> dishes = new ArrayList<Dish>();
		dishRepository.findAll().forEach(dishes::add);
		return dishes;
	}
	
	public Object getDish(Long id) {
		//Optional<Dish> reqDish = dishes.stream().filter(dish -> dish.getId() == id).findFirst();
		return dishRepository.findById(id);
	}
	
	public void addDish(Dish dish) {
		dishRepository.save(dish);
	}

	public Object getDishByName(String name) {
		List<Dish> results = new ArrayList<>();
		dishRepository.findAll().forEach(results::add);
		return results.stream().filter(dish -> dish.getName().equals(name)).findFirst();
	}

	public void deleteDishById(Long id) {
		//dishes.removeIf(dish -> dish.getId() == id);
		dishRepository.deleteById(id);
	}

	public void deleteDishByName(String name) {
		List<Dish> results = new ArrayList<>();
		dishRepository.findAll().forEach(results::add);
		Object reqDish = results.stream().filter(dish -> dish.getName().equals(name)).findFirst();
		dishRepository.delete((Dish) reqDish);
		//dishes.removeIf(dish -> dish.getName().equals(name));
		
	}
}

