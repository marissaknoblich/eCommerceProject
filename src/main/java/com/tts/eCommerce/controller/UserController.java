package com.tts.eCommerce.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tts.eCommerce.model.User;
import com.tts.eCommerce.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setCustomerService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/user/registration")
	public ModelAndView getRegistrationForm() {
		User user = new User();
		return new ModelAndView("register", "user", user);
	}

	// to insert the data
	@RequestMapping(value = "/user/registration", method = RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute(value = "user") User user, Model model,
			BindingResult result) {
		if (result.hasErrors())
			return "register";
		userService.addUser(user);
		model.addAttribute("registrationSuccess", "Registered Successfully. Login using username and password");
		return "login";
	}
}