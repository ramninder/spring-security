package com.ramninder.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		
		return "Spring Security rocks";
		
	}

	@GetMapping("/bye")
	public String bye() {
		
		return "You are logged out";
		
	}
}
