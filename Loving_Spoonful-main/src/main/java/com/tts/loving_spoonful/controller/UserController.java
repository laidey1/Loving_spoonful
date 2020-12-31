package com.tts.loving_spoonful.controller;

import com.tts.loving_spoonful.model.User;
import com.tts.loving_spoonful.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping(value = "/user")
	public String getUser(@PathVariable(value = "username") String username, Model model) {
		User loggedInUser = userService.getLoggedInUser();
		User user = userService.findByUsername(username);
		boolean isSelfPage = loggedInUser.getUsername().equals(username);
		model.addAttribute("user", user);
		model.addAttribute("isSelfPage", isSelfPage);
		return "user";
	}
}

