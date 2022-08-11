package com.gold.ninjas.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaControllers {

	@GetMapping("/")
	public String index() {
		return "ninja.jsp";
	}
	@PostMapping("/gold" ) 
	public String gold(@RequestParam int farm, @RequestParam int cave, @RequestParam int house, @RequestParam int quest, HttpSession session) {
		int gold = 0;
//		String gameActivities = String.format("You entered a %s and earned %d gold",Stringvariable, intVariable)
//		int farmMin = 10;
//		int farmMax = 20;
//		int farmRand = (int)Math.floor(Math.random()*(farmMax-farmMin+1)+farmMin)
				
//		if (%s == "farm")
//			gold += farmRand;
//		print gameActivities by adding it to model.addAttributes
//		keep it in session so each gameActivity prints one after another
//		   ...repeat 3 more times 
//		(alter the Quest so String either prints earns or takes away gold with an if statement)
		
		
		return "redirect:/ninja.jsp";
	}
}
