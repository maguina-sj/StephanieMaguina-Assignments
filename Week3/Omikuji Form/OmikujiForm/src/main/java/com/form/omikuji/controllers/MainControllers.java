package com.form.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainControllers {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@PostMapping("/processresults")
	public String processResults(
			@RequestParam String first,
			@RequestParam("adj2") String adj2,
			@RequestParam("adj3") String adj3,
			@RequestParam("name") String name,
			@RequestParam("noun") String noun,
			HttpSession session) {
		String formResults = String.format("The %s man entered the %s building to visit a very %s man. Sit down %s can I interest you in any good %s?",first,adj2,adj3,name,noun);
		
		session.setAttribute("formResults", formResults);
		return "redirect:/showresults";
	}
	@GetMapping("/showresults")
	public String results(HttpSession session, Model model) {
		
		String result = (String) session.getAttribute("formResults");
		model.addAttribute("result", result);
		
		return "results.jsp";
	}
}
