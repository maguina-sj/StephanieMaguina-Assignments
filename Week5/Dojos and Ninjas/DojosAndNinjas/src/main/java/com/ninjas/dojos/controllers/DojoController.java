package com.ninjas.dojos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ninjas.dojos.models.Dojo;
import com.ninjas.dojos.services.DojoService;


@Controller
public class DojoController {
	
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("newDojo") Dojo newDojo, Model model) {
		List<Dojo> dojos = dojoService.getAll();
		model.addAttribute("allDojos", dojos);
		return "index.jsp";
	}
	@PostMapping("/dojo/new")
	public String saveDojo(@Valid @ModelAttribute("newDojo") Dojo newDojo, Model model, BindingResult result) {
		if (result.hasErrors()) {
			List<Dojo> dojos = dojoService.getAll();
			model.addAttribute("allDojos", dojos);
			return "index.jsp";
		}
		dojoService.create(newDojo);
		return "redirect:/";
	}
	@GetMapping("/dojo/view/{id}")
	public String viewDojo(@PathVariable Long id, Model model) {
		Dojo dojo = dojoService.findOne(id);
		model.addAttribute("oneDojo", dojo);
		return "viewDojo.jsp";
	}
}
