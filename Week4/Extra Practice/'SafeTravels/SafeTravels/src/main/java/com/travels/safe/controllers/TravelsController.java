package com.travels.safe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.travels.safe.models.Travel;
import com.travels.safe.services.TravelService;

@Controller
public class TravelsController {

	@Autowired
	private TravelService travelService;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Travel> travels = travelService.getAll();
		model.addAttribute("allTravels", travels);
		return "index.jsp";
	}
	// add new expense
	@GetMapping("/new")
	public String newExpense(@ModelAttribute("newCost")Travel newCost) {
		return "new.jsp";
	}
	@PostMapping("/create")
	public String createExpense(@ModelAttribute("newCost") Travel newCost) {
		travelService.createExpense(newCost);
		return "redirect:/";
	}
	
}

