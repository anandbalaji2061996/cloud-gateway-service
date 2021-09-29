package com.flightapp.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {
	
	@GetMapping("/user")
	public String user() {
		return "User call Fallback Service";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Admin call Fallback Service";
	}
	
	@GetMapping("/airline")
	public String airline() {
		return "Admin call Fallback Service";
	}

}
