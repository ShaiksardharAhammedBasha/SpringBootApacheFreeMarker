package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@GetMapping("/welcome")
	public String hello() {
		return "welcome";
	}
	
	@GetMapping("/teamcity")
	public String teamCity() {
		return "Testing Team City Build Config";
	}

}
