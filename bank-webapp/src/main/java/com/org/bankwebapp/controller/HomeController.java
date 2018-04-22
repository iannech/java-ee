package com.org.bankwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.org.bankwebapp.domain.User;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "/index";
	}
	
	// http GET call to retrieve signup page
	@RequestMapping(value = "/signup", method=RequestMethod.GET)
	public String signup(Model model) {
		User user = new User();
		
		model.addAttribute("user", user);
		
		return "signup";
	}
	
	// method to do sign up
	@RequestMapping(value="signup", method=RequestMethod.POST)
	public void signupPost(@ModelAttribute("user") User user, Model model) {
		
	}
}
