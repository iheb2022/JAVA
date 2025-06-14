package com.daikichi.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String greet() {
		return "Welcome !";
	}
	
	@RequestMapping("/today")
	public String greetTOday() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String greetTomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
}
