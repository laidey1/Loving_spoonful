package com.tts.loving_spoonful.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class User{

	  ////////////
	 // Fields //
	////////////

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long id;
	private String username;
	private String password;
	private int active;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;



	  //////////////////
	 // Constructors //
	//////////////////

	public User() {
	}

	public User(Long id, String username, String password, int active, Set<Role> roles) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.active = active;
		this.roles = roles;
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

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getActive() {
		return this.active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Set<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	
	
	  //////////////
	 // toString //
	//////////////

	@Override
	public String toString() {
		return "{" +
			" id='" + id + "'" +
			", username='" + username + "'" +
			", password='" + password + "'" +
			", active='" + active + "'" +
			", roles='" + roles + "'" +
			"}";
	}

}