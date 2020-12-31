package com.tts.loving_spoonful.model;

import javax.persistence.*;

@Entity
public class Role {

      ////////////
     // Fields //
    ////////////

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
	private Long id;
    private String role;


      //////////////////
     // Constructors //
    //////////////////

    public Role() {
    }

    public Role(Long id, String role) {
        this.id = id;
        this.role = role;
    }


      ///////////////////////
     // Getters & Setters //
    ///////////////////////

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Role [id=" + id + ", role=" + role + "]";
    }

}
