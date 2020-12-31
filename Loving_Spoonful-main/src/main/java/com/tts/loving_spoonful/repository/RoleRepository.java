package com.tts.loving_spoonful.repository;

import com.tts.loving_spoonful.model.Role;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByRole(String role);
}
