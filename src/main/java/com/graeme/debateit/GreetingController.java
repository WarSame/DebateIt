package com.graeme.debateit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GreetingController {
	
	@RequestMapping("/greeting")
	public String getGreeting(Model model, @RequestParam("name") String name) {
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@RequestMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	@RequestMapping("/")
	public String getHome() {
		return "index";
	}
	
}