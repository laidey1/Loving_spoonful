package com.tts.loving_spoonful.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Week {
	
	  ////////////
	 // Fields //
	////////////

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Long user_id;

	private int day;

	private long meal_id;



	  //////////////////
	 // Constructors //
	//////////////////

	public Week() {
	}

	public Week(Long id, Long user_id, int day, long meal_id) {
		this.id = id;
		this.user_id = user_id;
		this.day = day;
		this.meal_id = meal_id;
	}


	
	  ///////////////////////
	 // Getters & Setters //
	///////////////////////

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUser_id() {
		return this.user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public long getMeal_id() {
		return this.meal_id;
	}

	public void setMeal_id(long meal_id) {
		this.meal_id = meal_id;
	}

	
	
	  //////////////
	 // toString //
	//////////////

	@Override
	public String toString() {
		return "{" +
			" id='" + id + "'" +
			", user_id='" + user_id + "'" +
			", day='" + day + "'" +
			", meal_id='" + meal_id + "'" +
			"}";
	}

}
