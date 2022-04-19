package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class RESTController {

	// http://localhost:8080/
	@RequestMapping("/")
	public String index() {
		return "Hello Spring";
	}
	// http://localhost:8080/welcome
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring Boot!";
	}
	//Path variable
	// http://localhost:8080/welcome/{student}
	@RequestMapping("/welcome/{student}")
	public String welcomeStudent(@PathVariable String student) {
		return "Welcome to Spring Boot! " + student;		
	}
	// Request Param (most of the time these come from forms)
	// http://localhost:8080/welcome?student=Josh&stack=MERN
	@RequestMapping("/codingdojo")
	public String codingDojo(@RequestParam String student, String stack) {
		return String.format("Welcome %s, to %s", student,stack );
	}
}
