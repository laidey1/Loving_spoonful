package com.tts.loving_spoonful.repository;

import java.util.List;

import com.tts.loving_spoonful.model.Meal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends CrudRepository<Meal, Long> {
	List<Meal> findAllByType(String type);
	

}