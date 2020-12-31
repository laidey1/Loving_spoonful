package com.tts.loving_spoonful.service;

import java.util.List;

import com.tts.loving_spoonful.model.Meal;
import com.tts.loving_spoonful.repository.MealRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MealService {
	@Autowired
	private MealRepository mealRepository;

	public List<Meal> findAllByType(String type){
		List<Meal> meals = mealRepository.findAllByType(type);
		return meals;
	}


}
