package com.proshanto.springsecurityjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home(){
		return "<h2> Welcome to Home page</h2>";
	}
	@GetMapping("/user")
	public String user(){
		return "<h2> Welcome to user page</h2>";
	}
	@GetMapping("/admin")
	public String admin(){
		return "<h2> Welcome to Admin page</h2>";
	}

}
